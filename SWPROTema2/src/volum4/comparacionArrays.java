//* Escriu un altre classe que generi aleatòriament la longitud de dos arrays(mínim 2). Crea els arrays d'aquestes
//* longituds. Els valors poden ser seqüencials o aleatoris, com vulguis. Compara-los. Evidentment si no tenen la
//* mateixa longitud no són iguals.

package volum4;

public class comparacionArrays {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        boolean sonIguales;

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i;
            System.out.println(arrayA[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = i;
            System.out.println(arrayB[i]);
        }

        if (arrayA == arrayB) {
            sonIguales = true;
        } else {
            sonIguales = false;
        }
        System.out.println("¿Son iguales? " + sonIguales);

        //Comparación correcta de Arrays
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i]) {
                sonIguales = false;
                break;
            } else {
                sonIguales = true;
            }
        }
        System.out.println("¿El ArrayA y el ArrayB son iguales? " + sonIguales);
    }
    //? Podemos ver que no son iguales, aunque tengan el mismo tamaño y el mismo valor, no ocupan el mismo sitio en la
    //? memoria, ya que la comparación compara dos variables ubicadas en distintas puntas de la memoria

}
