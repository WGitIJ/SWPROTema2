//* (Opcional) Genera sencers aleatòris entre un valor màxim i un valor mínim fins que els hagis generats tots. Mostra
//* els valors generats i quantes iteracions has necessitat per conseguir-ho.

package volum4;

import java.util.Arrays;

public class generarNumRandom {
    public static void main(String[] args) {
        int max = 5;
        int min = 0;
        int[] array = new int[max + 1];
        int contador = 0;
        int numAleatorio = (int) (Math.random() * ((max + min) + 1));
        for (int i = 0; i <= max; i++) {
            while (numAleatorio != i) {
                contador++;
                numAleatorio = (int) (Math.random() * ((max + min) + 1));
                array[i] = numAleatorio;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Intentos: " + contador);

    }
}