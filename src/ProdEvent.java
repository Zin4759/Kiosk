import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProdEvent implements ActionListener {
    private ProdButton prodButton;
    private ValueArea valueArea;
    ProdEvent(ProdButton p, ValueArea v){
        v.setEditable(true);
        this.prodButton = p;
        this.valueArea = v;
        this.valueArea.setEditable(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.prodButton = (ProdButton) e.getSource();
        this.prodButton.setClick(this.prodButton.getClick()+1);
        this.valueArea.setTotalPrice(this.prodButton.getPrice());
        this.valueArea.setEditable(false);
    }
}
