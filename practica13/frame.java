package practica13;

import javax.swing.JFrame;
import java.awt.*;
public class frame extends JFrame{
    public frame(){
        super("Diagnostico");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(new GridLayout(2, 4));
        CheckBuit cb = new CheckBuit();
        this.add(cb);
        PanelRadioButton rb = new PanelRadioButton();
        this.add(rb);
        EventosCheck c = new EventosCheck();
        CheckBuit.diagnostico.addActionListener(c);
        PanelRadioButton.ninguna.addActionListener(c);
    }
}