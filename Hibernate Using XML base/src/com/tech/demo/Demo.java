package com.tech.demo;

import java.util.Scanner;

public class Demo 
{
	 public static void main(String[] args)
	 {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array Length"); 
		
    	int n=sc.nextInt();
		
		int arr[]= new int[n];
		
		int arr1[]=new int[n-1];
		
		System.out.println("Enter Values");
		{
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		
		System.out.println("Eneter Index Value which you want remove");
		
	  int delete=sc.nextInt();
	  
	 
	  for(int i=0;i<arr.length;i++)
	  {
		  if(i<delete)
		  {
			  arr1[i]=arr[i];   //arr[]=10 20 30 40 50  delete=3
		  }
		  else if(i==delete)
		    continue;
		  
		  else
		  {
			  arr1[i-1]=arr[i];
		  }
		  
	  }
	  System.out.println("Final Elements are");
	  
	  for(int i=0;i<n-1;i++)
	  {
		  System.out.println(arr1[i]);
	  }
 
  }
}

