package Buttons;

import javax.swing.*;

public class PayButton extends JButton {
    public PayButton(String str) {
        setText(str);
        setSize(150, 50);
    }
    @Override
    public void setText(String text) {
        super.setText(text);
    }
}
