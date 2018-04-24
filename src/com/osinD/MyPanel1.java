package com.osinD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPanel1 extends JPanel {
	public MyPanel1() {
	}

	

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		
		Font plainFont = new Font("Serif",Font.PLAIN,30);
		Font cross = new Font("Serif", Font.PLAIN, 50);
		
			
			
			g.setColor(Color.lightGray);
			g.fillRect(730, 0, 1000, 1000);
			g.setColor(Color.DARK_GRAY);
			
			g.setFont(plainFont);
			
			g.drawString("Liczba Punkt�w O:", 1050, 200);
			g.drawString("Liczba Punkt�w X:", 1050, 400);
			
			g.setFont(cross);
			g.drawString("0", 1150, 300);
			g.drawString("0", 1150, 500);
			
	    	 	g2d.setColor(Color.MAGENTA);
	    	 	
	    	 	//////////////////PIERWSZA KOLUMNA KWADRATY 
	    	 for(int i=0;i<9;i++)
	    	 {
	    		 for(int j=0;j<9;j++)
	    		 {
	    		 g2d.drawRect(j*80, i*80,80, 80);
	    		 }
	    	 }
	    	 
		///////////////////CZARNE LINIE
	    	 g2d.setColor(Color.black);
	    	 for(int i=0;i<9;i++)
	    	 {
	    		 g2d.fillRect(i*80, 240, 80, 7);
	    		 g2d.fillRect(i*80, 480, 80, 7);
	    		 
	    		 g2d.fillRect(240, (i*80), 7,80);
	    		 g2d.fillRect(480,i*80,7,80);
	    	 }
		
	}

	
	
}