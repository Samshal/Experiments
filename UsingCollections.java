import java.util.*;

class UsingCollections
{
	public static void main(String[] args)
	{
		Hashtable hashTable;
		Enumeration names;
		double db;
		hashTable = new Hashtable();
		hashTable.put("Albert", new Double(3343.5));
		hashTable.put("Tom", new Double(454.4));
		hashTable.put("Todd", new Double(21.6));
		hashTable.put("Tom", new Double(-19.08));

		names = hashTable.keys();
		while (names.hasMoreElements())
		{
			String str = (String)names.nextElement();
			System.out.println(str + " : " + hashTable.get(str));
		}
		System.out.println();
		db = ((Double)hashTable.get("Albert")).doubleValue();
		System.out.println("Albert's new Balance: "+ hashTable.get("Albert"));
	}
}