package com;
import java.io.*;
import java.util.*;


public class FindFile {
	public static void findFile(String name,File file)
	{   
		File[] list=file.listFiles();
		//Searching File in Current Directory
	    if(list!=null)
	         for(File fil:list)
	         { 
	             if(fil.isDirectory())
	    	        {  
	    		         findFile(name,fil);
	    	        }
	             	else
	             	{
	             		if(name.equalsIgnoreCase(fil.getName()))
	             		{
	             			System.out.println(fil.getAbsolutePath());
	             		}    		
	             	}
	         }
  
	}

}

