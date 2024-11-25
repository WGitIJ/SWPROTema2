package volume5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAlumnos = 0;
        int nModulos = 0;
        String[] names = new String[0];
        String[] modulos = new String[0];


        do {
            System.out.print("Introduce el número de alumnos: ");
             nAlumnos = sc.nextInt();
            names = new String[nAlumnos];

            System.out.print("Introduce el número de modulos: ");
            nModulos = sc.nextInt();
            modulos = new String[nModulos];
        } while (nAlumnos != nModulos);


        for (int i = 1; i < nAlumnos + 1; i++) {
            System.out.print("Introduce el nombre del alumno " + i + ": ");
            String name = sc.next();
            names[i-1] = name;
        }

        for (int i = 0; i < nModulos; i++) {
            System.out.print("Introduce el nombre del modulo " + i + ": ");
            String modulo = sc.next();
            modulos[i] = modulo;
        }
        int[] calificaciones = new int[nAlumnos * nModulos];
        double[] nProgramacion = new double[names.length];
        for (int i = 0; i < nModulos; i++) {
            for (int j = 0; j < nAlumnos  ; j++) {
                System.out.println("Introduce la nota de " + modulos[i] + "de " + names[j] + ": ");
                double rProgramacion = sc.nextDouble();
                nProgramacion[j] = rProgramacion;
            }
            for (int j = 0; j < nProgramacion.length; j++) {

            }

        }

        System.out.println(Arrays.toString(nProgramacion));
    }
}
