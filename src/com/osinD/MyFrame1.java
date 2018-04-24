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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyFrame1  extends JFrame implements MouseListener {
	
	

	private boolean flaga =false;
	public int tablica[][]= new int [9][9];
	public int tablica1[][]= new int [9][9];
	private int fstep =0;
	private int sstep =1;
	private int  px ,py,wx , wy,sx,sy;
	private int x,y,r1,r2,przes;
	
	public int Wygrana=0;
	private int w1=0,w2=0,w3=0,w4=0,w5=0,w6=0,w7=0,w8=0,w9=0;
	private int w11=0,w22=0,w33=0,w44=0,w55=0,w66=0,w77=0,w88=0,w99=0;
	private int ww1=0,ww2=0,ww3=0,ww4=0,ww5=0,ww6=0,ww7=0,ww8=0,ww9=0;
	private int K ,X;
	
	
	Przeciwniknew P = new Przeciwniknew();
	WygranaKrzyzyka Krzyzyk = new WygranaKrzyzyka();
	WygranaKola Kolo = new WygranaKola();
	SprawdzPole Check=new SprawdzPole(); public int sprawdz;
	

	
 public MyFrame1() {
	        
		 
		 super("Kolko i Krzyzyk 9X9 # TIGER I KOBRA");
		 JPanel panel =new MyPanel1();  
		 add(panel);
		 addMouseListener( this );
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setSize(2000, 1000);
	     
	     setLocation(0,0);
	    setResizable(false);
	     setVisible(true);
	      
	     
	     
	     
}

 private void setJButton(String string) {
		
		
	}
 public void paintComponent(Graphics g) {
     Graphics2D g2d = (Graphics2D) g;
          
 }

 
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
					g.drawString("X", i*80+25, j*80+76);
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
		
		Font plainFont = new Font("Serif",Font.PLAIN,15);
		//Font cross = new Font("Serif", Font.PLAIN, 50);
		Font pelna = new Font("Serif", Font.PLAIN, 25);
		
		
		g.setColor(Color.lightGray);
		g.fillRect(740, 0, 800, 100);
		if(fstep==0)
		{
			
		tablica[e.getX()/80][(e.getY())/80 ]=1;
		
		g.setColor(Color.red);
		g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
		fstep=2;
		sstep=2;
		px=e.getX();
		py=e.getY();
		wx=e.getX()/80;
		wy=(e.getY())/80 ;
		}
		
		if(fstep==2)
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
				
				sprawdz=Check.Pelne(tablica, 0, 0);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 1", 1200, 50);
				}
				else
				{
					sx=wx;		/////////ZAPAMIETUJEMY POPRZEDNIE WSPOLRZEDNE
					sy=wy;
				if(sstep==2)
				{
					
					tablica=P.RuchX(tablica,0,0);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
					
					
					
					
					flaga=false;
					}
					
					sstep =1;
					
				}
				else
				{
					
					if((e.getX()/80<3&&e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0))
						{tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
						}
					else
					{
						g.setColor(Color.black);
						g.setFont(pelna);
						g.drawString("B��DNY RUCH ", 780, 50);
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
					ww1=1;
					if(K==5)
					{
						g.setColor(Color.lightGray);
						g.fillRect(0, 0, 2000, 1000);
						
						g.setColor(Color.BLACK);
						g.setFont(win);
						g.drawString("WYGRA�O KOLO", 50, 300);
					}
					
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
				}
				
				break;
			case 2:
				sprawdz=Check.Pelne(tablica, 0, 3);
				
				if(sprawdz ==0)
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 2", 1200, 50);
				}
				else
				{
					sx=wx;			
					sy=wy;
				if(sstep==2){
					
				tablica=P.RuchX(tablica,0,3);
				for(int i=0;i<9;i++)
				{
					for(int j =0;j<9;j++)
					{
						if(tablica[i][j]==2&&tablica1[i][j]!=1)
						{
							
							r1=i;
							r2=j;
							wx=i;
							wy=j;
							tablica1[i][j]=1;
							
							px=r1*50;
							py=r2*50;
							flaga=true;
							
						}
					}
					sstep =1;
				}
				if(flaga==true)
				{
					g.setColor(Color.blue);
					g.setFont(cross);
					g.drawString("X", r1*80+25, r2*80+76);
				
				
				
				flaga=false;
				}
				
				sstep =1;
				}
				else
				{
					if((e.getX()/80<3&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
				break;
			case 3:
				sprawdz=Check.Pelne(tablica, 0, 6);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 3", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,0,6);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);

					
					
					flaga=false;
					}
					
					sstep =1;
					}
				else
				{
					
					if((e.getX()/80<3&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
					break;
			case 4:
				
				sprawdz=Check.Pelne(tablica, 3, 0);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 1", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,3,0);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
					
					
					
					flaga=false;
					}
					
					sstep =1;
					}
				else
				{
					
					if(((e.getX()/80>2&& e.getX()/80<6)&&( e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
					break;
			case 5:
				sprawdz=Check.Pelne(tablica, 3, 3);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 5", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,3,3);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
				
					
					flaga=false;
					}
					
					sstep =1;
				}
				else
				{
					
					if(((e.getX()/80>2&&e.getX()/80<6)&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
					break;
					
			case 6:
				sprawdz=Check.Pelne(tablica, 3, 6);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 6", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,3,6);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
					
					
					flaga=false;
					}
					
					sstep =1;
					}
				else
				{
					
					if(((e.getX()/80>2&&e.getX()/80<6)&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
					break;
			case 7:
				sprawdz=Check.Pelne(tablica, 6, 0);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 7", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,6,0);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
					
					
					flaga=false;
					}
					
					sstep =1;
					}
				else
				{
					if(((e.getX()/80>5&&e.getX()/80<9)&&( e.getY()/80<3)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
					break;
			case 8:
				sprawdz=Check.Pelne(tablica, 6, 3);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 8", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,6,3);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
					
					
					flaga=false;
					}
					
					sstep =1;
					}
				else
				{
					if(((e.getX()/80>5&&e.getX()/80<9)&&(e.getY()/80>2 && e.getY()/80<6)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
				}
				
				break;
					
			case 9:
				sprawdz=Check.Pelne(tablica, 6, 6);
				
				if(sprawdz ==0)/////////SPRAWDZANIE CZY POLE PELNE
				{
					wx=sx;
					wy=sy;
					g.setColor(Color.black);
					g.setFont(pelna);
					g.drawString("PELNA PLANSZA 9", 1200, 50);
				}
				else
				{
					sx=wx;			////////ZAPAMIETUJEMY POPRZEDNI RUCH
					sy=wy;
				if(sstep==2){
					tablica=P.RuchX(tablica,6,6);
					for(int i=0;i<9;i++)
					{
						for(int j =0;j<9;j++)
						{
							if(tablica[i][j]==2&&tablica1[i][j]!=1)
							{
								
								r1=i;
								r2=j;
								wx=i;
								wy=j;
								tablica1[i][j]=1;
								
								px=r1*50;
								py=r2*50;
								flaga=true;
								
							}
						}
						sstep =1;
					}
					if(flaga==true)
					{
						g.setColor(Color.blue);
						g.setFont(cross);
						g.drawString("X", r1*80+25, r2*80+76);
					
										
					flaga=false;
					}
					
					sstep =1;
					}
				else
				{
					if(((e.getX()/80>5&&e.getX()/80<9)&&(e.getY()/80>5 && e.getY()/80<9)&&(tablica[e.getX()/80][(e.getY())/80 ]==0)))
					{
						tablica[e.getX()/80][e.getY()/80]=1;
						g.setColor(Color.red);
						g.fillOval((e.getX()/80 )*80  +20 , (((e.getY())/80)*80 +30 ) +10, 50, 50);
						sstep=2;
						px=e.getX();
						py=e.getY();
						wx=e.getX()/80;
						wy=(e.getY())/80 ;
					}
						else
						{
							g.setColor(Color.black);
							g.setFont(pelna);
							g.drawString("B��DNY RUCH ", 780, 50);
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
						g.drawString("WYGRA�O KOLO", 50, 300);
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
