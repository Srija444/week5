
 
class FreString{
    public static void main(String args[]) {
        
    //Scanner s=new Scanner(System.in);
    //String str=s.nextLine();
        
        String str="hi hello hi welcome to bitLabs hi hello";
        int wordCount=1;
        String words[]=str.split(" ");
        
        for(int i=0;i<words.length;i++) {
            for(int j=i+1;j<words.length;j++) {  
            
            if(words[i].equals(words[j])) {
                wordCount++;
                words[j]=" ";
            }
                
            }
            if(words[i]!=" ") {
            System.out.println(words[i]+" : "+wordCount);
            }
            wordCount=1;
        }
 
        
    }
}