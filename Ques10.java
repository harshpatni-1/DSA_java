import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        // Convert the number to String
        String numberAsString1 = String.valueOf(number);
        
        System.out.println("As String: " + numberAsString1);
        
        // Now get the length of the string
        String name = numberAsString1;
        int nameLength = name.length();
        
        System.out.println("Length: " + nameLength);
        
        scanner.close();
    }
}