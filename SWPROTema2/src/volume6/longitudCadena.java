package volume6;

import java.util.Scanner;

public class longitudCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una cadena de texto: ");
        String cadena = sc.next();
        char[] charArray = cadena.toCharArray();
        System.out.println(charArray.length);
    }
}
