import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        // Step 1: Read input (blind: assume user enters a positive int)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Call the function and print result
        if (Ques2(number)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        scanner.close();
    }

    // Step 3: Define the isPrime function
    public static boolean Ques2(int number) {
        // Basic checks (blind test: 1 -> false, 2 -> true, 3 -> true)
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        
        // Check divisibility by 2 or 3 (blind: 4 -> false, 9 -> false)
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        // Loop for other factors (blind: for 7, i=5, 5*5=25>7? No, check 5 and 7—no div)
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;  // If no divisors, prime
    }
}