import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayEvent implements ActionListener {
    private PayButton payButton;
    PayEvent(PayButton p){
        this.payButton = p;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
