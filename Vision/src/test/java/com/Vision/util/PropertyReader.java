package com.Vision.util;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader
{	
	String path =  getFilePath();  	
    public String readApplicationFile(String key)
    { 
    	String value = "";
        try
        {         	  
	          Properties prop = new Properties();
	          File f = new File(path + File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"Vision"+File.separator+"config"+File.separator+"Application.properties");
	          if(f.exists())
	          {
		          prop.load(new FileInputStream(f));
		          value = prop.getProperty(key); 		                 
           	  }
	   }
        catch(Exception e)
        {  
           System.out.println("Failed to read from application.properties file.");  
        }
        return value;
     } 
    
	public String getFilePath()
	{
		String filepath ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		filepath = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return filepath;
	}
}