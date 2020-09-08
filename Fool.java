import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font.*;

public class Fool extends JFrame implements MouseListener, ActionListener
{
	private JLabel userLabel1,userLabel2, imgLabel,imgLabel1;
	private JButton btnAgain,btnExit;
	private ImageIcon img;
	private JPanel panel;
	private Font f1;
	private Font f2;
	private Question q;
	
	public Fool(Question q)
	{
		super("Fool Guy");
		this.q = q;
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		f1 = new Font("Arial", Font.ITALIC+Font.BOLD,70);
		f2 = new Font("Arial", Font.ITALIC,50);
		
		userLabel1 = new JLabel("Opsss,,,,");
		userLabel1.setBounds(480,10,1000,100);
		userLabel1.setFont(f1);
		userLabel1.setForeground(Color.BLUE);
		userLabel1.setBackground(Color.GRAY);
		panel.add(userLabel1);
		
		userLabel2 = new JLabel("YOU ARE A FOOLISH");
		userLabel2.setBounds(600,20,1000,350);
		userLabel2.setFont(f2);
		userLabel2.setForeground(Color.BLUE);
		userLabel2.setBackground(Color.RED);
		panel.add(userLabel2);
		
		btnAgain = new JButton("Again");
		btnAgain.setBounds(450,550,120,30);
		btnAgain.setBackground(Color.PINK);
		btnAgain.setForeground(Color.BLACK);
		btnAgain.addMouseListener(this);
		btnAgain.addActionListener(this);
		panel.add(btnAgain);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(590,550, 120,30);
		btnExit.setBackground(Color.GREEN);
		btnExit.setForeground(Color.BLACK);
		btnExit.addMouseListener(this);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		
		img = new ImageIcon("giphy (1).gif");
		imgLabel1 = new JLabel(img);
		imgLabel1.setBounds(0, 200, 400 ,700);
		panel.add(imgLabel1);
		
		
		img = new ImageIcon("Looser.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 1366 ,768);
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
			btnExit.setBackground(Color.BLUE);;
			btnExit.setForeground(Color.WHITE);
		}
		
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(btnAgain))
		{
			btnAgain.setBackground(Color.PINK);
			btnAgain.setForeground(Color.BLACK);
			
		}
		
	   else if (me.getSource().equals(btnExit))
		{
			btnExit.setBackground(Color.RED);
			btnExit.setForeground(Color.BLACK);
			
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