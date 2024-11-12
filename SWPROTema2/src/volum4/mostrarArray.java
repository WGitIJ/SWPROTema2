//* Escriu una classe que crei un array de 10 sencers, els inicialitzi de 1 a 10 i els mostri per pantalla.
package volum4;

public class mostrarArray {
    public static void main(String[] args) {
        int num[];
        num = new int [10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i+1;
            System.out.println(num[i]);
        }
    }
}
