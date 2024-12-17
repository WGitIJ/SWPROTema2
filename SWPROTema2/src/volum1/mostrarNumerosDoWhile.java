//* Defineix dues variables de tipus sencer, anomenades inici i fi, i assigna-li valors, de manera que inici<=fi.
//* Mostra per pantalla tots els sencers entre inici i fi (inclosos) utilitzant un while.


package volum1;

public class mostrarNumerosDoWhile {
    public static void main(String[] args) {
        int inici = 0;
        int fi = 10;

        do {
            System.out.println(inici);
            inici++;
        } while (inici <= fi);
    }
}
//? La principal diferencia entre estas tres es el orden de ejecución, tanto el for como el while comprueban la
//? condición antes de seguir con la instrucciones, en cambio el do-while, ejecuta la instrucción y luego mira si se
//? cumple la condición
