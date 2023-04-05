import java.util.Scanner;

public class VowelFre{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] frequencies = new int[5];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'a':
                case 'A':
                    frequencies[0]++;
                    break;
                case 'e':
                case 'E':
                    frequencies[1]++;
                    break;
                case 'i':
                case 'I':
                    frequencies[2]++;
                    break;
                case 'o':
                case 'O':
                    frequencies[3]++;
                    break;
                case 'u':
                case 'U':
                    frequencies[4]++;
                    break;
            }
        }
        System.out.println("Frequency of A/a: " + frequencies[0]);
        System.out.println("Frequency of E/e: " + frequencies[1]);
        System.out.println("Frequency of I/i: " + frequencies[2]);
        System.out.println("Frequency of O/o: " + frequencies[3]);
        System.out.println("Frequency of U/u: " + frequencies[4]);
    }
}