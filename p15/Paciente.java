package p15;

public class Paciente{
    String apMat, apPat, nom, apPatPac, apMatPac, nomPac, calle, delegacion, estadoPac;
    int dd, mm, aa, edad, ddP, mmP, aaP, numEx, numInt, cp, zona, telFijo, telMovil, time, sexo, estadoCivil, estudios, counter = 0, leer, escribir, ocupacion, counter2 = 0, religion, counter3 = 0;
    public Paciente(String nomPac, String apPatPac, String apMatPac, int telFijo, int telMovil, int sexo, int estadoCivil, int estudios, int leer, int escribir, int ocupacion){
        this.nomPac = nomPac;
        this.apPatPac = apPatPac;
        this.apMatPac = apMatPac;
        this.telFijo = telFijo;
        this.telMovil = telMovil;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.estudios = estudios;
        this.leer = leer;
        this.escribir = escribir;
        this.ocupacion = ocupacion;
    }
    public String toString(){
        String msj = nomPac + " " + apPatPac + " " + apMatPac;
        msj = msj + "\nTelefono fijo: "+telFijo + "\nTelefono movil: " + telMovil + "\nSexo: " + sexo + "\nEstudios: " + estudios + "\n¿Sabe leer? " +  leer + "\n¿Sabe escribir? " + escribir + "\nOcupacion: " + ocupacion;
        msj = msj + "\n-----------------------------------------------";
        return msj;
    }
}