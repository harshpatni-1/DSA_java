import java.util.Scanner;
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

}