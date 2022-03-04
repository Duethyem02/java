import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class trafficlights extends JFrame implements ActionListener
{
	JRadioButton r1,r2,r3;
	ButtonGroup b = new ButtonGroup();
	
	public void paint(Graphics g)
	{
		
	}
		
	public void actionPerformed(ActionEvent e)
	{
	 
	}
	
	trafficlights()
	{
	 	
	 	setLayout(new FlowLayout(FlowLayout.RIGHT));
	 	
	 	r1 = new JRadioButton("RED");
		r1.addActionListener(this);
		
	 	r2 = new JRadioButton("YELLOW");
	 	r2.addActionListener(this);
	 	
	 	r3 = new JRadioButton("GREEN");
	 	r3.addActionListener(this);
	 	
	 	add(r1);add(r2);add(r3);
	 	
	 	b.add(r1);b.add(r2);b.add(r3);
	 	
	 	setSize(500,500);
	 	setVisible(true);
	 }
	 public static void main(String args[])
	 {
	 	new trafficlights();
	 }
}
