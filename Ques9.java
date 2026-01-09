import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: number = ");
        int number = scanner.nextInt();
        
        // Handle negative numbers if necessary
        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Extract last digit
            sum += digit;            // Add to sum
            number /= 10;            // Remove last digit
        }

        System.out.println("Output: " + sum);
    }
}