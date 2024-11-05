//* Crea un programa que recorri els 10 primers sencers. Si el nombre és 5 ha d'executar una instrucció continue,
//* si no l'ha de mostrar per pantalla. Repeteix-lo amb un break. Quina és la diferència? Mostra explicació per
//* pantalla.

package volum1;

public class continueBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------------------Break---------------------------");
        for (int i = 0; i < 10; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }
    //? La principal diferencia entre el continue y el break, es que con el continue, lo que hace es obviar el 5 y
    //? continua, en cambio con el break, una vez llega al 4 se para
}
