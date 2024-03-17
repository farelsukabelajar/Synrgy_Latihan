package Latihan;

public class no3 {
    public static void main(String[] args) {

        char[] kata = { 'M', 'A', 'K', 'A', 'N', 'N', 'A', 'S', 'I' };

        for (char kataAwal: kata) {
            System.out.print(kataAwal+ " ");
        }

        System.out.println();

        for (int i = kata.length - 1; i >= 0; i--) {
            System.out.print(kata[i] + " ");
        }
    }

}
