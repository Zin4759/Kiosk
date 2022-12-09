import javax.swing.*;
import java.awt.*;

public class BackGround extends JFrame {
    BackGround(){
        ValueArea valueArea = new ValueArea();
        valueArea.setEditable(false);
        String[] titles = new String[]{"대학생 4000원", "일반인 5000원", "선택 취소", "결제"};
        int[] price = new int[4];
        price[0] = 4000;
        price[1] = 5000;

        valueArea.setEditable(false);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Kiosk SoftWare");

        JPanel up_panel = new JPanel();
        JPanel center_panel = new JPanel();
        JPanel down_panel = new JPanel();

        ProdButton button0 = new ProdButton(price[0], titles[0]);
        ProdButton button1 = new ProdButton(price[1], titles[1]);
        CancelButton cancelButton = new CancelButton(titles[2]);
        PayButton payButton = new PayButton(titles[3]);

        up_panel.add(button0);
        up_panel.add(button1);
        center_panel.add(cancelButton);
        center_panel.add(payButton);
        down_panel.add(valueArea);
        this.add(up_panel, BorderLayout.NORTH);
        this.add(center_panel, BorderLayout.CENTER);
        this.add(down_panel, BorderLayout.SOUTH);


        ProdEvent prodEvent0 = new ProdEvent(button0, valueArea);
        ProdEvent prodEvent1 = new ProdEvent(button1, valueArea);
        CancleEvent cancleEvent = new CancleEvent(cancelButton, valueArea);
        button0.addActionListener(prodEvent0);
        button1.addActionListener(prodEvent1);
        cancelButton.addActionListener(cancleEvent);

        setVisible(true);
    }
}
