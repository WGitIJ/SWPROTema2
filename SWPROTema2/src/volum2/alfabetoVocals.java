package volum2;
import java.util.Scanner;
public class alfabetoVocals {

    public static void main(String[] args) {
        switchType();
    }

    public static void alfabeto(){
        char letra = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(letra);
            letra++;
        }
    }

    public static void cadaIf(){
        System.out.print("Introduce la letra que quieres comprobar: ");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);
        boolean esVocal = false;
        if (caracter == 'a'){
            esVocal = true;
        } else if (caracter == 'e'){
            esVocal = true;
        } else if (caracter == 'i') {
            esVocal = true;
        } else if (caracter == 'o'){
            esVocal = true;
        } else if (caracter == 'u'){
            esVocal = true;
        } else{
            esVocal = false;
        }
        System.out.println("¿Es " + caracter + " una vocal? " +esVocal);
    }

    public static void unicoIf(){
        System.out.print("Introduce la letra que quieres comprobar: ");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);
        boolean esVocal = false;
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            esVocal = true;
        }
        System.out.println("¿Es " + caracter + " una vocal? " +esVocal);
    }

    public static void switchType(){
        System.out.print("Introduce la letra que quieres comprobar: ");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);
        boolean esVocal = false;
        switch (caracter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                esVocal = true;
            default:
                esVocal = false;
        }
        System.out.println("¿Es " + caracter + " una vocal? " +esVocal);
    }

}
//* Al programa anterior elimina els break del switch. Que passa?
//? A primera vista parece que no funciona, pero si observamos el tiempo de ejecución, observamos que con el break, 
//? el programa se ejecuta más rápido, comparado a sin el break.