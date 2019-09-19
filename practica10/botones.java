package practica10;
import java.awt.*;

import javax.swing.*;
public class botones extends JPanel{
    public botones(){
        setSize(600, 200);
        JButton bn1 = new JButton("Iz");
        JButton bn2 = new JButton("right");
        JButton bn3 = new JButton("top");
        JButton bn4 = new JButton("bottom");
        JButton bn5 = new JButton("center");
        setLayout(new BorderLayout(5, 2));
        this.add(bn1, BorderLayout.WEST);
        this.add(bn2, BorderLayout.EAST);
        this.add(bn3, BorderLayout.NORTH);
        this.add(bn4, BorderLayout.SOUTH);
        this.add(bn5, BorderLayout.CENTER);
    }
}