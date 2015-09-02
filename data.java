import java.util.StringTokenizer;
class data
{
	static String str = "The StringTokenizer Class; implement; enumeration interface.";
	public data()
	{
		//do nothing yet
	}

	public static void main(String args[])
	{
		StringTokenizer stObj = new StringTokenizer(str, ";");
		while(stObj.hasMoreTokens())
		{
			String a = stObj.nextToken();
			System.out.println(a);
		}
	}
}