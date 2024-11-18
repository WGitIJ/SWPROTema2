//* Escriu un altre classe que generi aleatòriament la longitud de dos arrays(mínim 2). Crea els arrays d'aquestes
//* longituds. Els valors poden ser seqüencials o aleatoris, com vulguis. Compara-los. Evidentment si no tenen la
//* mateixa longitud no són iguals.

package volum4;

public class longitudArrayRandom {
    public static void main(String[] args) {
        int numAleatorio = 2+(int)(Math.random()+1);
        int [] array = new int[numAleatorio];
        numAleatorio = 2+(int)(Math.random()+1);
        int [] arrayB = new int[numAleatorio];
        boolean sonIguales;

        if (arrayB == array){
            sonIguales = true;
        } else{
            sonIguales = false;
        }

        System.out.println("¿ArrayA y ArrayB son iguales? " + sonIguales);
    }
}
