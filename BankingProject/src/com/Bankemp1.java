package com;

public	class Bankemp1 implements Bank{
	private int balance;
	Bankemp1(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int d) {
		System.out.println("Depositing Rs."+d);
		balance=balance+d;//balance+=amount
		System.out.println("Amount depositing sucessfully");
			
		}

		@Override
		public void withdraw(int w) {
			if(w<=balance) {
			System.out.println("Withdraw Rs."+w);
			balance=balance-w;
			System.out.println("Amount Withdraw sucessfully");
				
			
		}
			else
			{
				try
				{
					throw new InsufficientbalanceException("Insuffiecint balance");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
		@Override
		public int checkbal() {
			// TODO Auto-generated method stub
			return balance;
		}
		
	}
//throws indicates the called about the exception
//throw invokes the object of exception