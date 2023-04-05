import java.util.Scanner;
class ConcatStr{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the first string: ");
    String name1=s.nextLine();
    System.out.println("enter the second string: ");
    String name2=s.nextLine();
    int length1=name1.length();
    int length2=name2.length();
    char[] concat=new char[length1+length2];
    for(int i=0;i<length1;i++){
      concat[i]=name1.charAt(i);
    }
    for(int i=0;i<length2;i++){
      concat[length1+i]=name2.charAt(i);
    }
    String concatedString=new String(concat);
    System.out.println("--------------");
    System.out.println("the concated string is: "+concatedString);
  }
}