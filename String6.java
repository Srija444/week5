import java.util.*;
class String6{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string: ");
    String name=s.nextLine();
    int upperCount=0;
    int lowerCount=0;
    
    for(int i=0;i<name.length();i++){
      char c=name.charAt(i);
      if(Character.isUpperCase(c)){
        upperCount++;
      }
      else if(Character.isLowerCase(c)){
        lowerCount++;
      }
      
    }
    System.out.println("total number of uppercase alphabets are: "+upperCount);
    System.out.println("total number of lowercase alphabets are: "+lowerCount);
   
    
    
  }
}