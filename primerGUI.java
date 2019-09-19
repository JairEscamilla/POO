import javax.swing.JFrame;

public class primerGUI extends JFrame{
    public primerGUI(){
        super("Titulo de ventana");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 300);
        setResizable(false);
    }
}