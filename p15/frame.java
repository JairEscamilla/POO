package p15;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Image;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class frame extends JFrame{
    public static JTextField apPat, apMat, nomMedico, dd, mm, aa, apPatPac, apMatPac, nomPac, edad, ddP, mmP, aaP, calle, numEx, numInt, cp, zona, delegacion, telFijo, telMovil, time, estadoPac;
    public static JRadioButton r1, r2, casado, ulibre, soltero, separado, divorciado, viudo, nsabe, noEst;
    public static JRadioButton primaria[] = new JRadioButton[6], secundaria[] = new JRadioButton[3], prepa[] = new JRadioButton[3], licenciatura[] = new JRadioButton[6], postgrado[] = new JRadioButton[7], ly, ln, ey, en, ocupacion[] = new JRadioButton[6], rels[] = new JRadioButton[4];
    public static JButton registro;
    public frame(){
        super("Formulario de registro");
        setSize(1080, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);  
        setLayout(null);   
        datosEncuestador();
        CedulaPaciente();
        mas_datos();
        more_data();
        estPac();
        estadoCivil();
        nivelEstudios();
        lectesc();
        ocupacion();
        religion();
        registro =  new JButton();
        registro.setBounds(830, 560, 200, 51);
        registro.setIcon(new ImageIcon(getClass().getResource("boton-registro.png")));
        this.add(registro);
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
    private void CedulaPaciente(){
        JLabel superior, nombre, sexo;
        superior = new JLabel("B. CÉDULA DE IDENTIFICACIÓN DEL PACIENTE");
        superior.setFont(new java.awt.Font("Umpush Regular", 1, 20));
        superior.setBounds(10, 100, 600, 50);
        this.add(superior);
        nombre = new JLabel("Nombre del paciente:");
        nombre.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        nombre.setBounds(10, 160, 400, 20);
        this.add(nombre);
        apPatPac = new JTextField("Apellido paterno");
        apPatPac.setBounds(200, 162, 130, 20);
        this.add(apPatPac);
        apMatPac = new JTextField("Apellido materno");
        apMatPac.setBounds(345, 162, 130, 20);
        this.add(apMatPac);
        nomPac = new JTextField("Nombre(s)");
        nomPac.setBounds(490, 162, 130, 20);
        this.add(nomPac);
        sexo = new JLabel("Sexo: ");
        sexo.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        sexo.setBounds(640, 160, 130, 20);
        this.add(sexo);
        r1 = new JRadioButton("Hombre");
        r2 = new JRadioButton("Mujer");
        ButtonGroup g1 = new ButtonGroup();
        g1.add(r1);
        g1.add(r2);
        r1.setBounds(700, 160, 100, 20);
        r2.setBounds(800, 160, 100, 20);
        this.add(r1);
        this.add(r2);
        edad = new JTextField("Edad");
        edad.setBounds(900, 160, 130 , 20);
        this.add(edad);
    }
    private void mas_datos(){
        JLabel fecnac, s1, s2, direccion, telF;
        fecnac = new JLabel("Fecha de nacimiento: ");
        fecnac.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        fecnac.setBounds(10, 200, 180, 20);
        this.add(fecnac);
        ddP = new JTextField("dd", 1);
        ddP.setBounds(200, 200, 30, 20);
        this.add(ddP);
        s1 = new JLabel("/");
        s1.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        s1.setBounds(233, 199, 30, 20);
        this.add(s1);
        mmP = new JTextField("mm", 1);
        mmP.setBounds(245, 200, 30, 20);
        this.add(mmP);
        s2 = new JLabel("/");
        s2.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        s2.setBounds(280, 199, 30, 20);
        this.add(s2);
        aaP = new JTextField("aa", 1);
        aaP.setBounds(295, 200, 30, 20);
        this.add(aaP);
        direccion = new JLabel("Direccion: ");
        direccion.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        direccion.setBounds(343, 199, 130, 20);
        this.add(direccion);
        calle = new JTextField("Calle", 2);
        calle.setBounds(430, 199, 80, 20);
        this.add(calle);
        numEx = new JTextField("Num. Ext", 2);
        numEx.setBounds(520, 199, 60, 20);
        this.add(numEx);
        numInt = new JTextField("Num. Int", 2);
        numInt.setBounds(590, 199, 60, 20);
        this.add(numInt);
        cp = new JTextField("C. P", 2);
        cp.setBounds(660, 199, 30, 20);
        this.add(cp);
        zona = new JTextField("Zona", 2);
        zona.setBounds(700, 199, 60, 20);
        this.add(zona);
        delegacion = new JTextField("Delegación/Municipio", 2);
        delegacion.setBounds(770, 199, 120, 20);
        this.add(delegacion);
        telF = new JLabel("Tel. fijo: ");
        telF.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        telF.setBounds(10, 240, 120, 20);
        this.add(telF);
    }
    private void more_data(){
        JLabel telM, tiempo;
        telFijo = new JTextField("Teléfono fijo", 3);
        telFijo.setBounds(86, 240, 120, 20);
        this.add(telFijo);
        telM = new JLabel("Teléfono móvil: ");
        telM.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        telM.setBounds(220, 240, 140, 20);
        this.add(telM);
        telMovil = new JTextField("Teléfono móvil", 3);
        telMovil.setBounds(360, 240, 140, 20);
        this.add(telMovil);
        tiempo = new JLabel("¿Cuánto tiempo lleva viviendo en este domicilio?");
        tiempo.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        tiempo.setBounds(520, 240, 480, 20);
        this.add(tiempo);
        time = new JTextField("tiempo", 2);
        time.setBounds(950, 240, 80, 20);
        this.add(time);
    }
    private void estPac(){
        JLabel estadoP;
        estadoP = new JLabel("Estado o entidad federativa de origen: ");
        estadoP.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        estadoP.setBounds(10, 280, 390, 20);
        this.add(estadoP);
        estadoPac = new JTextField("Estado de origen", 3);
        estadoPac.setBounds(350, 280, 150, 20);
        this.add(estadoPac);
    }
    private void estadoCivil(){
        JLabel est = new JLabel("Estado civil: ");
        ButtonGroup g1;
        est.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        est.setBounds(10, 320, 130, 20);
        this.add(est);
        casado = new JRadioButton("Casado");
        ulibre = new JRadioButton("Unión libre");
        soltero = new JRadioButton("Soltero");
        separado = new JRadioButton("Separado");
        divorciado = new JRadioButton("Divorciado");
        viudo = new JRadioButton("Viudo");
        nsabe = new JRadioButton("No sabe/ No responde");
        g1 = new ButtonGroup();
        g1.add(casado);
        g1.add(ulibre);
        g1.add(soltero);
        g1.add(separado);
        g1.add(divorciado);
        g1.add(viudo);
        g1.add(nsabe);
        casado.setBounds(130, 320, 80, 20);
        this.add(casado);
        soltero.setBounds(210, 320, 80, 20);
        this.add(soltero);
        ulibre.setBounds(290, 320, 110, 20);
        this.add(ulibre);
        separado.setBounds(400, 320, 100, 20);
        this.add(separado);
        divorciado.setBounds(500, 320, 100, 20);
        this.add(divorciado);
        viudo.setBounds(320, 320, 100, 20);
        this.add(viudo);
        nsabe.setBounds(610, 320, 300, 20);
        this.add(nsabe);
    }
    private void nivelEstudios(){
        JLabel pregunta, ne, prim, sec, prep, lic, pos;
        ButtonGroup g1 = new ButtonGroup();
        pregunta = new JLabel("¿Qué nivel de estudios tiene?");
        pregunta.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        pregunta.setBounds(10, 370, 300, 20);
        this.add(pregunta);
        ne = new JLabel("No estudió: ");
        ne.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        ne.setBounds(10, 400, 300, 20);
        this.add(ne);
        noEst = new JRadioButton("0");
        noEst.setBounds(120, 400, 50, 20);
        this.add(noEst);
        g1.add(noEst);
        prim = new JLabel("Primaria en años: ");
        prim.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        prim.setBounds(170, 400, 300, 20);
        this.add(prim);
        for(int i = 0; i < 6; i++){
            primaria[i] = new  JRadioButton(Integer.toString(i + 1));
            primaria[i].setBounds(330+i*50, 400, 50, 20);
            g1.add(primaria[i]);
            this.add(primaria[i]);
        }
        sec = new JLabel("Secundaria en años: ");
        sec.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        sec.setBounds(630, 400, 300, 20);
        this.add(sec);
        for(int i = 0; i < 3; i++){
            secundaria[i] = new JRadioButton(Integer.toString(i + 7));
            secundaria[i].setBounds(820+i*50, 400, 50, 20);
            g1.add(secundaria[i]);
            this.add(secundaria[i]);
        }
        prep = new JLabel("Preparatoria en años: ");
        prep.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        prep.setBounds(10, 440, 300, 20);
        this.add(prep);
        for(int i = 0; i < 3; i++){
            prepa[i] = new JRadioButton(Integer.toString(i + 10));
            prepa[i].setBounds(200+i*50, 440, 50, 20);
            g1.add(prepa[i]);
            this.add(prepa[i]);
        }
        lic = new JLabel("Licenciatura en años: ");
        lic.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        lic.setBounds(370, 440, 300, 20);
        this.add(lic);
        for(int i = 0; i < 6; i++){
            licenciatura[i] = new JRadioButton(Integer.toString(i + 13));
            licenciatura[i].setBounds(560+i*50, 440, 50, 20);
            g1.add(licenciatura[i]);
            this.add(licenciatura[i]);
        }
        pos = new JLabel("Postgrado en años: ");
        pos.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        pos.setBounds(10, 480, 300, 20);
        this.add(pos);
        for(int i = 0; i < 7; i++){
            postgrado[i] = new JRadioButton(Integer.toString(i + 19));
            postgrado[i].setBounds(130+i*50, 480, 50, 20);
            g1.add(postgrado[i]);
            this.add(postgrado[i]);
        }
    }
    private void lectesc(){
        JLabel leer, escribir;
        ButtonGroup g1 = new ButtonGroup();
        ButtonGroup g2 = new ButtonGroup();
        leer = new JLabel("¿Sabe leer?");
        leer.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        leer.setBounds(500, 480, 100, 20);
        this.add(leer);
        ly = new JRadioButton("Si");
        ln = new JRadioButton("No");
        g1.add(ly);
        g1.add(ln);
        ly.setBounds(610, 480, 50, 20);
        ln.setBounds(660, 480, 50, 20);
        this.add(ly);
        this.add(ln);
        escribir = new JLabel("¿Sabe escribir?");
        escribir.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        escribir.setBounds(720, 480, 200, 20);
        this.add(escribir);
        ey = new JRadioButton("Si");
        en = new JRadioButton("No");
        g2.add(ey);
        g2.add(en);
        ey.setBounds(870, 480, 50, 20);
        en.setBounds(920, 480, 50, 20);
        this.add(ey);
        this.add(en);
    }
    private void ocupacion(){
        JLabel oc = new JLabel("Ocupación actual: ");
        ButtonGroup g1 = new ButtonGroup();
        String titles[] = {"0. Desempleado.", "1. Jubilado(a) s/p.", "2. Jubilado(a) c/p", "3. Freelancer.", "4. Patrón(a).", "5. Ama de casa"};
        oc.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        oc.setBounds(10, 520, 300, 20);
        this.add(oc);
        for(int i = 0; i < 6; i++){
            ocupacion[i] = new  JRadioButton(titles[i]);
            ocupacion[i].setBounds(180+i*150, 520, 150, 20);
            g1.add(ocupacion[i]);
            this.add(ocupacion[i]);
        }
    }
    private void religion(){
        JLabel lbl = new JLabel("Religión: ");
        String religiones[] = {"0. Ninguna.", "1. Católica.", "2. Cristiana.", "3. Judio."};
        ButtonGroup g1 = new ButtonGroup();
        lbl.setFont(new java.awt.Font("Umpush Regular", 1, 15));
        lbl.setBounds(10, 560, 100, 20);
        this.add(lbl);
        for(int i = 0; i < 4; i++){
            rels[i] = new  JRadioButton(religiones[i]);
            rels[i].setBounds(100+i*150, 560, 150, 20);
            g1.add(rels[i]);
            this.add(rels[i]);
        }
    }
}   