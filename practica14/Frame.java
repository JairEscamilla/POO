package practica14;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
import practica13.PanelRadioButton;

public class Frame extends JFrame{
    public Frame(){
        super("Ecuacion cuadratica");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(2, 2));
        Informacion info = new Informacion();
        this.add(info);
        PanelRadioButton rb = new PanelRadioButton();
        this.add(rb);
        Eventos ln = new Eventos();
        practica13.PanelRadioButton.ninguna.addActionListener(ln);
        practica13.PanelRadioButton.media.addActionListener(ln);
        practica13.PanelRadioButton.mucha.addActionListener(ln);
    }
}