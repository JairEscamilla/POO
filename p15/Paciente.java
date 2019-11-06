package p15;

import java.util.Calendar;

import javax.xml.catalog.CatalogFeatures.Feature;

public class Paciente{
    String apMat, apPat, nom, apPatPac, apMatPac, nomPac, calle, delegacion, estadoPac;  
    int dd, mm, aa, ddP, mmP, aaP, numEx, numInt, cp, zona, telFijo, telMovil, time, sexo, estadoCivil, estudios, counter = 0, leer, escribir, ocupacion, counter2 = 0, religion, counter3 = 0, tiempo = 0, edad = 0;
    public Paciente(String nomPac, String apPatPac, String apMatPac, int telFijo, int telMovil, int sexo, int estadoCivil, int estudios, int leer, int escribir, int ocupacion, int x, Calendar fecha, String nomDoc, String ApMatDoc, String apPatDoc, int tiempo, String estadoFederativo, int religion, int ddP, int mmP, int aaP, int edad, int cp){
        this.apMat = ApMatDoc;
        this.cp = cp;
        this.apPat = apPatDoc;
        this.nom = nomDoc;
        this.nomPac = nomPac;
        this.religion = religion;
        this.apPatPac = apPatPac;
        this.apMatPac = apMatPac;
        this.telFijo = telFijo;
        this.telMovil = telMovil;
        this.sexo = sexo;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estudios = estudios;
        this.leer = leer;
        this.escribir = escribir;
        this.ocupacion = ocupacion;
        this.dd = fecha.get(Calendar.DAY_OF_MONTH);
        this.mm = fecha.get(Calendar.MONTH);
        this.aa = fecha.get(Calendar.YEAR);
        this.aaP = aaP;
        this.mmP = mmP;
        this.ddP = ddP;
        this.tiempo = tiempo;
        this.estadoPac = estadoFederativo;
    }
    public String toString(){
        String msj = nomPac + " " + apPatPac + " " + apMatPac;
        msj = msj + "\nTelefono fijo: "+telFijo + "\nTelefono movil: " + telMovil + "\nSexo: " + sexo + "\nEstudios: " + estudios + "\n¿Sabe leer? " +  leer + "\n¿Sabe escribir? " + escribir + "\nOcupacion: " + ocupacion + "\nEdad: " + edad;
        msj = msj + "\nFecha de consulta: " + dd + "/" + mm + "/" + aa + "\n";
        msj = msj + "\n-----------------------------------------------";
        return msj;
    }
}