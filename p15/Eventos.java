package p15;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent action){
        if(action.getSource() == frame.registro){
            try {
                boolean errores[] = new boolean[8];
                String validaciones[] = {"Ha ingresado mal el apellido materno del médico", "Ha ingresado mal el apellido paterno del médico", "Ha ingresado mal el nombre del médico", "Ha ingresado mal el apellido materno del paciente", "Ha ingresado mal el apellido paterno del paciente", "Ha ingresado mal el nombre del paciente", "Ha ingresado mal la delegacion del paciente", "Ha ingresado mal el estado del paciente"};
                String apMat, apPat, nom, apPatPac, apMatPac, nomPac, calle, delegacion, estadoPac;
                int dd, mm, aa, edad, ddP, mmP, aaP, numEx, numInt, cp, zona, telFijo, telMovil, time, sexo, estadoCivil, estudios, counter = 0, leer, escribir, ocupacion, counter2 = 0, religion, counter3 = 0;
                apMat = frame.apMat.getText().toString();
                apPat = frame.apPat.getText().toString();
                nom = frame.nomMedico.getText().toString();
                errores[0] = validaCaracteres(apMat);
                errores[1] = validaCaracteres(apPat);
                errores[2] = validaCaracteres(nom);
                dd = Integer.parseInt(frame.dd.getText().toString());
                mm = Integer.parseInt(frame.mm.getText().toString());
                aa = Integer.parseInt(frame.aa.getText().toString());
                apMatPac = frame.apMatPac.getText().toString();
                apPatPac = frame.apPatPac.getText().toString();
                nomPac = frame.nomPac.getText().toString();
                errores[3] = validaCaracteres(apMatPac);
                errores[4] = validaCaracteres(apPatPac);
                errores[5] = validaCaracteres(nomPac);
                edad = Integer.parseInt(frame.edad.getText().toString());
                ddP = Integer.parseInt(frame.ddP.getText().toString());
                mmP = Integer.parseInt(frame.mmP.getText().toString());
                aaP = Integer.parseInt(frame.aaP.getText().toString());
                calle = frame.calle.getText().toString();
                numEx = Integer.parseInt(frame.numEx.getText().toString());
                numInt = Integer.parseInt(frame.numInt.getText().toString());
                zona = Integer.parseInt(frame.zona.getText().toString());
                cp = Integer.parseInt(frame.cp.getText().toString());
                delegacion = frame.delegacion.getText().toString();
                errores[6] = validaCaracteres(delegacion);
                telFijo = Integer.parseInt(frame.telFijo.getText().toString());
                telMovil = Integer.parseInt(frame.telMovil.getText().toString());
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
                counter++;
                for(int i = 0; i < 3; i++){
                    if(frame.primaria[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                counter++;
                for(int i = 0; i < 3; i++){
                    if(frame.prepa[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                counter++;
                for(int i = 0; i < 6; i++){
                    if(frame.licenciatura[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                counter++;
                for(int i = 0; i < 6; i++){
                    if(frame.postgrado[i].isSelected())
                        estudios = counter;
                    counter++;
                }
                if(frame.ly.isSelected())
                    leer = 0;
                if(frame.ln.isSelected())
                    leer = 1;
                if(frame.ey.isSelected())
                    leer = 0;
                if(frame.en.isSelected())
                    leer = 1;
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
                    if(!errores[i])
                        e = true;
                }
                if(e)
                    System.out.println("Aqui va la coleccion");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha introducido mal alguno de sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);
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
            } 
        }
        return error;
    }
}