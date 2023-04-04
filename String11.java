import java.util.Scanner;
class String11{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string: ");
    String input=s.nextLine();
    String[] words=input.split(" ");
    String smallestWord=words[0];
    for(int i=1;i<words.length;i++){
      if(words[i].length() < smallestWord.length()){
        smallestWord=words[i];
      }
    }
    System.out.println("the smallest word in string is: "+smallestWord);
  }
}