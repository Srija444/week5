import java.util.*;
class String9{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string: ");
      String word=s.nextLine();
      int vowels=0;
      int consonants=0;
      for(int i=0;i<word.length();i++){
      char c=word.charAt(i);
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
        vowels++;
      }
      else if(c>='a' && c<='z'){
        consonants++;
      }
      }
    System.out.println("the vowels are: "+vowels);
    System.out.println("-------------");
    System.out.println("the consonants are: "+consonants);
    System.out.println("-------------");
    
  }
}

  
  
  