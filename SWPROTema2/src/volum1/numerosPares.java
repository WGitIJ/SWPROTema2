package volum1;

public class numerosPares {
    public static void main(String[] args) {
        int inici = 3;
        int fi = 10;

        if (inici%2==0){
            for (int i = inici; i <= fi ; i+=2) {
                System.out.println(i);
            }
        } else{
            inici+=1;
            for (int i = inici; i <= fi; i+=2) {
                System.out.println(i);
            }
        }

    }
}
