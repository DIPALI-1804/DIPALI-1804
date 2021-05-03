package com;
import java. io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;
public class CreateNewFile {
	
	public static void findFile()
	{
		FindFile ff= new FindFile();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the file to be search....");
	    String name=scan.next();
	    System.out.println("enter directory where to search"); 
	    String directory =scan.next();
	    ff.findFile(name, new File(directory));
    }
	public static void creationDeletionFile()
	{
		Scanner scan= new Scanner(System.in);
		String filename;
    	try{
    	  System.out.println("Enter File to be Created");
          filename = scan.nextLine() ;
		  File f1=new File(filename);
	      boolean res=f1.createNewFile();
	      if ( res)
	      {
	    	  System.out.println("fiel created successfully"); 
	      }
	      else 
	      {
	    	  System.out.println("file alredy present");  
	      }
	    }
        catch(IOException e) 
    	{
        	System.out.println("exception occourred");
        } 
    	System.out.println("--------------------------------------------------------------------");
    	System.out.println("deletion of file");  
    	System.out.println("Enter File to be Delete");
    	filename = scan.nextLine() ;
    	File f1=new File(filename);
    	if (f1.delete())
    	{
    		System.out.println("fiel deleted successefully");
    	}
	    else 
	    {
	    	System.out.println("file is not deleted");
	    }  
	}
    public static void main(String[] args)throws Exception 
    {
    	Scanner scan= new Scanner(System.in);
    	int operation;
    	while(true)
    	{
    		System.out.println("Select option from Below Menue");
    		System.out.println("1. To run Creation and Deletion of File");
    		System.out.println("2. To run Search File");
    		System.out.println("3. Exit");
    		operation = scan.nextInt();
    		switch (operation)
    		{
    	    	case 1: creationDeletionFile();
    	            	break;
    	    	case 2: findFile();
    	            	break;
    	    	case 3: return;
                          	            
    	    	default: System.out.println("Invalid Input!");
    	    	     	break;
    		}
    	}
    }
 }
