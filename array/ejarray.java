package array;

import java.util.Arrays;

public class ejarray{
    public static void main(String[] args){
        int[] ejemploArray = new int[6];
        int ejemploArray2[] = {12, 45, 11, 4, 3};
        Arrays.fill(ejemploArray, 5);
        for(int c: ejemploArray){
            System.out.println(c);
        }
        System.out.println("----------------------------------");
        Arrays.sort(ejemploArray2);
        for(int c: ejemploArray2){
            System.out.println(c);
        }
        System.out.println("----------------------------------");
        System.out.println(Arrays.binarySearch(ejemploArray2, 12));
        System.out.println("----------------------------------");
        System.out.println(Arrays.equals(ejemploArray2, ejemploArray));
    }
}