import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font.*;

public class Genius extends JFrame implements MouseListener, ActionListener
{
	private JLabel userLabel1,userLabel2,imgLabel,imgLabel2;
	private JButton btnAgain,btnExit;
	private ImageIcon img;
	private JPanel panel;
	private Font f1;
	private Font f2;
	private Question q;
	
	public Genius(Question q)
	{
		super("Genius");
		this.q = q;
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		f1 = new Font("Cambria", Font.PLAIN+Font.BOLD,90);
		f2 = new Font("Arial",Font.ITALIC,70);
		userLabel1 = new JLabel("YES,,");
		userLabel1.setBounds(650,48,660,75);
		userLabel1.setFont(f1);
		userLabel1.setForeground(Color.ORANGE);
		userLabel1.setBackground(Color.WHITE);
		//userLabel1.setOpaque(true);
		panel.add(userLabel1);
		
		userLabel2 = new JLabel("YOU ARE A GENIUS,,");
		userLabel2.setBounds(600,145,710,75);
		userLabel2.setFont(f2);
		userLabel2.setForeground(Color.ORANGE);
		userLabel2.setBackground(Color.WHITE);
		//userLabel2.setOpaque(true);
		panel.add(userLabel2);
		
		btnAgain = new JButton("Again");
		btnAgain.setBounds(450,550,120,30);
		btnAgain.setBackground(Color.BLUE);
		btnAgain.setForeground(Color.WHITE);
		btnAgain.addMouseListener(this);
		btnAgain.addActionListener(this);
		panel.add(btnAgain);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(590,550, 120,30);
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.WHITE);
		btnExit.addMouseListener(this);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		
		img = new ImageIcon("Happy.gif");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 100, 400, 600);
		panel.add(imgLabel);
		
		img = new ImageIcon("tenor1.gif");
		imgLabel2 = new JLabel(img);
		imgLabel2.setBounds(550, 320,1366, 540);
		panel.add(imgLabel2);
		
		
		
		img = new ImageIcon("Geniuss.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 1366, 768);
		panel.add(imgLabel);
		
	 this.add(panel);

	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(btnAgain))
		{
			btnAgain.setBackground(Color.BLUE);
			btnAgain.setForeground(Color.WHITE);
		}
		
	   else if (me.getSource().equals(btnExit))
		{
			btnExit.setBackground(Color.RED);;
			btnExit.setForeground(Color.WHITE);
		}
		
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(btnAgain))
		{
			btnAgain.setBackground(Color.BLUE);
			btnAgain.setForeground(Color.WHITE);
			
		}
		
	   else if (me.getSource().equals(btnExit))
		{
			btnExit.setBackground(Color.RED);
			btnExit.setForeground(Color.WHITE);
			
		}
		
		else{}
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnAgain.getText()))
		{
			q.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		
		else {}
	}
	
	
	
}