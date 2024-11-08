//* Crea un programa que donat un nombre sencer mostri per pantalla tots els seus divisors, per exemple, per a 6
//* mostraria 1, 2, 3, 6.

package volum2;

public class divisorNombre {
    public static void main(String[] args) {
        int num = 15;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0){
                System.out.println(i);
            }
        }
    }
}
