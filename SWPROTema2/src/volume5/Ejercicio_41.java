package volume5;

import java.util.Arrays;

public class Ejercicio_41 {
    public static void main(String[] args) {
        complicarseVida();
    }
    public static void complicarseVida(){
        int alumnos = 3;
        int modulos = 6;
        int[][] notas = new int[modulos][alumnos];
        int[] notasProgramacion = {1, 2, 3};

        for (int i = 0; i < modulos; i++) {
            for (int j = 0; j < alumnos+1; j++) {
                System.out.print(" | ");
                if (i==0 && j!=0){
                    System.out.print("Alumno"+j);
                }else if (i!=0 && j==0){
                    System.out.print("Modulo"+i);
                }  else if (i==1 && j!=0) {
                    for (int k = 0; k < 1; k++) {
                        System.out.print("   "+ notasProgramacion[0] + "   ");
                    }
                }else{
                    System.out.print("   X   ");
                }

                System.out.print(" | ");
            }
            System.out.println(" ");
        }
    }
    public static void prueba(){
        String[] alumnos = {"Wisdom", "Samu", "Dani"};
        int[] notasProgramacion = {8,7,6};

        System.out.println(Arrays.toString(alumnos));
        System.out.println(Arrays.toString(notasProgramacion));
    }
}
