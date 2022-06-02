package principal.Ejercicio5;

import java.util.Scanner;

public class Main5 {
    public static Scanner s= new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
    }
    public static void vestido(){
        int[] diseño=new int[10];
        for (int i=0;i<diseño.length;i++){
            diseño[i]=aleatorio();
        }
    }
    public static int aleatorio(){
        int num;
        num=(int) Math.round(Math.random()*899+100);
        return num;
    }
}
