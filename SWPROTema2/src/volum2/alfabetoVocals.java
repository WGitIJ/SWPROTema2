package volum2;
import java.util.Scanner;
public class alfabetoVocals {

    public static void main(String[] args) {
        switcType();
    }

    public static void switcType(){
        boolean esVocal;
        char letra = 'a';
        for (int i = 0; i < 26; i++) {
            switch (letra){
                case 'a', 'e','i', 'o', 'u':
                    esVocal = true;
                    break;
                default:
                    esVocal = false;
                    break;
            }
            if (esVocal){
                System.out.println(letra + " es vocal");
            } else{
                System.out.println(letra + " es consonante");
            }
            letra++;

        }
    }

    public static void cadaIf(){
        char caracter = 'a';
        boolean esVocal;
        for (int i = 0; i < 26; i++) {
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
            caracter++;
        }


    }

    public static void unicoIf(){
        char caracter = 'a';
        boolean esVocal;
        for (int i = 0; i < 26; i++) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                esVocal = true;
            } else{
                esVocal = false;
            }
            System.out.println("¿Es " + caracter + " una vocal? " + esVocal);
            caracter++;
        }

    }


}
//* Al programa anterior elimina els break del switch. Que passa?
//? A primera vista parece que no funciona, pero si observamos el tiempo de ejecución, observamos que con el break, 
//? el programa se ejecuta más rápido, comparado a sin el break.