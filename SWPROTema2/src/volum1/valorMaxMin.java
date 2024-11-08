//* (Opcional) Donats tres sencers mostra el valor màxim i el mínim.

package volum1;

public class valorMaxMin {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c= 7;
        int max = a;
        int min = a;

        if (b>max){
            max = b;
        } else if (c>max) {
            max = c;
        }
        if (b<min){
            min = b;
        } else if (c<min) {
            min = c;
        }

        System.out.println("El valor max es: " + max);
        System.out.println("El valor min es: " + min);
    }
}
