import java.io.*; 
import java.util.Scanner;

public class Testers
{
   public Testers(){
   }
   public String isPhrase(String str) throws IOException {    
    Scanner reader = new Scanner(new File("texts/phrases.txt"));
    Scanner readerTwo = new Scanner(new File("texts/phrases.txt")); 
    int arrayCount = 0;
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] phrase = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        phrase[count] = stringuno;
        count++;
    }
    
    for(String element : phrase){
        if(str.contains(element)){
            return element + "_True";
        } 
    }
    return "false";
   }

   public String isKey(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys.txt")); 
    int arrayCount = 0;
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] phrase = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        phrase[count] = stringuno;
        count++;
    }
    
    for(String element : phrase){
        if(str.contains(element)){
            return element + "_true";
        } 
    }
    return "false";
   }
   
  // public String responce(String str) throws IOException {
    //   if(str == "false")
            
    //}
    
}
