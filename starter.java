
import java.io.*; 
import java.util.Scanner;
import java.util.Random;
/**
 * This is the class used to start the bot and take user imput
 * and is also used to call other methods in the bot.
 *
 * @author Josh Lawless, Hunter Stewart, Drew Malapanes.
 * @version 12/12/19
 */
public class starter
{
    public static void main(String[] args) throws IOException {
        Testers test = new Testers();
        Scanner scan = new Scanner(System.in);
        String res;
        String str = "";
        System.out.println("    __  _____       ________                              __ ");                                 
        System.out.println("   /  |/  / /_     / ____/ /__ _   _____  ________  _____/ /_");
        System.out.println("  / /|_/ / __/    / /   / / _ \\ | / / _ \\/ ___/ _ \\/ ___/ __/");
        System.out.println(" / /  / / /__    / /___/ /  __/ |/ /  __/ /  /  __(__  ) /_  ");
        System.out.println("/_/  /_/\\__(_)   \\____/_/\\___/|___/\\___/_/   \\___/____/\\__/  ");
        System.out.println("                                                             ");
        System.out.println("Say Goodbye to End.");
        System.out.println("");
        System.out.println("Oh, its you. Hi.");    
        while(true){
        str = scan.nextLine();
        str = str.trim();
        str = str.toLowerCase();
        str = str + " ";
        res = test.response(str);
        System.out.println(res);
        if(str.equals("goodbye ")){
            break;
        }
    }
    }
    
}
