/********************************************************************************************
 * Purpose   :creating  Primeno and find aanagram and store in 2dArray            
 * 
 * @author   :Manoj k n 
 * @version  :1.0
 * @date     :21-11-2019
 * @Filename :PrimeAnnagram             
 ********************************************************************************************/
package com.bridgelab.Datastructure1;

import com.bridgelab.Utility.utility;

public class PrimeAnnagram
{
	
		public static void main(String[] args)  
		{
			int array[][]=new int[10][100];
			int prime[][]=new int[10][100];
			
			int temp=1;
			for (int i = 0; i< 10; i++) 
			{
				for (int j = 0; j < 100; j++) 
				{
					array[i][j]=temp;
					temp++;
				}
			}
			
			for (int i = 0; i <10; i++) 
			{
				for (int j = 0; j < 100; j++) 
				{
					if(utility.isPrime(array[i][j]))
					{
					prime[i][j]=array[i][j];
					}
					else
					{
						prime[i][j]=-1;
					}
				}
			}
			for(int i = 0 ; i<10 ; i++) 
			{
			for(int j = 0 ; j<100;j++) {
				if(prime[i][j]!=-1) {
				for(int k = j+1 ; k <100;k++ ) {
				if(prime[i][k]!=-1&& utility.anagram(prime[i][j],prime[i][k])) {
					System.out.println(prime[i][j]+" "+ prime[i][k]);
				}
				}
				}
			}
		}
		
	}
	}

