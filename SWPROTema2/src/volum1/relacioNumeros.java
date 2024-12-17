//* (Opcional) Donats dos sencers mostra la relació que hi ha entre ells, per exemple mostra a<b o a=b.

package volum1;

public class relacioNumeros {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        if (a > b) {
            System.out.printf("A>B");
        } else if (b > a) {
            System.out.println("B>A");
        } else {
            System.out.println("A=B");
        }
    }
}
