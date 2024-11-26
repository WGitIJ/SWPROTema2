package Solucions;


/**
 * 41. Crea un programa que utilitzi un array multidimensional per guardar les notes
 * finals de cada alumne per a cada mòdul del curs. Guarda les notes de dos o
 * tres alumnes i de dos o tres mòduls. Comenta al codi com ho has organitzat.
 *
 * @author joan
 */
public class Exercici41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX_ALUMNES = 3;
        final int MAX_ASSIGNATURES = 4;

        //Crea i omple la matriu
        int[][] notes = new int[MAX_ALUMNES][MAX_ASSIGNATURES];
        for (int i = 0; i < MAX_ALUMNES; i++) {
            for (int j = 0; j < MAX_ASSIGNATURES; j++) {
                notes[i][j] = 1 + (int) (Math.random() * (10));
            }
        }

        System.out.println("Notes");
        for (int i = 0; i < MAX_ALUMNES; i++) {
            for (int j = 0; j < MAX_ASSIGNATURES; j++) {
                System.out.print(notes[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");

        //Mostra les notes d'un alumne
        System.out.println("Notes de l'alumne 1");
        for (int j = 0; j < MAX_ASSIGNATURES; j++) {
            System.out.print(notes[1][j] + "\t");
        }
        //Mostra les notes d'una assignatura
        System.out.println("\n\nNotes de l'assignatura 1");
        for (int j = 0; j < MAX_ALUMNES; j++) {
            System.out.print(notes[j][1] + "\t");
        }
        System.out.println("");
    }

}
