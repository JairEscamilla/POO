package practica1;

import java.util.Scanner;

public class TestPalabras{
    public static void main(String[] args) {
        Palabras p = new Palabras();
        Scanner sc = new Scanner(System.in);
        String pal;
        System.out.println("Ingresar un String: ");
        pal = sc.nextLine();
        System.out.println("Palabra ingresada: " + pal);
        System.out.println("Tamaño de la palabra: " + p.tamaño(pal));
        System.out.println("El ultimo caracter es: " + p.caracter(pal));
        System.out.println("La palabra contiene a?: " + p.contenido(pal));
    }
}