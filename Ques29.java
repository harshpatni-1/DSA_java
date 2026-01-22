import java.util.*;


 public class Ques29{

public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

System.out.println("enter a number");
int number = scanner.nextInt();

int largestPrimeFactor = -1;  // Add this BEFORE the while loop

while (number % 2 == 0) {
    largestPrimeFactor = 2;  // We found 2 as a factor!
    number = number / 2;      // Divide and UPDATE number
    System.out.println("Divided by 2, now largestPrimeFactor is: " + number);
}

while (number % 3 ==0){
      largestPrimeFactor =3;
      number = number/3;
     
}
System.out.println("After dividing by 3, largestPrimeFactor is: " + number);
for (int i = 5; i <= number; i += 2) {
    while (number % i == 0) {
        largestPrimeFactor = i;
        number = number / i;
    }
}

    if (number > 2) {
            largestPrimeFactor = number;
        }

        System.out.println("Largest prime factor is: " + largestPrimeFactor);
}

 }