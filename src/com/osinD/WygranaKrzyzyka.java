package com.osinD;


public class WygranaKrzyzyka {
	
	

	public int Krzyzyk(int tab[][], int x, int y)
	{
		int wygrana=0;
		int tab1[][] = new int[9][9];
		 for(int i=0;i<9;i++)
	      {
	    	  for(int j=0;j<9;j++)
	    	  {
	    		  tab1[i][j]=tab[i][j];
	    	  }
	      }
		 
		 if(tab1[x+0][y+0]==2 && tab1[x+0][y+1]==2 && tab1[x+0][y+2]==2)
			{
				wygrana =2;
			}
			if(tab1[x+1][y+0]==2 && tab1[x+1][y+1]==2 && tab1[x+1][y+2]==2)
			{
				wygrana =2;
			}
			if(tab1[x+2][y+0]==2 && tab1[x+2][y+1]==2 && tab1[x+2][y+2]==2)
			{
				wygrana =2;
			}
			if(tab1[x+0][y+0]==2 && tab1[x+1][y+0]==2 && tab1[x+2][y+0]==2)
			{
				wygrana =2;
			}
			if(tab1[x+0][y+1]==2 && tab1[x+1][y+1]==2 && tab1[x+2][y+1]==2)
			{
				wygrana =2;
			}
			
			
			if(tab1[x+0][y+2]==2 && tab1[x+1][y+2]==2 && tab1[x+2][y+2]==2)
			{
				wygrana =2;
			}
			
			if(tab1[x+0][y+0]==2 && tab1[x+1][y+1]==2 && tab1[x+2][y+2]==2)
			{
				wygrana =2;
			}
			
			if(tab1[x+0][y+2]==2 && tab1[x+1][y+1]==2 && tab1[x+2][y+0]==2)
			{
				wygrana =2;
			}
			
			
			
			
			
			
		
		return wygrana;
	}

}
