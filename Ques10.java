import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: number = ");
        int number = scanner.nextInt();
        
        // Handle negative numbers by taking absolute value
        number = Math.abs(number);
        
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10; // Remove the last digit
                count++;      // Increment digit count
            }
        }

        System.out.println("Output: " + count);
    }
}