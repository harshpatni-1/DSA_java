import java.util.Scanner;
<<<<<<< HEAD
=======
public class Ques10{

public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

    System.out.println("Enter: number = ");
    int number = scanner.nextInt();
}
// Let's say you have a number
int age = 25;

// Convert it to String - here are 3 ways:
String ageAsString1 = String.valueOf(age);        // Way 1
String ageAsString2 = Integer.toString(age);      // Way 2
String ageAsString3 = age + "";                   // Way 3 (concatenation trick)

System.out.println(ageAsString1);  // Prints: 25 (but as text)
>>>>>>> 22fe8ad (due)

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