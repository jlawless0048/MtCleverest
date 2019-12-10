import java.io.*; 
import java.util.Scanner;
import java.util.Random;

public class testetts
{
    public static void main(String[] args) throws IOException {
        Testers test = new Testers();
        Scanner scan = new Scanner(System.in);
        String str, res;
        System.out.println("Enter: ");
        str = scan.nextLine();
        res = test.responce(str);
        System.out.println(res);
    }
}
