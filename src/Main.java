import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  n;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Negatif veya sıfır bir sayı mükemmel sayı olamaz.");
        } else {

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    total += i;
                }
            }

            if (total == n) {
                System.out.println(n + " Mükemmel Sayıdır.");
            } else {
                System.out.println(n + " Mükemmel Sayı Değildir.");
            }
        }
    }
}