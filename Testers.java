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
   public boolean isKeyQuestion(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_question.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_question.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyBored(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_bored.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_bored.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyFamily(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_family.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_family.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   public boolean isKeyBye(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_bye.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_bye.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyFiller(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_filler.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_filler.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   
   public boolean isKeyAnimal(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_animals.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_animals.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "s ")|| str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyHello(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_hello.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_hello.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyHoliday(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_holiday.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_holiday.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public boolean isKeyNoNoWord(String str) throws IOException { 
    Scanner reader = new Scanner(new File("texts/keys/keys_nonoword.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/keys_nonoword.txt")); 
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
        if(str.contains(element + " ") || str.contains(element + ".") || str.contains(element + "!") || str.contains(element + "?") || str.contains(element + "-") || str.contains(element + ",")){
            return true;
        } 
    }
    return false;
   }
   
   public String responseRandom() throws IOException{
    Scanner reader = new Scanner(new File("texts/responses/random.txt"));
    Scanner readerTwo = new Scanner(new File("texts/responses/random.txt")); 
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
   public String phraseresponse(String str) throws IOException{
       return "";
    }
   public String response(String str) throws IOException {
       boolean testFood, testPet, testFiller, testBye, testBored, testFamily, testAnimal, testHello, testHoliday, testNoNoWord, testQuestion;
       String testPhrase , gate;
       testFood = isKeyFood(str);
       testPet = isKeyPet(str);
       testBye = isKeyBye(str);
       testFiller = isKeyFiller(str);
       testBored = isKeyBored(str);
       testFamily = isKeyFamily(str);
       testAnimal = isKeyAnimal(str);
       testPhrase = isPhrase(str);
       testHello = isKeyHello(str);
       testNoNoWord = isKeyNoNoWord(str);
       testQuestion = isKeyQuestion(str);
       testHoliday = isKeyHoliday(str);
       Scanner tacHang = new Scanner(System.in);
       if(str.contains("goodbye")){
           return "Oh, I see how it is. Bye.";
        }
       else if(str.contains("tictactoe")){
           System.out.println("Do you want to play tick tac toe?");
           gate = tacHang.nextLine();
           if(gate.contains("yes")){
                Tictactoe tick = new Tictactoe();
                tick.startGame();
            }
           return "";
        }
        
       else if(str.contains("hangman")){
           System.out.println("Do you want to play hangman?");
           gate = tacHang.nextLine();
           if(gate.contains("yes")){
                Hangman hanger = new Hangman();
                hanger.startGame();
            }
           return "";
        }

       else if(testPhrase.contains("_True"))
            return phraseresponse(testPhrase);
            
        else if(testNoNoWord == true){
           Scanner reader = new Scanner(new File("texts/responses/key_nonoword_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_nonoword_response.txt")); 
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
        else if(testFiller == true){
           Scanner reader = new Scanner(new File("texts/responses/key_filler_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_filler_response.txt")); 
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
        
        else if(testHoliday == true){
           Scanner reader = new Scanner(new File("texts/responses/key_holiday_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_holiday_response.txt")); 
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
       
       else if(testQuestion == true){
           Scanner reader = new Scanner(new File("texts/responses/key_question_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_question_response.txt")); 
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
          
       else if(testBye == true){
           Scanner reader = new Scanner(new File("texts/responses/key_bye_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_bye_response.txt")); 
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
       
        else if(testBored == true){
           Scanner reader = new Scanner(new File("texts/responses/key_bored_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_bored_response.txt")); 
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
       
       else if(testFood == true){
           Scanner reader = new Scanner(new File("texts/responses/key_food_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_food_response.txt")); 
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
       
       else if(testHello == true){
           Scanner reader = new Scanner(new File("texts/responses/key_hello_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_hello_response.txt")); 
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
        
       else if(testFamily == true){
           Scanner reader = new Scanner(new File("texts/responses/key_family_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_family_response.txt")); 
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
       
       else if(testPet == true){
          Scanner reader = new Scanner(new File("texts/responses/key_pets_response.txt"));
          Scanner readerTwo = new Scanner(new File("texts/responses/key_pets_response.txt")); 
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
       else if(testAnimal == true){
           Scanner reader = new Scanner(new File("texts/responses/key_animals_response.txt"));
           Scanner readerTwo = new Scanner(new File("texts/responses/key_animals_response.txt")); 
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
       else
            return responseRandom();
    }
    
}
