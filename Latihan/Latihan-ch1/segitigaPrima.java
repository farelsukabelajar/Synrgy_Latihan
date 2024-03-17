package Latihan;

public class segitigaPrima {
    public static void main(String[] args) {
        int rows = 5;
        printPrimeTriangle(rows);
    }

    public static void printPrimeTriangle(int numRows) {
        int num = 2;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
               
                while (!isPrime(num)) {
                    num++; 
                }
                System.out.print(num + " ");
                num++; 
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
