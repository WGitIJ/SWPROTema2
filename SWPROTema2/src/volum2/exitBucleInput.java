//* (Opcional) Fes un programa que llegeixi números sencers del teclat fins que l'usuari pitgi un zero. Calcula la
//* mitjana d'aquests números (sense incloure el 0 final).

package volum2;

import java.util.Scanner;

public class exitBucleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        int mitjana = 1;
        int contador = 0;
        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            suma = suma + num;
            contador++;
        } while (num != 0);
        mitjana = suma / (contador - 1);
        System.out.println("La mitjana es: " + mitjana);
        System.out.println("Hasta pronto!!");
    }
}
