package volume5;


import java.util.Scanner;

public class Ejercicio_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAlumnos;
        int nModulos;
        int nExamenes = 3;
        String[] names;
        String[] modulos;

        //? Aquí insertamos el número de alumnos
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

            switch (opcio) {

                case 1:
                    System.out.println("\n Lista de alumnos: ");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println(i + 1 + ". " + names[i]);
                    }
                    System.out.print("Selecciona un alumno: ");
                    int indiceAlumno = sc.nextInt();
                    System.out.println(names[indiceAlumno - 1] + "ha sacado: ");

                    for (int i = 0; i < modulos.length; i++) {
                        System.out.println(modulos[i] + ": ");
                        for (int j = 0; j < califications[i].length; j++) {
                            // Aquí probablemente debería imprimirse alguna calificación
                            System.out.println(" Examen " + (j + 1) + ": " + califications[i][j]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n Lista de modulos: ");
                    for (int i = 0; i < modulos.length; i++) {
                        System.out.println(i + 1 + ". " + modulos[i]);
                    }
                    for (int j = 0; j < modulos.length; j++) {
                        for (int i = 0; i < names.length; i++) {
                            System.out.print("Las notas de " + names[i] + " de " + modulos[j] + ": ");
                            for (int k = 0; k < nExamenes; k++) {
                                System.out.print(califications[j][k] + " - ");
                            }
                            System.out.println(); // Asegúrate de que las notas se impriman en líneas separadas
                        }
                    }
                    break;
                case 3:
                    closeMenu = true;
                    break;
            }
        }
    }


}
