
import java.io.*; 
import java.util.Scanner;
import java.util.Random;

public class starter
{
    public static void main(String[] args) throws IOException {
        Testers test = new Testers();
        Scanner scan = new Scanner(System.in);
        String res;
        String str = "";
        System.out.println("Hello!");    
        while(true){
        str = scan.nextLine();
        res = test.response(str);
        System.out.println(res);
        if(str.equals("goodbye")){
            break;
        }
    }
    }
    
}
