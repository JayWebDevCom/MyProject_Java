package overriding;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JFrame {
    public static void main(String[] args) {
        new Drawing();
    }

    public Drawing(){
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(50, 50, 100, 25);
        g.setColor(new Color(0, 0, 255));
        g.fillRect(50, 200, 100, 25);
        g.drawString("A word", 250, 250);
    }
}
