import java.io.*;

class TestFileReader
{
	public static void main(String[] args)
	{
		File f = null;
		try
		{
			f = new File("C:/Data/StudentManagementSystem/Name.txt");
			FileReader reader = new FileReader(f);
			int ch;
			while((ch=reader.read()) != -1)
			{
				Thread.sleep(200);
				System.out.print((char)ch);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Could not locate file " + f.getName());
		}
		catch(IOException io)
		{
			System.out.println("Could not read from file "+ f.getName());
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread was interrupted");
		}
		catch(Exception e)
		{
			System.out.println("An unknown error has occurred");
		}
	}
}