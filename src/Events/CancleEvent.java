package Events;

import Classes.ValueArea;
import Buttons.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancleEvent implements ActionListener {
    private CancelButton cancelButton;
    private ValueArea valueArea;

    public CancleEvent(CancelButton c, ValueArea v){
        this.cancelButton = c;
        this.valueArea = v;
        this.valueArea.setEditable(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.cancelButton = (CancelButton) e.getSource();
        this.valueArea.setZeroPrice();
        this.valueArea.setEditable(false);
        //System.out.println(valueArea.getTotalPrice());
    }
}
