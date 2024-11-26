package volume5;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAlumnos = 0;
        int nModulos = 0;
        int nExamenes = 3;
        String[] names = new String[0];
        String[] modulos = new String[0];

        System.out.print("Introduce el número de alumnos: ");
        nAlumnos = sc.nextInt();
        names = new String[nAlumnos];
        System.out.print("Introduce el número de modulos: ");
        nModulos = sc.nextInt();
        modulos = new String[nModulos];

        for (int i = 1; i < nAlumnos + 1; i++) {
            System.out.print("Introduce el nombre del alumno " + i + ": ");
            String name = sc.next();
            names[i - 1] = name;
        }

        for (int i = 0; i < nModulos; i++) {
            System.out.print("Introduce el nombre del modulo " + i + ": ");
            String modulo = sc.next();
            sc.nextLine();
            modulos[i] = modulo;
        }

        double[][] califications = new double[nModulos][nExamenes];
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("Introduce las notas de " + names[i]);
            for (int j = 0; j < nModulos; j++) {
                System.out.println("De " + modulos[j] + ": ");
                for (int k = 0; k < nExamenes; k++) {
                    System.out.print("Examen " + k + ": ");
                    califications[j][k] = sc.nextDouble();
                }

            }
        }

        boolean closeMenu = false;

        while (!closeMenu) {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Mostra les notes d'un alumne");
            System.out.println("2. Mostra les notes d'un mòdul");
            System.out.println("3. Sortir");
            System.out.print("Selecciona una opció: ");
            int opcio = sc.nextInt();

            switch (opcio){

                case 1:
                    System.out.println("\n Lista de alumnos: ");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println(i+1 + ". " + names[i]);
                    }
                    System.out.print("Selecciona un alumno: ");
                    int indiceAlumno = sc.nextInt();

                    for (int i = 0; i < modulos.length; i++) {

                    }
                    break;
                case 2:
                    System.out.println("\n Lista de modulos: ");
                    System.out.println(Arrays.toString(modulos));
                    break;
                case 3:
                    closeMenu = true;
                    break;
            }
        }

        //TODO -> Tiene que insertar de un mismo alumno por cada asignatura es decir si son dos asignaturas, un
        // alumno tendrá notas de de las dos asignaturas.



        for (int i = 0; i < names.length; i++) {
            System.out.println();
            System.out.println("Las notas de " + names[i]);
            for (int j = 0; j < modulos.length ; j++) {
                System.out.print("En "+ modulos[j] + " son: ");
                for (int k = 0; k < califications[j].length ; k++) {
                    System.out.print(califications[j][k] + " - ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
