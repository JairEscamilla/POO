package practica14;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
import javax.swing.JPanel;
import practica13.PanelRadioButton;
import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.Color;

public class Frame extends JFrame{
    static JPanel panelTable;
    static String datos[][];
    static String columnNames[] = { "x", "y" };
    static JTable tabla;
    public Frame(){
        super("Ecuacion cuadratica");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(3, 2));
        Informacion info = new Informacion();
        this.add(info);
        PanelRadioButton rb = new PanelRadioButton();
        this.add(rb);
        Eventos ln = new Eventos();
        practica13.PanelRadioButton.ninguna.addActionListener(ln);
        practica13.PanelRadioButton.media.addActionListener(ln);
        practica13.PanelRadioButton.mucha.addActionListener(ln);
        panelTable = new JPanel();
        panelTable.setBackground(new Color(3, 169, 244));
        panelTable.setLayout(new BorderLayout());
        this.add(panelTable);
    }
}