package com.tech.crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tech.util.HibernateUtil;

public class Main 
{
   public static void main(String[] args)
   {
	   
	   Scanner sc=new Scanner(System.in);
	   Operation op=new Operation();
	   
	   while(true)
	   {
	   System.out.println("Enter Your Choise");
	   System.out.println("1.Insert Data \n 2.Get Data \n 3.Get All Data \n 4.Delete Data \n 5.Update Data");
	       
	   int input= sc.nextInt();
	   
	   switch(input)
	   {
	   case 1:
		      op.insertData();
		      break;
		      
	   case 2:
		     op.getData();
		     break;
		     
	   case 3:
			   op.getAllData();
			   break;
		   
		    
	   case 4:
		   op.deleteData();
		    break;
		    
	   case 5:
		   op.updateData();
		   break;
		     
		   
	   
	   }
	
	   }
	   
   }
}
