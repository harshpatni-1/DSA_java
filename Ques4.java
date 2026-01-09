import java.util.Scanner;
public class Ques4{

 public static void main(String[]args){
Scanner scanner = new scanner(System.in);
 
 System.out.println("give me a number")
 int int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("False"); 
        } else {
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                System.out.println("True");
            } else {
                System.out.println("False");
 }
}