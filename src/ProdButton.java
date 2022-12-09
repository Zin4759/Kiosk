import javax.swing.*;
import java.awt.*;

public class ProdButton extends JButton {
    private int price;
    private int click;
    private String title;

    ProdButton (int price, String str){
        this.price = price;
        this.title = str;
        this.setText(this.title);
        this.setPreferredSize(new Dimension(150, 50));
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

}
