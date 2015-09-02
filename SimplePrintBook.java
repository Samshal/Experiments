import java.awt.*;
import java.awt.print.*;

public class SimplePrintBook implements Printable
{
	private static Font fnt = new Font("Helvetica", Font.PLAIN, 24);
	public static void main(String[] args)
	{
		//Get a printer job
		PrinterJob job = PrinterJob.getPrinterJob();
		Book bk = new Book();
		bk.append(new SimplePrintBook(), job.defaultPage(), 5);
		job.setPageable(bk);
		if (job.printDialog())
		{
			try
			{
				job.print();
			}
			catch(Exception e)
			{

			}
		}
		System.exit(0);
	}

	public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException
	{
		g.setFont(fnt);
		g.setColor(Color.GREEN);
		g.drawString("Page " + (pageIndex + 1), 100, 100);
		return Printable.PAGE_EXISTS;
	}
}