import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: number = ");
        int limit = scanner.nextInt();

        for (int i = 2; i < limit; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}