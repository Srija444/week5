import java.util.Scanner;
import java.util.Arrays;
class AnagramString{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter first string: ");
    String first=s.nextLine();
    System.out.println("----------------");
    System.out.println("enter second string: ");
    String second=s.nextLine();
    System.out.println("----------------");
    //taking this strings and converting them to  character arrays so that we can do sorting
    //battle---tablet
    boolean isAnagram=true;
    if(first.length() != second.length()){
      isAnagram=false;
    }else{
      char[] c1=first.toCharArray();
      char[] c2=second.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      for(int i=0;i<c1.length;i++){
        if(c1[i] != c2[i]){
          isAnagram=false;
          break;
        }
      }
    }
    if(isAnagram){
      System.out.println(first+" and "+second+" are anagrams");
      System.out.println("----------------");
    }else{
      System.out.println(first+" and "+second+" are not anagrams");
      System.out.println("----------------");
    }
  }
    }