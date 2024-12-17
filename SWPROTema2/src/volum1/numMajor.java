//* Donats dos sencers a i b, mostra quin és el major de dos sencers, per exemple
//* El major és a.

package volum1;

public class numMajor {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;

        if (a > b) {
            System.out.println("El mayor es A");
        } else if (b < a) {
            System.out.println("El mayor es B");
        } else {
            System.out.println("Son iguales");
        }
    }
}
