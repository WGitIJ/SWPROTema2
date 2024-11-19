//* Crea un programa que faci el següent:
//*        Demana a l'usuari quants valors vol entrar.
//*        Crea un array amb capacitat per guardar la quantitat de valors que ha dit l'usuari.
//*        Demana a l'usuari els valors i guarda'ls a l'array.
//*        Mostra els valors, el màxim, el mínim i la seva mitjana

package volume5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos valores quieres? ");
        int valoresUsurio = sc.nextInt();
        int valor;
        int max = 0;
        int min = 0;
        int suma = 0;



        int[] arrayUsuario = new int[valoresUsurio];


        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.println("Introduce un valor: ");
            valor = sc.nextInt();
            arrayUsuario[i] = valor;
            max = arrayUsuario[0];
            min = arrayUsuario[0];

            if (arrayUsuario[i] > max){
                max = arrayUsuario[i];
            }

            if (arrayUsuario[i] < min){
                min = arrayUsuario[i];
            }

            suma = suma + valor;
        }
        int mediana = suma/arrayUsuario.length;
        System.out.println(Arrays.toString(arrayUsuario));
        System.out.println("El número más grande de este array es: " + max);
        System.out.println("El número más pequeño de este array es: " + min);
        System.out.println("La suma de este array es: " + suma);
        System.out.println("La media de este array es: " + mediana);
    }
}
