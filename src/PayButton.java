import javax.swing.*;

public class PayButton extends JButton {
    PayButton(String str) {
        setText(str);
        setSize(150, 50);
    }
    @Override
    public void setText(String text) {
        super.setText(text);
    }
}
