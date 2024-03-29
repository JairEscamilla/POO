package p15;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import bd.Conectar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Eventos implements ActionListener{
    public ArrayList<Paciente> lista = new ArrayList<>();
    PrintWriter pw;
    Conexion con = new Conexion();
    public void actionPerformed(ActionEvent action){
        if(action.getSource() == frame.registro){
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            try {
                Calendar fecha = new GregorianCalendar();
                int year= fecha.get(Calendar.YEAR);
                boolean errores[] = new boolean[8];
                String validaciones[] = {"Ha ingresado mal el apellido materno del médico", "Ha ingresado mal el apellido paterno del médico", "Ha ingresado mal el nombre del médico", "Ha ingresado mal el apellido materno del paciente", "Ha ingresado mal el apellido paterno del paciente", "Ha ingresado mal el nombre del paciente", "Ha ingresado mal la delegacion del paciente", "Ha ingresado mal el estado del paciente"};
                String apMat, apPat, nom, apPatPac, apMatPac, nomPac, calle, delegacion, estadoPac;
                int dd, mm, aa, edad, ddP, mmP, aaP, numEx, numInt, cp, zona, telFijo, telMovil, time, sexo = 0, estadoCivil = 0, estudios = 0, counter = 0, leer = 0, escribir = 0, ocupacion = 0, counter2 = 0, religion = 0, counter3 = 0;
                apMat = frame.apMat.getText().toString();
                apPat = frame.apPat.getText().toString();
                nom = frame.nomMedico.getText().toString();
                errores[0] = validaCaracteres(apMat);
                System.out.println(errores[0]);
                errores[1] = validaCaracteres(apPat);
                errores[2] = validaCaracteres(nom);
                //dd = Integer.parseInt(frame.dd.getText().toString());
                //mm = Integer.parseInt(frame.mm.getText().toString());
                //aa = Integer.parseInt(frame.aa.getText().toString());
                apMatPac = frame.apMatPac.getText().toString();
                apPatPac = frame.apPatPac.getText().toString();
                nomPac = frame.nomPac.getText().toString();
                errores[3] = validaCaracteres(apMatPac);
                errores[4] = validaCaracteres(apPatPac);
                errores[5] = validaCaracteres(nomPac);
                //edad = Integer.parseInt(frame.edad.getText().toString());
                ddP = Integer.parseInt(frame.ddP.getText().toString());
                mmP = Integer.parseInt(frame.mmP.getText().toString());
                aaP = Integer.parseInt(frame.aaP.getText().toString());
                if((ddP <= 0 || ddP >= 30) || (mmP <= 0 || mmP > 12) || aaP < 1900){
                    JOptionPane.showMessageDialog(null, "Debes ingresar una fecha valida y un año mayor a 1900", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                calle = frame.calle.getText().toString();
                numEx = Integer.parseInt(frame.numEx.getText().toString());
                numInt = Integer.parseInt(frame.numInt.getText().toString());
                zona = Integer.parseInt(frame.zona.getText().toString());
                cp = Integer.parseInt(frame.cp.getText().toString());
                if(frame.cp.getText().toString().length() != 5){
                    JOptionPane.showMessageDialog(null, "El código postal debe contener 5 digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                delegacion = frame.delegacion.getText().toString();
                errores[6] = validaCaracteres(delegacion);
                telFijo = Integer.parseInt(frame.telFijo.getText().toString());
                telMovil = Integer.parseInt(frame.telMovil.getText().toString());
                if(frame.telFijo.getText().toString().length() != 8 || frame.telMovil.getText().toString().length() != 8){
                    JOptionPane.showMessageDialog(null, "Los numeros telefonicos deben de ser de 8 digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                time = Integer.parseInt(frame.time.getText().toString());
                estadoPac = frame.estadoPac.getText().toString();
                errores[7] = validaCaracteres(estadoPac);
                if(frame.r1.isSelected())
                    sexo = 0;
                if(frame.r2.isSelected())
                    sexo = 1;
                if(frame.casado.isSelected())
                    estadoCivil = 0;
                if(frame.ulibre.isSelected())
                    estadoCivil = 1;
                if(frame.soltero.isSelected())
                    estadoCivil = 2;
                if(frame.separado.isSelected())
                    estadoCivil = 3;
                if(frame.divorciado.isSelected())
                    estadoCivil = 4;
                if(frame.viudo.isSelected())
                    estadoCivil = 5;
                if(frame.nsabe.isSelected())
                    estadoCivil = 6;
                if(frame.noEst.isSelected())
                    estudios = 0;
                counter++;
                for(int i = 0; i < 6; i++){
                    if(frame.primaria[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                for(int i = 0; i < 3; i++){
                    if(frame.secundaria[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                for(int i = 0; i < 3; i++){
                    if(frame.prepa[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                for(int i = 0; i < 6; i++){
                    if(frame.licenciatura[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                for(int i = 0; i < 7; i++){
                    if(frame.postgrado[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                if(frame.ly.isSelected())
                    leer = 0;
                if(frame.ln.isSelected())
                    leer = 1;
                if(frame.ey.isSelected())
                    escribir = 0;
                if(frame.en.isSelected())
                    escribir = 1;
                for(int i = 0; i < 6; i++){
                    if(frame.ocupacion[i].isSelected())
                        ocupacion = counter2;
                    counter2++;
                }
                for(int i = 0; i < 4; i++){
                    if(frame.rels[i].isSelected())
                        religion = counter3;
                    counter3++;
                }
                boolean e = false;
                for(int i = 0; i < errores.length; i++){
                    if(errores[i])
                        e = true;
                }
                if((year - aaP) < 60){
                    JOptionPane.showMessageDialog(null, "Debes tener al menos 60 años", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(aaP > year){
                    JOptionPane.showMessageDialog(null, "No se puede tener esta fecha", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                }
                if(!e){
                    pw = new PrintWriter("datos.txt");
                    Paciente pac = new Paciente(nomPac, apPatPac, apMatPac, telFijo, telMovil, sexo, estadoCivil, estudios, leer, escribir, ocupacion, year - aaP, fecha, nom, apMat, apPat, time, estadoPac, religion, ddP, mmP, aaP, year - aaP, cp, calle, numEx, numInt, zona, delegacion);
                    con.getConnection();
                    con.InsertarRegistros(pac);
                    lista.add(pac);
                    for(Paciente iterador: lista){
                        //System.out.println(iterador);
                        pw.println(iterador.toString());
                    }
                    pw.close();
                        
                    JOptionPane.showMessageDialog(null, "Se ha hecho el registro de manera correcta", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ingresado mal alguno de sus datos que solo pueden tener caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha introducido mal alguno de sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }
    }
    private boolean validaCaracteres(String cadena){
        boolean error = false;
        for(int i = 0; i < cadena.length(); i++){
            if(((int)cadena.charAt(i) >= 65 && (int)cadena.charAt(i) <= 90) || ((int)cadena.charAt(i) >= 97 && (int)cadena.charAt(i) <= 122)){
                error = false;
            }
            else{
                error =  true;
                break;
            } 
        }
        return error;
    }
}