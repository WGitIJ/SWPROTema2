//* Donada una velocitat v expressada en km/h passar-la a m/s (v*1000/3600). Fes el càlcul amb decimals.
package volum1;


public class conversioVelocitat {
    public static void main(String[] args) {
        float v = 40;
        float ms = v * 1000 / 3600;

        System.out.println();
        System.out.println(v + "km/h es igual a " + ms + "m/s");
    }
}
