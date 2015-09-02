class emailValidator
{
	public emailValidator(String email)
	{
		if (email == "")
		{
			print("Email cannot be empty");
		}
		else
		{
			if (email.indexOf('@') == -1 || email.indexOf('.') == -1)
			{
				print("Email must contain an @ symbol and a dot (.) symbol");
			}
			else
			{
				if (!validDotLoc(email) || !validthirdInd(email))
				{
					print("Invalid Email, it contains a dot immediately after the @ symbol");
				}
				else
				{
					print("Your email is valid");
				}
			}
		}
	}

	public void print(String sent)
	{
		System.out.println(sent);
	}

	protected boolean validDotLoc(String email)
	{
		// if email = samuel@me.com
		//chararray = ['s', 'a', ...]
		int atLoc = email.indexOf('@');
		char[] emailA = email.toCharArray();
		if (emailA[atLoc + 1] == '.' || emailA[atLoc - 1] == '.')
		{
			return fals e;
		}
		return true;
	}

	protected boolean validthirdInd(String email)
	{
		int length = email.length();
		char[] emailA = email.toCharArray();
		if (emailA[length - 1] == '.')
		{
			return false;
		}
		return true;
	}


	public static void main(String args[])
	{
		new emailValidator(args[0]);
	}
}