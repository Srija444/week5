import java.util.Scanner;
class RemoveAllOccurance{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      System.out.println("enter the string: ");
      String input=s.nextLine();
     System.out.println("------------");
    System.out.println("enter which character to remove: ");
    char characterRemove=s.next().charAt(0);
    String output="";
    for(int i=0;i<input.length();i++){
      char c=input.charAt(i);
      if(c!=characterRemove){
        output=output+c;
        
      }
    }
    System.out.println("------------");
    System.out.println("the output is: "+output);
     
}
}