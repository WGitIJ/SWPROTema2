
//* Crea una classe que defineixi una matriu quadrada, pe 4x4, i:
//* 1.Inicialitza-la de forma que cada casella tengui la suma de les seves coordenades.
//? A lo que se refiere a que la suma de las filas como la de las columnas de el mismo resultado.
//* 2.Mostra la diagonal principal, [0,0],[1,1], [2,2]...
//* 3.Mostra la diagonal secundària [3,0],[2,1]...

package volum4;

public class matriuCuadrada {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        //? La i son las filas y la j son las columnas
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
                array[i][j] = i+j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" | ");
                System.out.print (array[i][j]);
                System.out.print(" | ");
            }
            System.out.println(" ");
        }

        //Mostrar diagonal principal
        System.out.print("La diagonal principal esta formada por: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        //Mostrar diagonal secundaria
        System.out.printf("La diagonal secundaria esta formada por: ");
        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length - 1; j <array.length; j--) {
                if (j+i ==3){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        //! Forma optimizada de sacar la diagonal
        System.out.println("-------------------- Forma optimizada de sacar diagonal --------------------");
        System.out.printf("La diagonal secundaria esta formada por: ");
        for (int i = 0; i < array.length; i++) {
            int j = 3 - i;
            if (j>=0 && j< array.length){
                System.out.print(array[i][j] + " ");
            }

        }


    }
}
