package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Eric = new BankAccount();
		System.out.println("Account Number: " + Eric.getAccNum());
		Eric.Deposit("Checking", (double) 2500);
		Eric.Deposit("Saving", (double) 5040);
		Eric.Withdraw("Checking", (double) 1000);
		Eric.Deposit("Checking", (double) 2000);
		Eric.Withdraw("Saving", (double) 5000);
		Eric.Withdraw("Saving", (double) 1000);
		Eric.ViewBal();
		BankAccount Jim = new BankAccount();
		Jim.Deposit("Checking", 500.50);
		System.out.println("There is a total of: " + BankAccount.getCounter() + " user(s).");
		System.out.println("There is a total of: " + BankAccount.getTotalsum() + " USD in the bank");

		
		
		
	}

}
