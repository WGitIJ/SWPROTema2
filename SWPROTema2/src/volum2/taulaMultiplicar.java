//* Recupera un nombre passat com a argument des de la línia de comandes o teclat i mostra la taula de multiplicar
//* d'aquest nombre.

package volum2;
import java.util.Scanner;

public class taulaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué tabla de multiplicar quieres? ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
