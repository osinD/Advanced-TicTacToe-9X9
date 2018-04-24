package com.osinD;

import javax.swing.JOptionPane;
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        
    	
    	int a=1;
    	String x;
    	x= JOptionPane.showInputDialog("Podaj ilo�� graczy 1 lub 2 :");
    	while(a==1)
    	{	
    	 
    	 
    	 
    	 
    	 if(x.equals("2") )
    	 {
    		// System.out.print(x);
    		 EventQueue.invokeLater(new Runnable() {
    	            @Override
    	            public void run() {
    	                new MyFrame2();
    	            }
    	        });
    		 a=0;
    	 }
    	 else{
    		 if(x.equals("1") )
    		 {
    	EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame1();
            }
        });
    	a=0;
    		 }
    		 else
    		 {
    			 x= JOptionPane.showInputDialog(" nieprawid�owa ilo�� graczy Podaj ponownie 1 lub 2 :"); 
    		 }
    		 
    }
    	}
    }
}