import java.io.*;
class EmployeeTest
{
	public EmployeeTest(){ }

	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.setName(args[0]);
		System.out.println("Employee Name is "+ emp.getName());
	}
}