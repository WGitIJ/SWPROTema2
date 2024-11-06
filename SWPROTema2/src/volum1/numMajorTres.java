//* (Opcional) Repeteix l'exercici anterior amb tres sencers.

package volum1;

public class numMajorTres {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 9;

        if (a>b && a>c){
            System.out.println("El mayor es A");
        } else if (b>a && b>c) {
            System.out.println("El mayor es B");
        } else if (c>a && c>b) {
            System.out.println("El mayor es C");
        } else{
            System.out.println("Son igaules");
        }

    }
}
