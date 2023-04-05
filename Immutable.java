//immutable is nothing but the refernce value and input value should match otherwise it is mutamle
import java.util.Scanner;
class Immutable{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      System.out.println("enter the string: ");
      String input=s.nextLine();
    System.out.println("---------------");
    String name=input.toUpperCase();
    if(name==input){
      System.out.println("the string is immutable");
    }else{
      System.out.println("the string is mutable");
    }
    
  }
}