package com;

import java.util.Scanner;

public class MainBanks {

	public static void main(String[] args) {
		System.out.println("welcome to ICICI bank");
		System.out.println("-----------------");
	Scanner sc=new Scanner(System.in);
	Bank b1= new Bankemp1(5000);
	while(true)
	{
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.checkbal");
		System.out.println("4.Exit\nEnter choice");
		int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("enter amount to be deposited");
		int amounttobedeposit=sc.nextInt();
		b1.deposit(amounttobedeposit);
		break;
	case 2:
		System.out.println("enter amount to be withdraw");
		int amountTowithdraw=sc.nextInt();
		b1.withdraw(amountTowithdraw);//b1.withdraw(sc.nextInt());
		break;//control transform the outside the switch
	case 3:
		System.out.println("Availble balance:Rs."+b1.checkbal());
		break;
	case 4:
		System.out.println("thank you visit again");
		System.exit(0);
		break;
		default:
			System.out.println("invalid choice");

	}
  System.out.println("--------------------------");
}
}
}