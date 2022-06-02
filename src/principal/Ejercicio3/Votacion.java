package principal.Ejercicio3;

import java.util.Scanner;

public class Votacion {
    public static Scanner s = new Scanner(System.in);

    public static int[][] votacion() {
        int[][] lista = crearArray();
        int voto;
        System.out.println("Vote 5 canciones");
        for (int i = 0; i < 5; i++) {
            voto= s.nextInt();
             lista[voto-1][1]+=1;
        }
        ordenarVotos(lista);
        return lista;
    }

    public static int[][] crearArray() {
        int[][] lista = new int[100][2];
        int exito = 1;
        for (int i = 0; i < lista.length; i++) {
            lista[i][0] =i +1;
        }
        return lista;
    }

    public static int[][] ordenarVotos(int[][] lista) {
        int aux = 0, aux2 = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = i; j < lista.length; j++) {
                if (lista[i][1] < lista[j][1]) {
                    aux = lista[i][1];
                    lista[i][1] = lista[j][1];
                    lista[j][1] = aux;
                    aux2 = lista[i][0];
                    lista[i][0] = lista[j][0];
                    lista[j][0] = aux2;
                }
            }
        }
        return lista;
    }
}
