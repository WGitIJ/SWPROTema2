//* (Opcional) Donats tres números, a, b i c ordena-los de forma que al final a<=b<=c.

package volum1;

public class ordenaTresNumeros {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 1;
        int aux;

        if (a>b){
            aux = b;
            b = a;
            a = aux;
        }
        if (b>c) {
            aux = c;
            c = b;
            b = aux;
        }
        if (a>b){
            aux = b;
            b = a;
            a = aux;
        }

        System.out.println(a + " <= " + b + " <= " + c);

    }
}
