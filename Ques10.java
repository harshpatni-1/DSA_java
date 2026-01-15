import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        // Convert the number to String - here are 3 ways:
        String numberAsString1 = String.valueOf(number);     // Way 1
      //  String numberAsString2 = Integer.toString(number);   // Way 2
        // String numberAsString3 = number + "";                // Way 3 (concatenation trick)
        
        System.out.println("As String: " + numberAsString1);
        
        scanner.close();
    }
}