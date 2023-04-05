import java.util.Scanner;
class StringSame{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the first string: ");
    String first=s.nextLine();
    System.out.println("enter the second string: ");
    String second=s.nextLine();
    if(first.equalsIgnoreCase(second)){
      System.out.println("---------------");
      System.out.println("the strings are same");
    }else{
      System.out.println("---------------");
      System.out.println("the strings are different");
    }
  }
}