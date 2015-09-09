public class Area{
	protected double area;
	final private double pi = (double)(22/7);
	public Area(float radius)
	{
		double r_squared = Math.pow((double)radius, 2);
		area = pi * r_squared;
		System.out.println(area);
	}

	public Area(int length)
	{

	}

	public Area(int length, int breadth)
	{

	}

	public static void main(String[] args)
	{
		Area ar = new Area(3.5f);
	}
}