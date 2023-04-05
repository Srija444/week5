import java.util.Scanner;
class ReverseWord{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      System.out.println("enter the string: ");
      String input=s.nextLine();
      String[] words=input.split(" ");
      for(int i=0;i<words.length;i++){
      String word=words[i];
      String reverseWord="";
      for(int j=word.length()-1;j>=0;j--){
        reverseWord=reverseWord+word.charAt(j);
        
      }
      words[i]=reverseWord;
      }
    String reversedString=String.join("\n",words);
    System.out.println("------------");
    System.out.println("reversed string is: "+reversedString);
     System.out.println("------------");
      }
    }
  