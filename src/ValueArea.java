import javax.swing.*;

public class ValueArea extends JTextArea {
    private int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int price) {
        totalPrice = totalPrice + price;
        this.setText("총 금액:"+String.valueOf(totalPrice)+"원");
    }

    public void setZeroPrice(){
        totalPrice = 0;
        this.setText("총 금액:"+String.valueOf(totalPrice)+"원");
    }

    @Override
    public void setEditable(boolean b) {
        super.setEditable(b);
    }

    @Override
    public void setText(String t) {
        super.setText(t);
    }
}
