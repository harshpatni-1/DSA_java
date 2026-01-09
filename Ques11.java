import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: number = ");
        int number = scanner.nextInt();
        
        System.out.print("Input: digit to count = ");
        int target = scanner.nextInt();

        // Handle negative numbers
        number = Math.abs(number);
        int count = 0;

        // Loop until number is 0
        do {
            int digit = number % 10; // Extract last digit
            if (digit == target) {
                count++;
            }
            number /= 10; // Remove last digit
        } while (number > 0);

        System.out.println("Output: " + count);
    }
}