package moneycalculator.exchanger.swing;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class AmountPanel extends JPanel {

    public AmountPanel() {
        add(createTextField());
    }

    private JTextField createTextField() {
        JTextField textField = new JTextField(7);
        return textField;
    }

}
