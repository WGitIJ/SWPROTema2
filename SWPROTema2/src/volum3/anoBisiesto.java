//* Modifica l'exercici anterior per a tenir en compte els anys de traspàs. Són de traspàs els anys múltiples de 4. Es
//* múltiples de 100 no ho són excepte que siguin múltiples de 400.
package volum3;

import java.util.Scanner;

public class anoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce un año: ");
        int year = sc.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tiene 30 dias");
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("Tienen 29 dias");
                    break;
                } else {
                    System.out.println("Tiene 28 días");
                    break;
                }

            default:
                System.out.println("Error: Input no valido");
        }
    }
}
