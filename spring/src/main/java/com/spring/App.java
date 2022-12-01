package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/springcore.xml"); 
        University uni=(University) context.getBean("u1");
        System.out.println(uni);
        University unii=(University) context.getBean("u3");
        System.out.println(unii);
        College clg=(College) context.getBean("u2");
        System.out.println(clg);
        
        Employee emp=(Employee) context.getBean("e1");
        System.out.println(emp);
    }
}
