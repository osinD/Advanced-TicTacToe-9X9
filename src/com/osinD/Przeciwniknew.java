package com.osinD;

import java.util.Random;

public class Przeciwniknew {
	

	
	public int[][] RuchX(int tab[][], int x, int y)
	{
		
		int tab1[][] = new int[9][9];
		 for(int i=0;i<9;i++)
	      {
	    	  for(int j=0;j<9;j++)
	    	  {
	    		  tab1[i][j]=tab[i][j];
	    	  }
	      }
		 
		 boolean done = false;
		 
		 
		 
		 
		 //0
		 if (tab1[x+0][y+0] == 2 && tab1[x+1][y+1] == 2 && tab1[x+2][y+2] == 0&&done==false)
			{
				tab1[x+2][y+2] = 2;	
				done =true;
			}
		 if (tab1[x+1][y+1] == 2 && tab1[x+2][y+2] == 2 && tab1[x+0][y+0] == 0&&done==false)
			{
				tab1[x+0][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+0][y+0] == 2 && tab1[x+2][y+2] == 2 && tab1[x+1][y+1] == 0&&done==false)
			{
				tab1[x+1][y+1] = 2;	
				done =true;
			}
		 //1
		 if (tab1[x+2][y+0] == 2 && tab1[x+1][y+1] == 2 && tab1[x+0][y+2] == 0&&done==false)
			{
				tab1[x+0][y+2] = 2;	
				done =true;
			}
		 
		 
		 if (tab1[x+1][y+1] == 2 && tab1[x+0][y+2] == 2 && tab1[x+2][y+0] == 0&&done==false)
			{
				tab1[x+2][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+2][y+0] == 2 && tab1[x+0][y+2] == 2 && tab1[x+1][y+1] == 0&&done==false)
			{
				tab1[x+1][y+1] = 2;	
				done =true;
			}
		 //2
		 if (tab1[x+0][y+0] == 2 && tab1[x+0][y+1] == 2 && tab1[x+0][y+2] == 0&&done==false)
			{
				tab1[x+0][y+2] = 2;	
				done =true;
			}
		 if (tab1[x+0][y+1] == 2 && tab1[x+0][y+2] == 2 && tab1[x+0][y+0] == 0&&done==false)
			{
				tab1[x+0][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+0][y+0] == 2 && tab1[x+0][y+2] == 2 && tab1[x+0][y+1] == 0&&done==false)
			{
				tab1[x+0][y+1] = 2;	
				done =true;
			}
		 
		 
		 //3
		 if (tab1[x+1][y+0] == 2 && tab1[x+1][y+1] == 2 && tab1[x+1][y+2] == 0&&done==false)
			{
				tab1[x+1][y+2] = 2;	
				done =true;
			}
		 if (tab1[x+1][y+1] == 2 && tab1[x+1][y+2] == 2 && tab1[x+1][y+0] == 0&&done==false)
			{
				tab1[x+1][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+1][y+0] == 2 && tab1[x+1][y+2] == 2 && tab1[x+1][y+1] == 0&&done==false)
			{
				tab1[x+1][y+1] = 2;	
				done =true;
			}
		 
		 
		 //4
		 if (tab1[x+2][y+0] == 2 && tab1[x+2][y+1] == 2 && tab1[x+2][y+2] == 0&&done==false)
			{
				tab1[x+2][y+2] = 2;	
				done =true;
			}
		 if (tab1[x+2][y+1] == 2 && tab1[x+2][y+2] == 2 && tab1[x+2][y+0] == 0&&done==false)
			{
				tab1[x+2][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+2][y+0] == 2 && tab1[x+2][y+2] == 2 && tab1[x+2][y+1] == 0&&done==false)
			{
				tab1[x+2][y+1] = 2;	
				done =true;
			}
		 
		 //5
		 if (tab1[x+0][y+0] == 2 && tab1[x+1][y+0] == 2 && tab1[x+2][y+0] == 0&&done==false)
			{
				tab1[x+2][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+1][y+0] == 2 && tab1[x+2][y+0] == 2 && tab1[x+0][y+0] == 0&&done==false)
			{
				tab1[x+0][y+0] = 2;	
				done =true;
			}
		 if (tab1[x+0][y+0] == 2 && tab1[x+2][y+0] == 2 && tab1[x+1][y+0] == 0&&done==false)
			{
				tab1[x+1][y+0] = 2;	
				done =true;
			}
		 
		 //6
		 if (tab1[x+0][y+1] == 2 && tab1[x+1][y+1] == 2 && tab1[x+2][y+1] == 0&&done==false)
			{
				tab1[x+2][y+1] = 2;	
				done =true;
			}
		 if (tab1[x+1][y+1] == 2 && tab1[x+2][y+1] == 2 && tab1[x+0][y+1] == 0&&done==false)
			{
				tab1[x+0][y+1] = 2;	
				done =true;
			}
		 if (tab1[x+0][y+1] == 2 && tab1[x+2][y+1] == 2 && tab1[x+1][y+1] == 0&&done==false)
			{
				tab1[x+1][y+1] = 2;	
				done =true;
			}
		 
		 //7
		 if (tab1[x+0][y+2] == 2 && tab1[x+1][y+2] == 2 && tab1[x+2][y+2] == 0&&done==false)
			{
				tab1[x+2][y+2] = 2;	
				done =true;
			}if (tab1[x+1][y+2] == 2 && tab1[x+2][y+2] == 2 && tab1[x+0][y+2] == 0&&done==false)
			{
				tab1[x+0][y+2] = 2;	
				done =true;
			}if (tab1[x+0][y+2] == 2 && tab1[x+2][y+2] == 2 && tab1[x+1][y+2] == 0&&done==false)
			{
				tab1[x+1][y+2] = 2;	
				done =true;
			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 for (int i=x; i<x+3; i++)
			{
				if (tab1[i][0] == 2 && tab1[i][1] == 2 && tab1[i][2] == 0&&done==false)
				{
					tab1[i][2] = 2;	
					done =true;
				}
				if (tab1[i][0] == 2 && tab1[i][2] == 2 && tab1[i][1] == 0&&done==false) 
				{
					tab1[i][1] = 2;
					done =true;
					
				}
				if (tab1[i][2] == 2 && tab1[i][1] == 2 && tab1[i][0] == 0&&done==false) 
				{
					tab1[i][0] = 2;
					done =true;
					
				}  
				if (tab1[0][i] == 2 && tab1[1][i] == 2 && tab1[2][i] == 0&&done==false) 
				{
					tab1[2][i] = 2;
					done =true;
					
				}
				if (tab1[0][i] == 2 && tab1[2][i] == 2 && tab1[1][i] == 0&&done==false)
				{
					tab1[1][i] = 2;
					done =true;
					
				}
				if (tab1[2][i] == 2 && tab1[1][i] == 2 && tab1[0][i] == 0&&done==false)
				{
					tab1[0][i] = 2;
					done =true;
					
				}
				
			}
			
			///////////////////////////////////////////////////////////
			
				
			if (tab1[x][y] == 2 && tab1[x+1][y+1] == 2 && tab1[x+2][y+2] == 0&&done==false)
			{
				tab1[x+2][y+2] = 2;
				done =true;
				
			}
			if (tab1[x][y] == 2 && tab1[x+2][y+2] == 2 && tab1[x+1][y+1] ==0&&done==false)
			{
					tab1[x+1][y+1] = 2;
					done =true;
				
				}
			if (tab1[x+2][y+2] == 2 && tab1[x+1][y+1] == 2 && tab1[x][y] == 0&&done==false) 
			{
					tab1[x][y] = 2;
					done =true;
				
				}      
			if (tab1[x][y+2] == 2 && tab1[x+1][y+1] == 2 && tab1[x+2][y] == 0&&done==false) 
			{
					tab1[x+2][y] = 2;
					done =true;
				
				}
			if (tab1[x][y+2] == 2 && tab1[x+2][y] == 2 && tab1[x+1][y+1] == 0&&done==false) 
			{
					tab1[x+1][y+1] = 2;
					done =true;
				
				}
			if (tab1[x+2][y] == 2 && tab1[x+1][y+1] == 2 && tab1[x][y+2] == 0&&done==false)
			{
				tab1[x][y+2] = 2;
				done =true;
				
				}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 for (int i=x; i<x+3; i++) {
				if (tab1[i][y] == 1 && tab1[i][y+1] == 1 && tab1[i][y+2] == 0&&done==false) {
					tab1[i][y+2] = 2;
					done =true;
				
				}
				if (tab1[i][y] == 1 && tab1[i][y+2] == 1 && tab1[i][y+1] == 0&&done==false) {
					tab1[i][y+1] = 2;
					done =true;
				
				}
				if (tab1[i][y+2] == 1 && tab1[i][y+1] == 1 && tab1[i][y] == 0&&done==false) {
					tab1[i][y] = 2;
					done =true;
				
				} 
			}
			for (int i=y; i<y+3; i++) {
				if (tab1[x][i] == 1 && tab1[x+1][i] == 1 && tab1[x+2][i] == 0&&done==false) {
					tab1[x+2][i] = 2;
					done =true;
				
				}
				if (tab1[x][i] == 1 && tab1[x+2][i] == 1 && tab1[x+1][i] == 0&&done==false) {
					tab1[x+1][i] = 2;
					done =true;
				
				}
				if (tab1[x+2][i] == 1 && tab1[x+1][i] == 1 && tab1[x][i] == 0&&done==false) {
					tab1[x][i] = 2;
					done =true;
				
				}          
			}
				if (tab1[x][y] == 1 && tab1[x+1][y+1] ==1 && tab1[x+2][y+2] == 0&&done==false) {
					tab1[x+2][y+2] = 2;
					done =true;
				
				}
				if (tab1[x][y] == 1 && tab1[x+2][y+2] == 1 && tab1[x+1][y+1] == 0&&done==false) {
					tab1[x+1][y+1] = 2;
					done =true;
				
				}
				if (tab1[x+2][y+2] == 1 && tab1[x+1][y+1] == 1 && tab1[x][y] == 0&&done==false) {
					tab1[x][y] = 2;done =true;
				
				}      
				if (tab1[x][y+2] == 1 && tab1[x+1][y+1] == 1 && tab1[x+2][y] == 0&&done==false) {
					tab1[x+2][y] = 2;
					done =true;
				
				}
				if (tab1[x][y+2] == 1 && tab1[x+2][y] ==1 && tab1[x+1][y+1] == 0&&done==false) {
					tab1[x+1][y+1] = 2;
					done =true;
				
				}
				if (tab1[x+2][y] == 1 && tab1[x+1][y+1] ==1 && tab1[x][y+2] == 0&&done==false) {
					tab1[x][y+2] = 2;
					done =true;
				
				}  	
				
				
				
				
				Random r = new Random();
				int a1,b1;
				while (done != true) {
				a1 = r.nextInt(3)+x;
				b1 = r.nextInt(3)+y;
				if (tab1[a1][b1] == 0) {
				tab1[a1][b1] = 2;
				done = true;
				}
				}	
				
				return tab1;
	}
	
	

}
