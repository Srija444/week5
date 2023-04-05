import java.util.Scanner;
class FreChar{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string: ");
    String input=s.nextLine();
    char arr[]=input.toCharArray();
    int[] freq=new int[256];
    for(int i=0;i<arr.length;i++){
      freq[arr[i]]++;
    }
    for(int i=0;i<freq.length;i++){
      if(freq[i]!=0){
        System.out.println((char)i+" the character frequency is: "+freq[i]);
        System.out.println("----------");
      }
    }
    
  }
}