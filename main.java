import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class Main{
	public static void main(String[] args)
	{
		Main talker = new Main();
		
		System.out.println ();
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println("");
			statement = in.nextLine();
		}
	}

}
