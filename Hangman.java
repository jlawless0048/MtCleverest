
/**
 * Write a description of class Hangman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Hangman
{
    public static void main(String [] args)throws IOException
        int count2 = 0;
        String guess;
        
        Scanner scanboi = new Scanner(System.in);
        Random randy = new Random();
        
    Scanner reader = new Scanner(new File("texts/keys.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys.txt")); 
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
        
    while (true){
        while (true){
            while (true){
                try{
                    System.out.println("Select a Square.");
                    guess = scanboi.nextLine();
                    break;
                } catch (Exception e){
                    System.out.println("That's not valid!");
                    scanboi.nextLine();
                }
            }
            if (guess.length() != 1){
                System.out.println("That's not valid!");
            }
    }
}
}
}
