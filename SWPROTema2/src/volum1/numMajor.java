//?Donats dos sencers a i b, mostra quin és el major de dos sencers, per exemple

package volum1;

public class numMajor {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 10;

        if (a>b && a>c){
            System.out.println("El mayor es A");
        } else if (b>a && b>c) {
            System.out.println("El mayor es B");
        } else{
            System.out.println("El mayor es C");
        }
    }
}
