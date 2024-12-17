//* Crea un programa que guardi les notes finals de cada alumne per a cada mòdul del curs (basten 3) utilitzant el
//* que de vegades s'anomenen com a arrays paral·lels: arrays que mantenen informació relacionada i fan la relació
//* amb els índexs, és a dir, la informació d'un alumne està a la mateixa posició de tots els arrays.
//* Mostra la informació completa dels alumnes, és a dir el nom i les seves notes.
//* Comenta al codi com ho has organitzat.

package volume5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_40 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] alumnos = new String[2];
        Double[] notas = new Double[2];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce the name of the student");
            String alumno = sc.next();
            alumnos[i] = alumno;
            System.out.println("Introduce the qualification of " + alumno);
            double nota = sc.nextDouble();
            notas[i] = nota;
        }
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i] + " score for module " + i + " is " + notas[i]);
        }

    }
}


