import java.io.*;

public class TestBufferedReader
{
	public static void main(String[] args)
	{
		System.out.print("Please enter text : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		try
		{
			str = br.readLine();
		}
		catch(IOException ioe)
		{
			System.out.println("Sorry, could not read from the keyboard");
		}

		System.out.println("The text entered is: " );
		System.out.println(str);
	}
}