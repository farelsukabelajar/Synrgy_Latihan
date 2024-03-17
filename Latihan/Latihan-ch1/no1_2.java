package Latihan;

public class no1_2 {

    public static void main(String[] args) {
        recursiveTwo(2, 256);
    }

    public static void recursiveTwo(int num, int b) {
        if (num <= b) { 
            System.out.print(num + " ");
            recursiveTwo(num * 2, b);
        }
    }
}
