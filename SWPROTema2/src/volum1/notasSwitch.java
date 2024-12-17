//* (Opcional) Repeteix l'exercici anterior amb un switch.

package volum1;

public class notasSwitch {
    public static void main(String[] args) {
        int nota = 2;
        switch (nota) {
            case 1:
                System.out.println("Suspendido");
                break;
            case 2:
                System.out.println("Suspendido");
                break;
            case 3:
                System.out.println("Suspendido");
                break;
            case 4:
                System.out.println("Suspendido");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Notable");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Excelente");
                break;
            case 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Resultado no válido");
                break;
        }
    }
}
