package com.assignments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})  

@interface Info{
	int AuthorID();
	String Author() default "Vaishnavi";
	String Supervisor() default "Onkar";
	String Date();
	String Time();
	int version();
	String description() default "Displaying Method";
}

class Devloper{
	@Info(AuthorID = 1011, Date = "04-04-2000", Time = "10:30pm", version = 4)
	public void displayMethod(){System.out.println("Author Info");} 
}
public class Assignment7Q2 {
	public static void main(String[] args)throws Exception{ 
		Devloper devloper = new Devloper();
		Method m=devloper.getClass().getMethod("displayMethod");
		
		Info d1 = m.getAnnotation(Info.class);
		System.out.println("Date: "+d1.Date());
		System.out.println("Author ID is: "+d1.AuthorID());
		System.out.println("Author Name is: "+d1.Author());  
		System.out.println("Supervisor is: "+d1.Supervisor());
		System.out.println("Time is :"+d1.Time());
		System.out.println("Version is "+d1.version());
	}

}