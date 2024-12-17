//* A l'exercici 5 afegeix el codi necessari per calcular l'IRPF. Suposa que si el salari no arriba a 300€ l'IRPF=10%,
//* si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. Mostra al final el salari brut, l'import de
//* l'IRPF i el salari net.

package volum1;

public class irpf {
    public static void main(String[] args) {
        int horasTrabajadas = 10;
        double precioHora = 10;
        int horasExtra = 0;
        double precioExtra = 0;
        double salario = 0;
        double salarioExtra = 0;

        if (horasTrabajadas > 40) {
            horasExtra = horasTrabajadas - 40;
            salarioExtra = horasExtra * precioHora * 2;
            System.out.println("Salario Extra: " + salarioExtra);
        } else {
            salario = horasTrabajadas * precioHora + salarioExtra;
        }


        if (salario < 300) {
            salario = salario * 0.90;
        } else if (salario >= 300 && salario < 500) {
            salario = salario * 0.80;
        } else {
            salario = salario * 0.7;
        }
        System.out.println("Salario: " + salario);
    }
}
