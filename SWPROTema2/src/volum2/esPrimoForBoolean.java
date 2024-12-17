//* Comprova si un nombre és primer o no utilitzant un for i un booleà.

package volum2;

public class esPrimoForBoolean {
    public static void main(String[] args) {
        int num = 15;
        boolean esPrimo = true;


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println("¿El " + num + " es primo? " + esPrimo);
    }
}
