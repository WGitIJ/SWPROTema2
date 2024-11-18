//* Escriviu una classe que generi un valor aleatòri entre dos i quatre. Ha d'utilitzar aquest valor per crear un array
//* de sencers d'aquesta longitud. Ha d'omplir l'array aleatòriament.
//* Posteriorment l'ha d'ordenar utilitzant l'algorisme de l'exercici 12. Per ordenar-lo vos heu d'assegurar que
//* l'array tengui tres posicions, sinó l'algorisme no funciona.
package volum4;

public class ordenarArrays {
    public static void main(String[] args) {
        arrayOrdenada();
//        int numAleatorio;
//        int min = 0;
//        int tamanoAleatorio = 2+(int)(Math.random()*((4-2)+1));
//        int[] array = new int[tamanoAleatorio];
//        int[] arrayOrdenado = new int[tamanoAleatorio];
//
//        for (int i = 0; i < array.length; i++) {
//            numAleatorio = (int)(Math.random()*20+1);
//            array[i] = numAleatorio;
//        }
//        System.out.println("Array sin ordenar");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println(" ");
//        for (int i = 0; i < array.length; i++) {
//            min = array[i];
//            if (array[i]<min){
//                min = array[i];
//            } else {
//                if (array[i]<min) {
//                    min = min;
//                }
//            }
//        }
//
//        for (int i = 0; i < arrayOrdenado.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("El numero más pequeño es: " + min);
    }

    public static void arrayOrdenada(){
        int tamanoAleatorio = 2+(int)(Math.random()*((4-2)+1));
        int numAleatorio;
        int[] array = new int[tamanoAleatorio];

        //Asignación de valores en el Array
        for (int i = 0; i < array.length; i++) {
            numAleatorio = 1+(int)(Math.random()*((10-1)+1));
            array[i] = numAleatorio;
            System.out.println(array[i]);
        }

        //Ordenar Array
        for (int i = 0; i < array.length; i++) {

        }


    }
}
