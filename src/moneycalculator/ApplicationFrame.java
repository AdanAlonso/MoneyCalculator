package moneycalculator;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculator.command.ActionListenerFactory;
import moneycalculator.currency.Currency;
import moneycalculator.currency.CurrencySet;

public class ApplicationFrame extends JFrame {

    private final ActionListenerFactory factory;
    private JTextField amount;
    private JComboBox currencyFrom;
    private JComboBox currencyTo;
    private JLabel result;
    private String[] currencies;

    public ApplicationFrame(ActionListenerFactory factory) throws HeadlessException {
        setTitle("Money Calculator");
        setSize(500, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.factory = factory;
        getCurrencies();
        createComponents();
        setResizable(false);
        setVisible(true);
    }

    private void createComponents() {
        add(createMainPanel(), BorderLayout.NORTH);
        add(createResultLabel(), BorderLayout.CENTER);
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createMainPanel() {
        JPanel panel = new JPanel();
        panel.add(createAmountTextField());
        panel.add(createCurrencyFromComboBox());
        panel.add(createCurrencyToComboBox());
        return panel;
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel();
        panel.add(createExchangeButton());
        panel.add(createExitButton());
        return panel;
    }

    private JTextField createAmountTextField() {
        JTextField textField = new JTextField(10);
        amount = textField;
        return textField;
    }

    private JComboBox createCurrencyFromComboBox() {
        JComboBox comboBox = new JComboBox(currencies);
        comboBox.setSelectedItem("EUR");
        currencyFrom = comboBox;
        return comboBox;
    }

    private JComboBox createCurrencyToComboBox() {
        JComboBox comboBox = new JComboBox(currencies);
        comboBox.setSelectedItem("EUR");
        currencyTo = comboBox;
        return comboBox;
    }

    private JLabel createResultLabel() {
        JLabel label = new JLabel();
        result = label;
        return label;
    }

    private JButton createExchangeButton() {
        JButton button = new JButton("Exchange");
        button.addActionListener(factory.createActionListener("exchange"));
        return button;
    }

    private JButton createExitButton() {
        JButton button = new JButton("Exit");
        button.addActionListener(factory.createActionListener("exit"));
        return button;
    }

    public JTextField getAmount() {
        return amount;
    }

    public JComboBox getCurrencyFrom() {
        return currencyFrom;
    }

    public JComboBox getCurrencyTo() {
        return currencyTo;
    }

    public JLabel getResult() {
        return result;
    }

    private void getCurrencies() {
        ArrayList<String> currencyList = new ArrayList<>();
        for (Currency currency : CurrencySet.getInstance()) {
            currencyList.add(currency.getCode());
        }
        currencies = currencyList.toArray(new String[0]);
    }
}
