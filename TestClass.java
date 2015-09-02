import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TestClass extends JFrame implements ActionListener
{
	JTextField tx1, tx2;
	JButton button;
	JPanel panel;

	public TestClass()
	{
		tx1 = new JTextField(20);
		tx2 = new JTextField(20);
		tx2.setEditable(false);
		button = new JButton("Copy");
		panel = new JPanel();
		panel.add(tx1);
		panel.add(tx2);
		button.addActionListener(this);
		panel.add(button);
		add(panel);
		setSize(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1 = tx1.getText();
		String s2 = tx2.getText();
		tx2.setText(s2 + " " + s1);
	}
	public static void main(String args[])
	{
		new TestClass();
	}
}