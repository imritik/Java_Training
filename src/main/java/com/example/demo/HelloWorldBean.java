package com.example.demo;

import java.util.*;

import org.springframework.boot.SpringApplication;

import java.io.*;

public class HelloWorldBean {
	
	 private String Str;



	    public String getstring() {

	        return this.Str;

	    }



	    public String setstring(String Str) {

	        this.Str = Str;
	        return Str;
	      

	    }
	    
	    public String formatstring(String Str, String temp){
	    	String m="";
	    	m=String.format(Str,temp);
	    	return m;
	    	
	    }
}
	    
	   
