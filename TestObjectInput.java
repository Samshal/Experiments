import java.io.*;
import java.util.Date;

public class TestObjectInput
{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis=  new FileInputStream("C:/data/StudentManagementSystem/Name.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		String str = (String)ois.readObject();
		Date date = (Date)ois.readObject();
		System.out.println(str+date);
	}
}