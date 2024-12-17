//*(Opcional) Donat un sencer que representa el valor numèric d'una nota, mostra la qualificació corresponent en 
//* paraules, per exemple Insuficient, Suficient, Notable i Excel·lent. Utilitza if.

package volum1;

public class notasIf {
    public static void main(String[] args) {
        int nota = 8;

        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Suficiente");
        } else if (nota > 6 && nota <= 8) {
            System.out.println("Notable");
        } else if (nota > 8 && nota <= 10) {
            System.out.println("Excelente");
        }
    }
}
