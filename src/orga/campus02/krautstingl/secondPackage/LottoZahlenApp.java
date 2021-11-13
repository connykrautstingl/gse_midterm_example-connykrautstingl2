package orga.campus02.krautstingl.secondPackage;

public class LottoZahlenApp {

    public static void main(String[] args) {


    }

    public static int[] generateRandomNumbers(int size, int maxNumber) {


        int[] zahl = new int[44];
        int i = 1;
        while (i < zahl.length) {
            zahl[i] = i;
            System.out.println(zahl[i]);
            i++;
        }
        return null;

        int number = (int) (Math.random() * maxNumber + 1);



    }

}


