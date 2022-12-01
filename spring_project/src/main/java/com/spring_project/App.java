package com.spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_project/project.xml");
        Atm atm=context.getBean("atm",Atm.class);
        System.out.println(atm);
    }
}
