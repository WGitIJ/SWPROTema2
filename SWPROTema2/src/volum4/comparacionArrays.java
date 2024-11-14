package volum4;

public class comparacionArrays  {
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

        if (arrayA == arrayB){
            sonIguales = true;
        } else{
            sonIguales = false;
        }
        System.out.println("¿Son iguales? ");
        System.out.println(sonIguales);
    }
    //? Podemos ver que no son iguales, aunque tengan el mismo tamaño y el mismo valor, no ocupan el mismo sitio en la
    //? memoria, ya que la comparación compara dos variables ubicadas en distintas puntas de la memoria

}
