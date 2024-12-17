package volume6;

import java.util.Scanner;

public class ejerciciosStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.next();
        char[] charArray = cadena.toCharArray();
        System.out.println("La longitud de la cadena es: " + charArray.length);

        System.out.print("Los dos primeros chars de esta cadena: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();

        boolean same = false;
        cadena = cadena.toLowerCase();
        String cadena2 = "hola";
        cadena2 = cadena2.toLowerCase();
        System.out.print("Son estas cadenas iguales? ");
        System.out.println(cadena.contentEquals(cadena2));

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'e') {
                System.out.println("La letra e está en la posición: " + i);
                break;
            }
        }


        if (charArray.length == 6) {
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == charArray[6]) {
                    System.out.println("La letra en la posición 6 es: " + charArray[i]);
                }
            }
        }else{
            System.out.println("La letra es menor a 6 posiciones");
        }

        for (int i = charArray.length-1; i > 0-1 ; i--) {
            System.out.println(cadena.charAt(i));
        }
    }


}

