import java.util.Scanner;

public class MinFreChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int[] frequency = new int[256];
        char minFrequencyChar = 0;
        int minFrequency = input.length();

        for (int i = 0; i < chars.length; i++) {
            frequency[chars[i]]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (frequency[chars[i]] != 0 && frequency[chars[i]] < minFrequency) {
                minFrequency = frequency[chars[i]];
                minFrequencyChar = chars[i];
            }
        }

        System.out.println("Minimum frequency character: " + minFrequencyChar);
        System.out.println("Frequency: " + minFrequency);
    }
}