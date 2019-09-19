package practica10;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.*;
import practica10.botones;
import practica10.panel1;

public class interfaz extends JFrame{
    public interfaz(){
        super("Titulo de ventana");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 300);
        setResizable(true);
        panel1 pn = new panel1();
        panel2 pn2 = new panel2();
        panel3 pn3 = new panel3();
        botones btns = new botones();

        setLayout(new GridLayout(4, 1));
        this.add(pn);
        this.add(pn2);
        this.add(pn3);
        this.add(btns);
        /*botones btns = new botones();
        JButton btn = new JButton("B2");
        this.add(btn);
        this.add(btns);*/
    }
}