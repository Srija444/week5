import java.util.*;
class String10{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string: ");
    String input=s.nextLine();
     String[] words=input.split(" ");
    String longestWord="";
    for(int i=0;i < words.length;i++){
      
      if(words[i].length() > longestWord.length()){
        longestWord=words[i];
      }
    }
    System.out.println("the longest word in string is: "+longestWord);
  }
}
