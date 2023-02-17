package Buttons;

import javax.swing.*;

public class CancelButton extends JButton {
    public CancelButton(String str){
        setSize(150, 50);
        setText(str);
    }
    @Override
    public void setText(String text) {
        super.setText(text);
    }
}
