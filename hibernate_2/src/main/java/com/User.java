package com;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for add data");
		System.out.println("Press 2 for read all student data using college id");
		System.out.println("Press 3 to read college details based on collegeId");
		System.out.println("Press 4 for exit");
		int in=sc.nextInt();
		Methods obj=new Methods();
		switch(in)
		{
			case 1:obj.add();
			break;
			case 2:obj.readStudent();
			break;
			case 3:obj.readCollege();
			break;
//			case 4:System.out.println("");
//			break;
			default:System.out.println("Invalid input");
		}
	}
}
