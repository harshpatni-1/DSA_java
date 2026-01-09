public class Ques13 {
    public static void main(String[] args) {
        int number = 54321;
        int value = 3;
        
        int count = 0;
        int tempNumber = number; // Create a copy to preserve original number
        
        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Extract last digit (e.g., 1, then 2...)
            
            if (digit > value) {
                count++;
            }
            
            tempNumber = tempNumber / 10; // Remove last digit
        }
        
        System.out.println("Input: number = " + number + ", value = " + value);
        System.out.println("Output: " + count);
    }
}