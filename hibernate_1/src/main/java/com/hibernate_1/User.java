package com.hibernate_1;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("1.Insert");
		System.out.println("2.Read");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("5.exit");
		System.out.println("Choose the number to perform the action:");
		Methods mn=new Methods();
		int num=sc.nextInt();
		switch(num)
		{
			case 1: mn.insert();
			break;
			case 2: mn.read();
			break;
			case 3: mn.update();
			break;
			case 4: mn.delete();
			break;
		}
	}
}
