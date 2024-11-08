//* (Opcional) Demana a l'usuari un nombre natural i calcula el seu factorial. El factorial n! d'un nombre n és n*(n-1)
//* *(n-2)* ... 3*2*1. Per exemple, 3!=3*2*1

package volum2;

public class factorialNumber {
    public static void main(String[] args) {
        int num = 6;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
            System.out.print(factorial + ",");
        }
        System.out.println();
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
