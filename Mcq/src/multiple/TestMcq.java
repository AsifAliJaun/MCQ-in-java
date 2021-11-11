package multiple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TestMcq extends JFrame implements ActionListener
{
	
		JPanel panCenter=new JPanel();
		JPanel labSpacer=new JPanel();
		
		JLabel l1=new JLabel("Q1 : WHICH OF THE FOLLOWING IS NOT A JAVA FEATURE?");
		ButtonGroup b1=new ButtonGroup();
		JRadioButton OptionA1= new JRadioButton("USE OF POINTER");
		JRadioButton OptionA2= new JRadioButton("DYNAMIC");
		JRadioButton OptionA3= new JRadioButton("OBJECT ORIENTED");
		JRadioButton OptionA4= new JRadioButton("ARCHITECTURE NEUTRAL");
		
		JLabel l2=new JLabel("Q2 : WHICH PROGRAMMING LANGUAGE IS MOSTLY USED FOR WEB DEVELOPMENT?");
		ButtonGroup b2=new ButtonGroup();
		JRadioButton OptionB1= new JRadioButton("JAVA");
		JRadioButton OptionB2= new JRadioButton("PYTHON");
		JRadioButton OptionB3= new JRadioButton("JAVASCRIPT");
		JRadioButton OptionB4= new JRadioButton("RUBY");
		
		JLabel l3=new JLabel("Q3 : WHO OWNS THE COMPANY SPACE X?");
		ButtonGroup b3=new ButtonGroup();
		JRadioButton OptionC1= new JRadioButton("JEFF BEZOS");
		JRadioButton OptionC2= new JRadioButton("CARL MARTIN");
		JRadioButton OptionC3= new JRadioButton("BILL GATES");
		JRadioButton OptionC4=new JRadioButton("ELON MUSK");
		
		JButton btn = new JButton("SUBMIT");

				public static void main(String[] args) 
				{
					TestMcq fr=new TestMcq();
					fr.setVisible(true);

				}
				public TestMcq()
				{
					setLayout(new BorderLayout());
					setSize(800,800);
					setTitle("MULTIPLE CHOICE QUESTIONS");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					b1.add(OptionA1);
					b1.add(OptionA2);
					b1.add(OptionA3);
					b1.add(OptionA4);
					
					b2.add(OptionB1);
					b2.add(OptionB2);
					b2.add(OptionB3);
					b2.add(OptionB4);
				
					b3.add(OptionC1);
					b3.add(OptionC2);
					b3.add(OptionC3);
					b3.add(OptionC4);
					
					panCenter.setLayout(new GridLayout(0,1));
					panCenter.add(l1);
					panCenter.add(OptionA1);
					panCenter.add(OptionA2);
					panCenter.add(OptionA3);
					panCenter.add(OptionA4);
					
					
					
					panCenter.add(l2);
					panCenter.add(OptionB1);
					panCenter.add(OptionB2);
					panCenter.add(OptionB3);
					panCenter.add(OptionB4);
					
                  
					
					panCenter.add(l3);
					panCenter.add(OptionC1);
					panCenter.add(OptionC2);
					panCenter.add(OptionC3);
					panCenter.add(OptionC4);
					
					btn.addActionListener(this);
					panCenter.add(btn);
					
					add(panCenter,BorderLayout.CENTER);
				}		
			
			
	  public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn)
		{
			int score=0;
			if(OptionA1.isSelected())
			{
				score++;
			}	
			if(OptionB3.isSelected())
			{
				score=score+1;
		    }

			if(OptionC4.isSelected())
			{
				score=score+1;
			}
	      	JOptionPane.showMessageDialog(this,"YOU SCORED "+score+" OUT OF 3");
        	b1.clearSelection();
        	b2.clearSelection();
        	b3.clearSelection();
	}
	}
}
 



