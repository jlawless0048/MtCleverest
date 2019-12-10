import java.io.*; 
import java.util.Scanner;
import java.util.Random;

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

   public boolean isKeyFood(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_foods.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_foods.txt")); 
    int arrayCount = 0;
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] key = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        key[count] = stringuno;
        count++;
    }
    
    for(String element : key){
        if(str.contains(element)){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyPet(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_pets.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_pets.txt")); 
    int arrayCount = 0;
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] key = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        key[count] = stringuno;
        count++;
    }
    
    for(String element : key){
        if(str.contains(element) ){
            return true;
        } 
    }
    return false;
   }
   
   public String responceRandom() throws IOException{
    Scanner reader = new Scanner(new File("texts/responces/random.txt"));
    Scanner readerTwo = new Scanner(new File("texts/responces/random.txt")); 
    Random rand = new Random();
    int arrayCount = 0;
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] resRan = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        resRan[count] = stringuno;
        count++;
    }
    
    return resRan[rand.nextInt(count)];
   }
    
   public String responce(String str) throws IOException {
       boolean test1, test2;
       String test3;
       test1 = isKeyFood(str);
       test2 = isKeyPet(str);
       test3 = isPhrase(str);
       
       if(test1 == true){
           Scanner reader = new Scanner(new File("texts/responces/key_food_responce.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responces/key_food_responce.txt")); 
           Random rand = new Random();
        int arrayCount = 0;
            while(reader.hasNext()){
                reader.nextLine();
            arrayCount++;
        }   
        String[] resRan = new String[arrayCount];
        int count = 0;
        while (readerTwo.hasNext()){
            String stringuno = readerTwo.nextLine();
            resRan[count] = stringuno;
            count++;
        }
    
        return resRan[rand.nextInt(count)];
        }
       
       else if(test2 == true){
          Scanner reader = new Scanner(new File("texts/responces/key_pets_responce.txt"));
          Scanner readerTwo = new Scanner(new File("texts/responces/key_pets_responce.txt")); 
          Random rand = new Random();
        int arrayCount = 0;
           while(reader.hasNext()){
                reader.nextLine();
            arrayCount++;
        }   
        String[] resRan = new String[arrayCount];
        int count = 0;
        while (readerTwo.hasNext()){
            String stringuno = readerTwo.nextLine();
            resRan[count] = stringuno;
            count++;
        }
    
        return resRan[rand.nextInt(count)];
        }
       return "This is bad";
    }
    
}
