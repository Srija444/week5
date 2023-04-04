import java.util.Scanner;
public class String56{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string");
  String str=sc.nextLine();
  int a_count=0,o_count=0,d_count=0,s_count=0;
  int u_count=0,l_count=0;
    for(int i=0;i<str.length();i++) {
                  
if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
                       a_count++;
                   }
                   else if(str.charAt(i)==' '){
                       o_count++;
                   }
                    else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                       d_count++;
                   }
                   else {
                       s_count++;
                   }
       
      if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        u_count++;
      }
      else{
        l_count++;
      }
                   }
   System.out.println("total number of alaphabets are: " +a_count);
  System.out.println("--------------");
   System.out.println("total number of spaces are: " +o_count);
  System.out.println("--------------");
   System.out.println("total number of digits are: " +d_count);
  System.out.println("--------------");
   System.out.println("total number of special characters are: " +s_count);
  System.out.println("--------------");
   
  System.out.println("total number of uppercase alphabets are: " +u_count);
  System.out.println("--------------");
  System.out.println("total number of lower case alphabets are: " +l_count); 
}

}