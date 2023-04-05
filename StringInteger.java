import java.util.Scanner;
class StringInteger{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number as String: ");
    String input=s.nextLine();
   
    System.out.println("--------------");
    int num=Integer.parseInt(input);
    System.out.println("--------------");
    System.out.println("the number as integer is: "+num);
   
    
  }
}