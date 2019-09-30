package practica13;
import javax.swing.*;
enum caracteristica{
    MAYORPESO, FRECUENCIAALTA, MAYORTREINTA;
}

public class CheckBuit extends JPanel{
    static JLabel texto1;
    static JCheckBox mayorPeso, frecuenciaAlta, mayorEdad;
    static JButton diagnostico;
    public CheckBuit(){
        setLayout(null);
        texto1 = new JLabel("Selecciona opciones ", SwingConstants.CENTER);
        texto1.setBounds(190, 22, 190, 25);
        this.add(texto1);
        mayorPeso = new JCheckBox("Obesidad");
        mayorPeso.setBounds(70, 70, 120, 25);
        frecuenciaAlta = new JCheckBox("frecuenciaAlta");
        frecuenciaAlta.setBounds(190, 70, 120, 25);
        mayorEdad = new JCheckBox("mayor Treinta");
        mayorEdad.setBounds(320, 70, 120, 25);
        this.add(mayorPeso);
        this.add(frecuenciaAlta);
        this.add(mayorEdad);
        diagnostico = new JButton("Diagnostico");
        diagnostico.setBounds(200, 110, 120, 25);
        this.add(diagnostico);
    }
}