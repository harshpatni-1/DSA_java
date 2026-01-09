import java.util.Scanner;
import java.util.ArrayList;

public class Ques8 
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: start = ");
        int start = scanner.nextInt();
        
        System.out.print("Input: end = ");
        int end = scanner.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            // Skip numbers < 2 as they are not prime
            if (i < 2) continue;

            boolean isPrime = true;
            // Check divisibility from 2 up to sqrt(i)
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
        
        // Print the result in the requested format
        System.out.println("Output: " + primes);
    }
}