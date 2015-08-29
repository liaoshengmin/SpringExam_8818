package com.hand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Logging {
	
	
	 public void beforeInsertFilmEvent(){
		 System.out.println("Before Insert Film Data");
	   }
	  
	   public void afterInsertFilmEvent(){
		   System.out.println("After Insert Film Data");
	   }
	  

}
