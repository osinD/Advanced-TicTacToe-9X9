package com.osinD;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2  extends JFrame implements MouseListener {
	
	
	public int tablica[][]= new int [9][9];
	private int sstep =1,fstep=1; 
	private int wx ,wy;
	private int przes;
	private int w1=0,w2=0,w3=0,w4=0,w5=0,w6=0,w7=0,w8=0,w9=0;
	private int w11=0,w22=0,w33=0,w44=0,w55=0,w66=0,w77=0,w88=0,w99=0;
	private int ww1=0,ww2=0,ww3=0,ww4=0,ww5=0,ww6=0,ww7=0,ww8=0,ww9=0;
	private int K, X;
	
	WygranaKrzyzyka Krzyzyk = new WygranaKrzyzyka();
	WygranaKola Kolo = new WygranaKola();
	

	
	public MyFrame2() {
        
		 
		 super("Kolko i Krzyzyk 9X9 # TIGER I KOBRA 2 GRACZY");
		 JPanel panel =new MyPanel1();  
		 add(panel);
		 addMouseListener( this );
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setSize(2000, 1000);
	     
	     setResizable(false);
	     setLocation(0,0);
	     setVisible(true);
	      
	     
	     
	     
}
	
	
	
	 public void paintComponent(Graphics g) {
	     Graphics2D g2d = (Graphics2D) g;
	          //dalsza cz�� metody, rysowanie itp.
	 }


	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g=this.getGraphics();
		 Font cross = new Font("Serif", Font.PLAIN, 50);
		 Font win = new Font("Serif", Font.PLAIN, 130);
			if(K<5 && X<5)
			{
		
			
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
				{
					if(tablica[i][j]==2)
					{
						g.setFont(cross);
						g.setColor(Color.blue);
						g.drawString("X", i*80+20, j*80+80);
					}
					if(tablica[i][j]==1)
					{
						g.setColor(Color.red);
						g.fillOval(i*80  +20 , (j*80 +30 ) +10, 50, 50);
					}
				}
				
			}
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(1100, 250, 100, 100);
			g.setFont(cross);
			g.setColor(Color.black);
			g.drawString(""+K, 1150, 300);
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(1100, 450, 100, 100);
			g.setFont(cross);
			g.setColor(Color.black);
			g.drawString(""+X, 1150, 500);
			
			}
			else
			{
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA�O KOLO", 50, 300);
				}
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
		//Graphics g=this.getGraphics();
		Font plainFont = new Font("Serif",Font.PLAIN,15);
		//Font cross = new Font("Serif", Font.PLAIN, 50);
		Font Ruch =new Font("News Gothic MT",Font.TRUETYPE_FONT,26);
		Font pelna = new Font("Serif", Font.PLAIN, 25);
		//Font win = new Font("Serif", Font.PLAIN, 130);
		g.setColor(Color.lightGray);
		g.fillRect(740, 0, 370, 100);

		if(fstep==1)
		{
			
		tablica[e.getX()/80][(e.getY())/80 ]=1;
		
		g.setColor(Color.red);
		g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
		fstep =2;
		sstep=2;
		wx=e.getX()/80;
		wy=(e.getY())/80 ;
		g.setColor(Color.lightGray);
		g.fillRect(1170, 0, 300, 100);
		g.setColor(Color.darkGray);
		g.setFont(Ruch);
		g.drawString("Ruch X", 1200 , 80);
		}
		
		else
		{
		if(wx==0||wx==3||wx==6)
		{
			if(wy==0||wy==3||wy==6)
			{
				przes=1;
			}
			if(wy==1||wy==4||wy==7)
			{
				przes=2;
			}
			if(wy==2||wy==5||wy==8)
			{
				przes=3;
			}
			
		}
		if(wx==1||wx==4||wx==7)
		{
			if(wy==0||wy==3||wy==6)
			{
				przes=4;
			}
			if(wy==1||wy==4||wy==7)
			{
				przes=5;
			}
			if(wy==2||wy==5||wy==8)
			{
				przes=6;
			}
			
		}
		if(wx==2||wx==5||wx==8)
		{
			if(wy==0||wy==3||wy==6)
			{
				przes=7;
			}
			if(wy==1||wy==4||wy==7)
			{
				przes=8;
			}
			if(wy==2||wy==5||wy==8)
			{
				przes=9;
			}
			
		}
		
		switch (przes) {
		
		case 1:
			if(sstep==2)
			{
			if((e.getX()/80<3&&e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0))
			{	
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
			}
			else
			{
				g.setColor(Color.black);
				g.setFont(pelna);
				g.drawString("B��DNY RUCH KRZYZYKA ", 780, 50);
			}
			}
			else
			{
				if((e.getX()/80<3&&e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0))
				{	
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA ", 780, 50);
				}
			}
			if(w1==0&&w11==0)
			{
				w11=Krzyzyk.Krzyzyk(tablica, 0, 0);
				w1=Kolo.Kolo(tablica, 0, 0);
				
			}
			if(w1==1 && ww1==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 1", 800, 80);
				g.setColor(Color.black);
				
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
				ww1=1;
				
			}
			if(w11==2 && ww1 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 1", 800, 100);
				g.setColor(Color.black);
				
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww1=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;
		case 2:
			if(sstep==2)
			{
			if((e.getX()/80<3&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
			{	
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA ", 780, 50);
				}
			}
			//if(sstep==1)
			else
			{
				if((e.getX()/80<3&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA ", 780, 50);
				}
				
			}
			
			if(w2==0&&w22==0)
			{
				w22=Krzyzyk.Krzyzyk(tablica, 0, 3);
				w2=Kolo.Kolo(tablica, 0, 3);
			}
			if(w2==1 && ww2==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 2", 800, 120);
				g.setColor(Color.black);
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww2=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w22==2 && ww2 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 2", 800, 140);
				g.setColor(Color.black);
				
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww2=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;	
		case 3:
			if(sstep==2)
			{
				if((e.getX()/80<3&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA", 780, 50);
				}
			}
			else
			{
				if((e.getX()/80<3&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA", 780, 50);
				}
				
			}

			if(w3==0&&w33==0)
			{
				w33=Krzyzyk.Krzyzyk(tablica, 0, 6);
				w3=Kolo.Kolo(tablica, 0, 6);
			}
			if(w3==1 && ww3==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 3", 800, 160);
				g.setColor(Color.black);
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww3=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w33==2 && ww3 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 3", 800, 180);
				g.setColor(Color.black);
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww3=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;
			
		case 4:
			if(sstep==2)
			{
				if(((e.getX()/80>2&& e.getX()/80<6)&&( e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
			}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA ", 780, 50);
					
				}
			}
			
			else
			{
				if(((e.getX()/80>2&& e.getX()/80<6)&&( e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA ", 780, 50);
					
				}
			}
			if(w4==0&&w44==0)
			{
				w44=Krzyzyk.Krzyzyk(tablica, 3, 0);
				w4=Kolo.Kolo(tablica, 3, 0);
			}
			if(w4==1 && ww4==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 4", 800, 200);
				g.setColor(Color.black);
				
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww4=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w44==2 && ww4 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 4", 800, 220);
				g.setColor(Color.black);
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww4=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;	
			
		case 5:
			if(sstep==2)
			{
				if(((e.getX()/80>2&&e.getX()/80<6)&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
			}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA", 780, 50);
				}
			}
			else
			{
				if(((e.getX()/80>2&&e.getX()/80<6)&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA ", 780, 50);
					
				}
			}
			if(w5==0&&w55==0)
			{
				w55=Krzyzyk.Krzyzyk(tablica, 3, 3);
				w5=Kolo.Kolo(tablica, 3, 3);
			}
			if(w5==1 && ww5==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 5", 800, 240);
				g.setColor(Color.black);
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww5=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w55==2 && ww5 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 5", 800, 260);
				g.setColor(Color.black);
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww5=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;
		case 6:
			if(sstep==2)
			{
				if(((e.getX()/80>2&&e.getX()/80<6)&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
			}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA ", 780, 50);
					
				}
			}
			
		
			else
			{
				if(((e.getX()/80>2&&e.getX()/80<6)&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA ", 780, 50);
					
				}
			}
			if(w6==0&&w66==0)
			{
				w66=Krzyzyk.Krzyzyk(tablica, 3, 6);
				w6=Kolo.Kolo(tablica, 3, 6);
			}
			if(w6==1 && ww6==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 6", 800, 280);
				g.setColor(Color.black);
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww6=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w66==2 && ww6 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 6", 800, 300);
				g.setColor(Color.black);
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww6=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;	
		case 7:
			if(sstep==2)
			{
				if(((e.getX()/80>5&&e.getX()/80<9)&&( e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA ", 780, 50);
				}
			}
			//if(sstep==1)
			else
			{
				if(((e.getX()/80>5&&e.getX()/80<9)&&( e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA", 780, 50);
				}
				
			}
			
			if(w7==0&&w77==0)
			{
				w77=Krzyzyk.Krzyzyk(tablica, 6, 0);
				w7=Kolo.Kolo(tablica, 6, 0);
			}
			if(w7==1 && ww7==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 7", 800, 320);
				g.setColor(Color.black);
				
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww7=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w77==2 && ww7 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 7", 800, 340);
				g.setColor(Color.black);
				
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww7=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;
		case 8:
			if(sstep==2)
			{
				if(((e.getX()/80>5&&e.getX()/80<9)&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
			}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA", 780, 50);
				}
			}
			
			
			
			else
			{
				if(((e.getX()/80>5&&e.getX()/80<9)&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA", 780, 50);
				}
			}
			
			if(w8==0&&w88==0)
			{
				w88=Krzyzyk.Krzyzyk(tablica, 6, 3);
				w8=Kolo.Kolo(tablica, 6, 3);
			}
			if(w8==1 && ww8==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 8", 800, 360);
				g.setColor(Color.black);
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww8=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w88==2 && ww8 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 8", 800, 380);
				g.setColor(Color.black);
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww8=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;	
		case 9:
			if(sstep==2)
			{
				if(((e.getX()/80>5&&e.getX()/80<9)&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
			tablica[e.getX()/80][(e.getY())/80 ]=2;
			g.setColor(Color.blue);
			g.setFont(cross);
			g.drawString("X", (e.getX()/80 )*80  +20 , ((e.getY())/80)*80 +80 );
			sstep=1;
			wx=e.getX()/80;
			wy=(e.getY())/80 ;
			g.setColor(Color.lightGray);
			g.fillRect(1170, 0, 300, 100);
			g.setColor(Color.darkGray);
			g.setFont(Ruch);
			g.drawString("Ruch O", 1200 , 80);
			}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KRZYZYKA ", 780, 50);
				}
			}
			
			else
			{
				if(((e.getX()/80>5&&e.getX()/80<9)&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
				{
				tablica[e.getX()/80][e.getY()/80]=1;
				g.setColor(Color.red);
				g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
				sstep=2;
				wx=e.getX()/80;
				wy=(e.getY())/80 ;
				g.setColor(Color.lightGray);
				g.fillRect(1170, 0, 300, 100);
				g.setColor(Color.darkGray);
				g.setFont(Ruch);
				g.drawString("Ruch X", 1200 , 80);
				}
				else
				{
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("B��DNY RUCH KOLA ", 780, 50);
				}
			}
			
			
			if(w9==0&&w99==0)
			{
				w99=Krzyzyk.Krzyzyk(tablica, 6, 6);
				w9=Kolo.Kolo(tablica, 6, 6);
			}
			if(w9==1 && ww9==0  )
			{
				g.setColor(Color.MAGENTA);
				g.setFont(plainFont);
				g.drawString("WYGRANA KOLA W POLU 9", 800, 400);
				g.setColor(Color.black);
				K++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 250, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+K, 1150, 300);
				ww9=1;
				if(K==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("Wygra�o KOLO", 50, 300);
				}
			}
			if(w99==2 && ww9 ==0)
			{
				g.setColor(Color.blue);
				g.setFont(plainFont);
				g.drawString("WYGRANA KRZYZYKA W POLU 9", 800, 420);
				g.setColor(Color.black);
				X++;
				g.setColor(Color.lightGray);
				g.fillRect(1100, 450, 100, 100);
				g.setFont(cross);
				g.setColor(Color.black);
				g.drawString(""+X, 1150, 500);
				ww9=1;
				if(X==5)
				{
					g.setColor(Color.lightGray);
					g.fillRect(0, 0, 2000, 1000);
					
					g.setColor(Color.BLACK);
					g.setFont(win);
					g.drawString("WYGRA� KRZYZYK", 50, 300);
				}
			}
			break;
			}
		
		}
		
		
		
		
		
		
		
		
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}