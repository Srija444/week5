import java.util.*;
class String5{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string: ");
    String name=s.nextLine();
    int alphabetsCount=0;
    int digitsCount=0;
    int spaceCount=0;
    int specialCount=0;
    for(int i=0;i<name.length();i++){
      char c=name.charAt(i);
      if(Character.isAlphabetic(c)){
        alphabetsCount++;
      }
      else if(Character.isDigit(c)){
        digitsCount++;
      }
      else if(Character.isSpace(c)){
        spaceCount++;
      }
      else{
        specialCount++;
      }
    }
    System.out.println("total number of alphabets are: "+alphabetsCount);
    System.out.println("total number of digits are: "+digitsCount);
    System.out.println("total number of spaces are: "+spaceCount);
    System.out.println("total number of special symbols  are: "+specialCount);
    
    
  }
}