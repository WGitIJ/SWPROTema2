//*Donat un nombre natural n, mostrar els n primers nombres de la successió de Fibonnacci: 0, 1, 1, 2, 3, 5, 8, ... En
//* aquesta successió, els dos primers termes són 0 i 1. Es següents termes s'obtenen sumant els dos anteriors, és a
//* dir, el tercer terme s'obté sumant el primer i el segon; el quart sumant el segon i el tercer, ....


package volum2;

public class sucesionFibonnacci {
    public static void main(String[] args) {
        int num = 10;
        int fibonnacci = 0;
        int anterior = 0;
        int resultado = 1;

        for (int i = 0; i < num - 1; i++) {
            fibonnacci = anterior + resultado;
            anterior = resultado;
            resultado = fibonnacci;
        }
        System.out.println(fibonnacci);
    }
}
