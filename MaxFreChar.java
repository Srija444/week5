import java.util.Scanner;

public class MaxFreChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int maxFrequency = 0;
        char maxFrequencyChar = 0;

        for (int i = 0; i < chars.length; i++) {
            int frequency = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyChar = chars[i];
            }
        }

        System.out.println("Maximum frequency character: " + maxFrequencyChar);
        System.out.println("Frequency: " + maxFrequency);
    }
}