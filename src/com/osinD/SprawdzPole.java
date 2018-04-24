package com.osinD;


public class SprawdzPole {
	

	
	public int Pelne(int tab[][], int x, int y)
	{
		
		int check =0;
		
		for(int i=x+0;i<x+3;i++)
		{
			for(int j=y+0;j<y+3;j++)
			{
				if(tab[i][j]==0)
				{
					check=1;
				}
					
			}
		}
		return check;
	}

}
