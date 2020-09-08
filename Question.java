import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;

public class Question extends JFrame implements MouseListener,ActionListener
{
private JLabel userLabel1,imgLabel;
private JButton btnYES,btnNO;
private ImageIcon img;
private Font f1;
private FoolGame fg;
private JPanel panel;
public int X=590;
public int Y=220;
public int r1;
public int r2;

public Question(FoolGame fg)
	{
		super("Fool Game Question");
		
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		f1=new Font("Arial",Font.ITALIC+Font.BOLD,50);
		
		userLabel1 = new JLabel("ARE YOU A FOOL??");
		userLabel1.setBounds(300,20,1000,200);
		userLabel1.setForeground(Color.PINK);
		userLabel1.setFont(f1);
		panel.add(userLabel1);
		
			
	   btnYES = new JButton("YES");
	   btnYES.setBounds(450,220,120,30);
	   btnYES.setBackground(Color.BLUE);
	   btnYES.setForeground(Color.white);
	   btnYES.addMouseListener(this);
	   btnYES.addActionListener(this);
	   panel.add(btnYES);
		
       btnNO = new JButton("NO");
   	   btnNO.setBounds(X,Y, 120,30);
	   btnNO.setBackground(Color.RED);
	   btnNO.setForeground(Color.white);
	   btnNO.addMouseListener(this);
       btnNO.addActionListener(this);
	   panel.add(btnNO);
	   
	   
	  img = new ImageIcon("tenor.gif");
      imgLabel = new JLabel(img);
	  imgLabel.setBounds(0,190,380,650);
	  panel.add(imgLabel);
	 	
		
	  
	  img = new ImageIcon("Question.jpg");
      imgLabel = new JLabel(img);
	  imgLabel.setBounds(0,0,1366,768);
	  panel.add(imgLabel);
	 	
		
      this.add(panel);
		
	
}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{

	if(me.getSource().equals(btnYES))
	{
		btnYES.setBackground(Color.BLUE);
	    btnYES.setForeground(Color.WHITE);
	}
	else if(me.getSource().equals(btnNO))
	{
		btnNO.setBackground(Color.BLUE);
		btnNO.setForeground(Color.WHITE);	
		
		Random r3 = new Random();
		
		r1 = r3.nextInt(250);
		r2 = r3.nextInt(450);
		this.X = r1;
		this.Y = r2;
		
		btnNO.setBounds(X, Y, 120, 30);	
		
	}
		
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(btnYES))
		{
			btnYES.setBackground(Color.PINK);
			btnYES.setForeground(Color.BLACK);
		}
		
	   else if (me.getSource().equals(btnNO))
		{
			btnNO.setBackground(Color.PINK);
			btnNO.setForeground(Color.BLACK);
		}
		
		else{}
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnYES.getText()))
		{
			
		    btnNO.setBounds(590, 220, 120, 30);
			Fool f = new Fool(this);
			f.setVisible(true);
			this.setVisible(false);
			
			
		}
		else if(str.equals(btnNO.getText()))
		{
			btnNO.setBounds(590, 220, 120, 30);
			Genius g = new Genius(this);
			g.setVisible(true);
			this.setVisible(false);
			

		}
		
		else {}
	}

}

