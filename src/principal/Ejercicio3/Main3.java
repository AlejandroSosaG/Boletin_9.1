package principal.Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        boolean voto = true;
        int[][] votos;
        int votantes = 1;
        do {
            votos = Votacion.votacion();
            System.out.println("¿Votará alguien más?");
            String respuesta = s.next();
            respuesta.toLowerCase(Locale.ROOT);
            if (respuesta.equals("si")) {
                votantes++;
            } else voto = false;
        } while (voto);

        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos[0].length; j++) {
                if (votos[i][1]>0){
                    System.out.print(votos[i][j] + " ");
                }
            }
            if (votos[i][1]>0){
                System.out.println("");
            }
        }
        System.out.println("El número de personas que han votado es " + votantes);
    }
}

