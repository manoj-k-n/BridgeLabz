package com.bridgelab.Functional;

import com.bridgelab.Utility.utility;

public class Array2d 
{
	
	public static void main(String[] args)
	{
			System.out.println("Enter number of rows: ");
			int m = utility.readInt();
			System.out.println("Enter number of columns: ");
			int n = utility.readInt();

			// calling methods
			int[][] a = utility.readTwoDimensionArray(m, n);
		
			// calling display method
			utility.dsiplayMatrix(a);

		}

}
