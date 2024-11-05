//* (Opcional) Repeteix l'exercici anterior amb tres sencers.

package volum1;

public class numMajorTres {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 9;
        int max = 0;
        int min;

        if (a>b && a>c){
            max = a;
        } else if (b>a && b>c) {
            max = b;
        } else if (c>a && c>b) {
            max = c;
        }
        System.out.println(max);
    }
}
