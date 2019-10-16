package p15;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame extends JFrame{
    public static JTextField apPat, apMat, nomMedico, dd, mm, aa;
    public frame(){
        super("Formulario de registro");
        setSize(1100, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);  
        setLayout(null);   
        datosEncuestador();
    }
    private  void datosEncuestador(){
        JLabel nombre, medico, date, s1, s2;
        nombre = new JLabel("A. DATOS DE IDENTIFICACIÓN DEL ENCUESTADOR");   
        nombre.setFont(new java.awt.Font("Umpush Regular", 1, 20));
        nombre.setBounds(10, 0, 600, 50);
        this.add(nombre);
        medico =  new JLabel("Nombre del médico y/o nutriologo: ");
        medico.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        medico.setBounds(10, 50, 600, 50);
        this.add(medico);
        apPat = new JTextField("Apellido paterno", 3);
        apPat.setBounds(310, 68, 130, 20);
        this.add(apPat);
        apMat = new JTextField("Apellido materno", 3);
        apMat.setBounds(450, 68, 130, 20);
        this.add(apMat);
        nomMedico = new JTextField("Nombre(s)", 3);
        nomMedico.setBounds(590, 68, 130, 20);
        this.add(nomMedico);
        date = new JLabel("Fecha de evaluación: ");
        date.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        date.setBounds(730, 50, 600, 50);
        this.add(date);
        dd = new JTextField("dd", 1);
        dd.setBounds(910, 65, 30, 20);
        this.add(dd);
        s1 = new JLabel("/");
        s1.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        s1.setBounds(943, 63, 50, 20);
        this.add(s1);

        mm = new JTextField("mm", 1);
        mm.setBounds(955, 65, 30, 20);
        this.add(mm);
        s2 = new JLabel("/");
        s2.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        s2.setBounds(990, 63, 50, 20);
        this.add(s2);
        aa = new JTextField("aa", 1);
        aa.setBounds(1005, 65, 30, 20);
        this.add(aa);
    }
}   