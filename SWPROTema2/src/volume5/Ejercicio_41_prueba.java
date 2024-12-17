package volume5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_41_prueba {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuántos alumnos tienes?");
        complicarseVida();
    }

    public static void complicarseVida() {
        int alumnos = 3;
        int nModulos = 3;

        String[] modulos = new String[nModulos];
        for (int i = 0; i < modulos.length; i++) {
            System.out.print("Introduce el nombre del modulo " + i + ": ");
            String modulo = sc.next();
            modulos[i] = modulo;
            System.out.println();
        }
        int[] notasProgramacion = {1, 2, 3, 5, 8, 9, 5, 7, 8, 0, 3, 10};
        int contador = 0;


    }

    public static void prueba() {
        String[] alumnos = {"Wisdom", "Samu", "Dani"};
        int[] notasProgramacion = {8, 7, 6};

        System.out.println(Arrays.toString(alumnos));
        System.out.println(Arrays.toString(notasProgramacion));

    }


    public static void optimizado() {
        String[] names = new String[3];
        int[] notasProgramacion = new int[3];
        String[][] tablaNotas = new String[names.length][notasProgramacion.length];

        for (int i = 0; i < names.length + 1; i++) {
            System.out.print("Introduce el nombre del alumno: ");
            String name = sc.next();
        }

        System.out.println(Arrays.toString(names));
    }
}


//for (int i = 0; i < modulos; i++) {
//        for (int j = 0; j < alumnos+1; j++) {
//        System.out.print(" | ");
//                if (i==0 && j!=0){
//        System.out.print("Alumno "+j);
//                }else if (i!=0 && j==0){
//        System.out.print("Modulo "+i);
//                }  else if (i!=01 && j!=0) {
//        for (int k = 0; k < notasProgramacion.length; k++) {
//        System.out.print("   "+ notasProgramacion[0+contador] + "    ");
//contador++;
//        break;
//        }
//        }else{
//        System.out.print("   X    ");
//                }
//
//                        System.out.print(" | ");
//            }
//                    System.out.println(" ");
//        }