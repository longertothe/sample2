package com.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext cont =new ClassPathXmlApplicationContext("application.xml");
      Sim sim=(Airtel)cont.getBean("sim");
      sim.displya();
      ;
	}

}
