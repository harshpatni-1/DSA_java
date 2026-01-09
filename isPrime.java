import java.util.Scanner;

public class isPrime {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number:");
int number = scanner.nextInt();

if (isPrime(number)){
    System.out.println("Prime");

     } else{
         System.out.println("Not Prime");
          }
           scanner.close();
           }
           public static boolean isprime(int number){
               if (number <= 1){
                       return false;
                           }
                           if (number <= 3 ){
                               return true;
                               }
                               if (number % 2 == 0 || number % 3 == 0){
                                   return false;
                                   }
                                   for (int i = 5; i * i <= number; i += 6 ){
                                       if (number % i == 0 || number % (i + 2) == 0) {
                                               return false;
                                                   }
                                                   }
                                                   return true;
                                                   }

                                                   }