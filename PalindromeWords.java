
import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
      String[] words=input.split(" ");
      for(int i=0;i<words.length;i++){
        String word=words[i];
        boolean isPalindrome=true;
        for(int j=0;j< word.length() / 2;j++){
          if(word.charAt(j) != word.charAt(word.length()-j-1)){
            isPalindrome=false;
            break;
          }
        }
        if(isPalindrome){
          System.out.println("the palindrome word is: "+word);
          System.out.println("------------");
        }else if(isPalindrome==false){
          System.out.println( word+ "-- not palindrome");
          System.out.println("------------");
        } 
      }
    }
}