import java.util.Scanner;
class SwapStrings{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the first string: ");
    String first=s.nextLine();
    System.out.println("enter the second string: ");
    String second=s.nextLine();

    
    //original string printing
    System.out.println("------------------");
    System.out.println("the original strings are: "); 
    System.out.println("------------------");
    System.out.println("the first string is : "+first);
    System.out.println("the second string is: "+second);


//swapping
    first=first+second;
    second=first.substring(0,first.length() - second.length());
    first=first.substring(second.length());


    //printing strings after swapping
     System.out.println("------------------");
    System.out.println("the swapped strings are: ");
     System.out.println("------------------");
    System.out.println("the swapped first string is: "+first);
    System.out.println("the swapped second string is: "+second);
    
    
  }
}