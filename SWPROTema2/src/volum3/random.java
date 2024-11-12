//* Mostra un sencer aleatori entre un valor màxim i un mínim. Per a generar els números aleatòriament pots utilitzar
//* Math.random(). Torna un double entre 0 i 1 (no inclòs).

package volum3;
public class random {
    public static void main(String[] args) {
        int max = 10;
        int min = 0;
        int numAleatorio = min+(int)(Math.random()*((max-min)))+1;
        System.out.println("El número random es: " + numAleatorio);
    }
}
