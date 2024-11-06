//* (Opcional) Donats tres sencers mostra el valor màxim i el mínim.

package volum1;

public class valorMaxMin {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int max;
        int min;

        if (a>b){
            max = a;
            min = a;
        } else if (b>a) {
            max = b;
            min = a;
        } else{
            System.out.println("A=B");
        }
        System.out.println("El vlaor max es: ");
    }
}
