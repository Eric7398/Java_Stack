package com.bankaccount;
import java.util.Random;


public class BankAccount {
	private String AccNum;
	private Double Checking = 0.00;
	private Double Saving = 0.00;
	
	private static int counter = 0;
	private static int totalsum = 0;
	
	public BankAccount() {
		this.AccNum = this.RandAccNum();
		counter++;
	}
	// Creates a new bank account and using the RandAccNum function it generates a 10 digit account number.
	
	
	
	private String RandAccNum() {
		String AccNum = "";
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			AccNum  += rand.nextInt(10);
		}
		return AccNum;

	}
	// Creates a 10 random digit number using import Random. For looping 10 times to get a random value 10 times.
	
	
	
	public void ViewBal() {
		System.out.println("Total in Checking is: " + this.getChecking());
		System.out.println("Total in Saving is: " + this.getSaving());
		System.out.println("Total in Account is : " + BankAccount.getTotalsum());
	}
	// Display the balance of all accounts and the total amount of money you have.
	
	
	
	public void Deposit(String acc, Double bal) {
		if (acc == "Checking") {
			this.Checking += bal;
			System.out.println("Went thru checking if in deposit");
		} else if(acc == "Saving") {
			this.Saving += bal;
			System.out.println("Went thru saving if in deposit");
		} else {
			System.out.println("Failed to deposit, please choose Checking or Saving Account");
			return;
		} 	
	}
	// If the account is checking/saving increase the account value to set increments of balance.
	
	
	
	public void Withdraw(String acc, Double bal) {
		if (acc == "Checking" && bal > this.Checking) {
			this.Checking -= bal;
		} else if (acc == "Saving" && bal > this.Saving) {
			this.Saving -= bal;
		} else {
			System.out.println("Failed to withdraw, please make sure you have enough money in the account to withdraw");
		}
	}
	// If the account is checking/saving and the balance withdrawing is greater than what's in the account decrease account value.
	
	
	
	
	
	
	
	
	
	
	public String getAccNum() {
		return AccNum;
	}

	public void setAccNum(String accNum) {
		AccNum = accNum;
	}

	public Double getChecking() {
		return Checking;
	}

	public void setChecking(Double checking) {
		Checking = checking;
	}

	public Double getSaving() {
		return Saving;
	}

	public void setSaving(Double saving) {
		Saving = saving;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		BankAccount.counter = counter;
	}

	public static int getTotalsum() {
		return totalsum;
	}

	public static void setTotalsum(int totalsum) {
		BankAccount.totalsum = totalsum;
	}
	
	
	
}
