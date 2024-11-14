//* Escriu una classe que crei un array de 10 sencers, els inicialitzi aleatòriament de 100 a 200 i els mostri per
//* pantalla.

package volum4;

public class arrayAleatorio {
    public static void main(String[] args) {
        int[] array;
        array = new int [10];
        final int MAXIMO = 200;
        final int MINIMO = 100;

        for (int i = 0; i <array.length ; i++) {
            int numAleatorio = MINIMO+(int)(Math.random()*((MAXIMO-MINIMO)+1));
            array[i] = numAleatorio;
            System.out.println("Array ["+ i + "] = " + array[i]);
        }
    }
}
