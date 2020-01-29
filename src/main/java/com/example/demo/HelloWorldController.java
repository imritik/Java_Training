package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController

public class HelloWorldController {
	private String welcomeMessage="Hello world";
	
	
	
	@RequestMapping("/hello-world")
    public String welcome() {
        return welcomeMessage;
    }
	
	@RequestMapping("/hello-world-bean")
	public String helloworld() {
		HelloWorldBean myobject=new HelloWorldBean ();
		return myobject.setstring(welcomeMessage);
	}
		
	@RequestMapping("/hello-world/path-variable/{name}")
		String getDynamicUriValue(@PathVariable String name){
			HelloWorldBean myobject=new HelloWorldBean ();
		return myobject.formatstring(welcomeMessage+" %s",name);
		}	
	}