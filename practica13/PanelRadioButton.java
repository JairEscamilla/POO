package practica13;
import javax.swing.*;
import java.awt.*;

public class PanelRadioButton extends JPanel{
    public static JRadioButton ninguna, media, mucha;
    public PanelRadioButton(){
        setLayout(new GridLayout(1, 3));
        ninguna = new JRadioButton("Integral");
        media = new JRadioButton("Evaluar");
        mucha = new JRadioButton("T. evaluacion");
        // Esto es para seleccionar solamente un boton a la vez
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(ninguna);
        grupo1.add(media);
        grupo1.add(mucha);
        this.add(ninguna);
        this.add(media);
        this.add(mucha);

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Seleccione alguna opcion: "));
        
    }
}   