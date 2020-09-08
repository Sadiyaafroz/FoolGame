import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;

public class FoolGame extends JFrame implements MouseListener, ActionListener
{
private JLabel userLabel1,userLabel2,imgLabel,imgLabel1,imgLabel2;
private JButton btnPlay,btnIgnore;
private ImageIcon img;
private JPanel panel;
private Font f1;
private Font f2;

public FoolGame()
{
    super("This is a Fool Game");
    this.setSize(1366,768);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel = new JPanel();
	panel.setLayout(null);
		
	f1 = new Font("Cambria", Font.PLAIN + Font.BOLD,70);
	f2 = new Font("Arial", Font.ITALIC,40);
	
	userLabel1=new JLabel("WELCOME");
	userLabel1.setBounds(450,30,1000,100);
	userLabel1.setFont(f1);
	userLabel1.setForeground(Color.white);
	
	panel.add(userLabel1);
	
	
	userLabel2=new JLabel("Do You Want To Play This Game??");
	userLabel2.setBounds(250,50,1000,350);
	userLabel2.setFont(f2);
	userLabel2.setForeground(Color.white);
	panel.add(userLabel2);
	
	
	btnPlay = new JButton("Play");
	btnPlay.setBounds(450,550,120,30);
	btnPlay.setBackground(Color.BLUE);
	btnPlay.setForeground(Color.white);
	btnPlay.addMouseListener(this);
	btnPlay.addActionListener(this);
	panel.add(btnPlay);
		
	btnIgnore = new JButton("Ignore");
	btnIgnore.setBounds(590,550, 120,30);
	btnIgnore.setBackground(Color.RED);
	btnIgnore.setForeground(Color.white);
	btnIgnore.addMouseListener(this);
    btnIgnore.addActionListener(this);
	panel.add(btnIgnore);
	
		
    img = new ImageIcon("giphy (3).gif");
	imgLabel1 = new JLabel(img);
	imgLabel1.setBounds(0,200,400,700);
	panel.add(imgLabel1);
	
	
    img = new ImageIcon("giphy.gif");
	imgLabel2 = new JLabel(img);
	imgLabel2.setBounds(500,0,1366,250);
	panel.add(imgLabel2);
	 	 	
	
    img = new ImageIcon("confused.jpg");
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
		if(me.getSource().equals(btnPlay))
		{
			btnPlay.setBackground(Color.GREEN);
			btnPlay.setForeground(Color.WHITE);
		}
		
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource().equals(btnPlay))
		{
			btnPlay.setBackground(Color.BLUE);
			btnPlay.setForeground(Color.WHITE);
		}
		
		else{}
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnPlay.getText()))
		{
			Question q = new Question(this);
			q.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(btnIgnore.getText()))
		{
			System.exit(0);
		}
		else{}
		
		
	}
	
	
}