//TODO A partir d'un sencer que representa les hores treballades per un/a treballador/a i un real que representa el preu en € de cada hora, calcula que ha de cobrar aquesta persona en acabar la setmana. Suposa que totes les hores extra, les que passen de 40, doblen el preu.

package volum1;

public class horesFeina {
    public static void main(String[] args) {
        int horasTrabajadas = 50;
        float precioHora = 30;
        int horasExtra = 0;
        float precioExtra = 0;
        float salario ;
        float salarioExtra = 0;

        if (horasTrabajadas>40){
            horasExtra = horasTrabajadas - 40;
            salarioExtra = horasExtra * precioHora * 2;
            System.out.println("Salario Extra: " + salarioExtra);
        }
        salario = 40 * precioHora + salarioExtra;

        System.out.println("Salario: " + salario);
    }
}
