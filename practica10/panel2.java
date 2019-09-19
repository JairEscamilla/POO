package practica10;

import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel2 extends JPanel {
    public panel2() {
        /*setSize(100, 100);
        setBackground(Color.yellow);
        JLabel etiqueta = new JLabel("Nombre: ");
        etiqueta.setToolTipText("Nombre del usuario: ");
        JTextField texto = new JTextField(10);

        JButton boton = new JButton("Aceptar");
        setLayout(new FlowLayout());
        this.add(etiqueta);
        this.add(texto);
        this.add(boton);*/
        botones bns = new botones();
        JButton bt = new JButton("B2");
        panel1 pn = new panel1();
        setLayout(new GridLayout(1, 3));
        this.add(bns);
        this.add(bt);
        this.add(pn);
    }
}