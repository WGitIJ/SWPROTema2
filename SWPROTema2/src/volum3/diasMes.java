//* Escriu un programa que llegeixi un sencer de l'1 al 12 del teclat i ens digui el nombre de dies que té el mes
//* corresponent. Suposarem que febrer sempre té 28 dies.

package volum3;

import java.util.Scanner;

public class diasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

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
                System.out.println("Tienen 28 dias");
                break;
            default:
                System.out.println("Eror: Input no valido");
        }
    }
}
