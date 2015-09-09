import java.util.Random;
public class RandGen
{
	public RandGen()
	{
		Random randomObj = new Random();
		double my = randomObj.nextDouble();
		System.out.println(my);
	}

	public static void main(String[] args)
	{
		new RandGen();
		sum(10, 2, 54, 6);
	}


	public static void sum(int...params)
	{
		System.out.println("You entered "+params.length+" parameters");
	}
}