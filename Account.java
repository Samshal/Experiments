class Account
{
	public String accountNumber;
	public String name;
	public int age;
	public float balance;
	public Account()
	{
		this.accountNumber = "000-00-0000";
		this.name = "John Anon Doe";
		this.age = (int)0;
		this.balance = (float)0;
	}

	public String getAccountNumber()
	{
		return this.accountNumber;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public float getBalance()
	{
		return this.balance;
	}
}