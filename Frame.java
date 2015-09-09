import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame extends JFrame
{
	Container container;
	JTabbedPane tpane = new JTabbedPane();
	JPanel home = new JPanel();
	JPanel edit = new JPanel();
	JPanel view = new JPanel();
	JPanel exit = new JPanel();
	public Frame()
	{
		super("GUI Tabbed Panel");
		container = getContentPane();
		JPanel jpanel = new JPanel(new GridLayout(1,1));
		tpane.addTab("Home", home);
		tpane.addTab("Edit", edit);
		tpane.addTab("View", view);
		tpane.addTab("Exit", exit);
		jpanel.add(tpane);
		container.add(jpanel);
		setSize(350, 400);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Frame();
	}
}