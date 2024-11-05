//* Intercanvia els valors de dues variables del mateix tipus.Mostra-les per pantalla abans i després de fer el canvi
//* .Per exemple si a=2 i b=3,al final a=3 i b=2.

package volum1;

public class intercanviValors {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int aux;

        System.out.println("Abans de intervanciar " +"A= " + a + " B= " + b);

        aux = a;
        a = b;
        b = aux;

        System.out.println("Abans de intervanciar " + "A= " + a + " B= " + b);
    }
}
