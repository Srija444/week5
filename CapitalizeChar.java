import java.util.Scanner;
class CapitalizeChar{
  public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    System.out.println("enter the string: ");
    String input=s.nextLine();
    String[] words=input.split(" ");
    for(int i=0;i<words.length;i++){
      String word=words[i];
      char firstAlphabet=word.charAt(0);
      if(Character.isLowerCase(firstAlphabet)){
        firstAlphabet=Character.toUpperCase(firstAlphabet);
      }
      words[i]=firstAlphabet+word.substring(1);
    }
      String capitalizedString=String.join(" ",words);
    System.out.println("---------------");
      System.out.println("capitalized first character in each word is: "+capitalizedString);
    }
      }
