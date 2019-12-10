import java.util.Scanner;
import java.io.*;
/**
 *MAIN
 */
public class main{
	public static void main(String[] args)
	{
		System.out.println ("Hello...");
		Scanner res = new Scanner (System.in);
		String response = res.nextLine();
		response = response.toLowerCase();
		
		while (!response.equals("bye") || !response.equals("goodbye")
		|| !response.equals("end"))
		{
			System.out.println("");
			response = res.nextLine();
		}
		System.out.println ("Bye...");
	}
}
