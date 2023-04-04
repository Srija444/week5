import java.util.*;
class String13{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string: ");
      String input=s.nextLine();
      String[] words=input.split(" ");
      for(int i=0;i<words.length;i++){
         int count=1;
        for(int j=i+1;j<words.length;j++){
          if(words[i].equalsIgnoreCase(words[j])){
            count++;
            words[j]="";
            
          }
        }
        if(count==1 && words[i]!=""){
          System.out.println("the unique words are: "+words[i]);
        }else if(words[i]!=""){
          System.out.println(words[i]+": is not unique.");
        
        }
      }
      
    
    }
  
  }
