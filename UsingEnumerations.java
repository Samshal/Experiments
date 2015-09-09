import java.util.*;

class UsingEnumerations
{
	public static void main(String[] args) {
		Enumeration day;
		Vector d = new Vector();
		d.addElement(new String("Monday"));
		d.addElement(new String("Tuesday"));
		day = d.elements();

		while (day.hasMoreElements())
		{
			System.out.println(day.nextElement());
		}
	}
}