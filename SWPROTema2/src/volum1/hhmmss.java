//? Donat un temps expressat en segons, descomposa'l en hores, minuts i segons. 1 Hora = 3600 segons i 1 minut= 60 segons. Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.

package volum1;

public class hhmmss {
    public static void main(String[] args) {
       int sec = 80000;
       int min = sec/60;
       int horas = 0;
       if (min>0) {
        sec = sec%60;
       }
       if (min>60) {
        horas = min/60;
        min = min%60;
       }
       System.out.println(horas + " Horas "  + min +" Minutos " + sec + " Segundos ");
    }
}
