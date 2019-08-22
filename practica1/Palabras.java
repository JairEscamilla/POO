package practica1;

public class Palabras{
    public int tamaño(String pal){
        return pal.length();
    }
    public char caracter(String pal){
        return pal.charAt(pal.length() - 1);
    }
    public boolean contenido(String pal){
        return pal.contains("a");
    }
}