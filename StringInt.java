import java.util.Scanner;
public class StringInt {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        
        int result = 0;
        boolean isNegative = false;
        
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            
            if (i == 0 && c == '-') {
                isNegative = true;
                continue;
            }
            
            if (c < '0' || c > '9') {
                System.out.println("Invalid input string.");
                return;
            }
            
            result = result * 10 + (c - '0');
        }
        
        if (isNegative) {
            result = -result;
        }

        // print the integer value
        System.out.println("The integer value is: " + result);

        
        
    }
}