class maths
{
	public static void main(String args[])
	{
		double variable = 4.3;
		double cVariable = Math.ceil(variable);
		double fVariable = Math.floor(variable);
		int iVariable1  = 3;
		int iVariable2 = 5;
		int minVar, maxVar;
		minVar = Math.min(iVariable1, iVariable2);
		maxVar = Math.max(iVariable2, iVariable1);
		System.out.println("Ceil: " + cVariable);
		System.out.println("Floor: "+ fVariable);
		System.out.println(change("min", iVariable1, iVariable2) + minVar);
		System.out.println(change("max", iVariable2, iVariable1) + maxVar);

		String name = "My name is Samuel";
		String old = "Arrgh! Hate that";
		char[] ch = old.toCharArray();
		name.getChars(0, 8, ch, 0);
		System.out.println(ch);



		//playing with the trim function
		String aName = "              NIIT CAMPUS     ";
		String aNameTrimmed = aName.trim();
		System.out.println(aName);
		System.out.println(aNameTrimmed);


		//working around the indexof operator
		String iWord = "A Word";
		int ioWord = iWord.indexOf('W');
		System.out.println(ioWord);
	}

	private static String change(String var0, int var1, int var2)
	{
		String val = "The " + var0 + " of "+ var1 + " & " + var2 + " is ";
		return val;
	}
}