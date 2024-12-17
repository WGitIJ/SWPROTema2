//* Defineix dues variables de tipus sencer, anomenades inici i fi, i assigna-li valors, de manera que inici<=fi.
//* Mostra per pantalla tots els sencers entre inici i fi (inclosos) utilitzant un while.

package volum1;

public class mostrarNumerosWhile {
    public static void main(String[] args) {
        int inici = 0;
        int fi = 10;

        while (inici <= fi) {
            System.out.println(inici);
            inici++;
        }
    }
}
