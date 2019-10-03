package examen;

import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = {88, 45, 53, 86, 33, 86, 85, 30, 89, 53, 41, 96, 56, 38, 62, 71, 51, 86, 68, 29, 28, 47, 33, 37, 25, 36, 33, 94, 73, 46, 42, 34, 79, 72, 88, 99, 82, 62, 57, 42, 28, 55, 67, 62, 60, 96, 61, 57, 75, 93, 34, 75, 53, 32, 28, 73, 51, 69, 91, 35};
        int arreglo[];
        Percentiles per = new Percentiles(array);
        arreglo = per.ordenar();
        System.out.println("Ingresar percentil: ");
        int p = sc.nextInt();
        per.percentil(arreglo, p);
    } 
}