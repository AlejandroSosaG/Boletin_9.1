package principal.Ejercicio4;

import java.util.Scanner;

enum ListaEquipos {
    barcelona, valencia, betis, madrid, osasuna, sevilla, villarreal, athletic, getafe, levante
}

public class Liga {
    public static Scanner s= new Scanner(System.in);
    public Liga nombreEquipo;
    public int partidosJugados, golesMarcados, golesRecibidos, puntos;

    public Liga(Liga nombreEquipo) {
        partidosJugados=0;
        this.nombreEquipo=nombreEquipo;
        golesMarcados=0;
        golesRecibidos=0;
        puntos=0;
    }

    public Liga getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(Liga nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidosJugados() {return partidosJugados;}

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

public static int[] equipo(){
        int[] equipo= new int[5];
        return equipo;
    }
    public static void partido(){
        int goles1, goles2;
        ListaEquipos equipo1, equipo2;
        for (int i =0; i<equipo().length/2;i++){
            System.out.println("Equipo 1:");
            equipo1=ListaEquipos.valueOf(s.next());
            System.out.println("Equipo 2:");
            equipo2=ListaEquipos.valueOf(s.next());
            System.out.println("Goles marcados por el equipo 1:");
            goles1=s.nextInt();
            System.out.println("Goles marcados por el equipo 2:");
            goles2=s.nextInt();
            for (int j=0;j<equipo().length;j++){

            }
        }
    }
}
