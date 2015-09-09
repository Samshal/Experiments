public class Applicant
{
	int Age;
	Candidate cand;
	public Applicant()
	{
		System.out.println("Running");
		cand = new Candidate();
	}

	public void AcceptCand()
	{
		System.out.println("Accepted");
	}

	public void callCand()
	{
		cand.detect();
	}

	public class Candidate
	{
		public void detect()
		{
			System.out.println("Detected");
		}
	}

	public static void main(String[] args)
	{
		Applicant app = new Applicant();
		app.AcceptCand();
		app.callCand();
	}
}