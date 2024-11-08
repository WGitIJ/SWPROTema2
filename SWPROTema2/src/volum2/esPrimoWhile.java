//* Comprova si un nombre és primer o no utilitzant un while.
package volum2;

public class esPrimoWhile {
    public static void main(String[] args) {
        int num = 23;
        int i = 2;
        boolean esPrimo = true;

        while (i<num){
            if (num%i==0){
                esPrimo = false;
                break;
            }
            i++;
        }
        System.out.println("¿El " + num + " es primo? " + esPrimo);
    }
}
