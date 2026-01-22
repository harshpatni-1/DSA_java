import java.util.*;

public class Ques26 { 
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numbers" );
        int number = scanner.nextInt();
        
        int[] numbers = new int[number];
    for (int i = 0; i < number; i++) {
        System.out.println("Enter number" + (i+1) + ": ");
          numbers[i] = scanner.nextInt();


    }
    System.out.println("Array: " + Arrays.toString(numbers));
    }

}

// @claude make a array here