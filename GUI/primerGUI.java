package GUI;

import javax.swing.JFrame;

import GUI.ExFlow;
import GUI.primerPanel;

public class primerGUI extends JFrame{
    public primerGUI(){
        super("Titulo de ventana");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 300);
        setResizable(true);
        primerPanel panel2 = new primerPanel();
        this.add(panel2);
        ExFlow panel1 = new ExFlow();
        this.add(panel1);
        
    }
}