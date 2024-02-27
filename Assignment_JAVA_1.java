package com.hughes.assignment;

import java.util.Scanner;
/*
 Consider the above class diagram with the inheritance relationship. Create the classes with mentioned 
attributes and do the followings
1. Create array of Account which stores 10 different account details .
2. Perform the transactions like deposit, withdrawal on that account which you have 
been added in the array.
3. accountId  7digit followed by 4 chars ex [1234567-ASDF]
4. accountName
5. loanType  Any one of the type (home, car)
 */

/**
 * @author bikas
 *
 */

class Account {
	private String accountId;
	private String accountName;
	private String address;
	private float depositAmount;

	public float getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Account() {

	}

	public Account(String accountId, String accountName, String address, float depositAmount) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;
		this.depositAmount = depositAmount;
	}

	public void getDetails() {

	}

	public void showDetails() {
		System.out.println("AccountId:" + accountId);
		System.out.println("Account Name:" + accountName);
		System.out.println("Address:" + address);
		System.out.println("Deposit Amount:" + depositAmount);

	}

}

class Loan extends Account {
	private Account acc;

	public Loan() {

	}

	public Loan(Account acc) {
		// every loan account has a account
		this.acc = acc;
	}

	private String loanId;
	private String loanType;
	private float loanAmount;

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void getLoan(String loanId, String loanType, float loanAmount) {
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}

	public void showLoanDetails() {
		System.out.println("Loan Id:" + loanId);
		System.out.println("Loan Type:" + loanType);
		System.out.println("Loan Amount:" + loanAmount);

	}

}

class Transaction extends Loan {
	private float amount;

	// Every Transaction is associated with an Account
	private Account ac;

	// While Creating an object of Transaction we have to set which Account it
	// refers to
	public Transaction(Account ac) {
		this.ac = ac;

	}

	public void depositAmount(int amount) {
		this.amount = amount;
		// using ac object we can modify the depositAmount
		float initialAmount = ac.getDepositAmount();
		float finalAmount = initialAmount + amount;

		ac.setDepositAmount(finalAmount);

	}

	public void withdrawAmount(int amount) {
		this.amount = amount;
		// using ac object we can modify the depositAmount
		float initialAmount = ac.getDepositAmount();
		if (initialAmount < amount) {
			System.out.println("Minimum Balance. Withdrawl not successful!");
		} else {
			float finalAmount = initialAmount - amount;
			ac.setDepositAmount(finalAmount);
		}

	}

	public void payLoan(int amount, Loan al) {
		// we can get the Loan object from the parameter and can change the amount
		this.amount = amount;
		float initialLoan = al.getLoanAmount();
		float finalLoan = initialLoan - amount;
		if (finalLoan <= 0) {
			System.out.print("Loan Completed!");
		} else {
			System.out.println("Loan Paid Successfully!");
		}
		al.setLoanAmount(finalLoan);

	}

	public void showAccountDetails() {
		// we can use the ac object to display the associated account details
		ac.showDetails();

	}
}

/**
 * @author bikas
 *
 */
/**
 * @author bikas
 *
 */
public class Assignment_JAVA_1 {
	public static void main(String[] args) {
		// create 10 accounts
		Scanner sc = new Scanner(System.in);
		Account arr[] = new Account[10];
		arr[0] = new Account("1234567-ASDF", "Bikash Dalai", "Bhubaneswar", 70000f);
		arr[1] = new Account("1234577-ASDF", "Krishna Kumar", "Cuttack", 50000f);
		arr[2] = new Account("1234587-ASDF", "Ramesh Dalai", "Delhi", 5000f);
		arr[3] = new Account("1234967-ASDF", "Abhishek Sahoo", "Delhi", 20000f);
		arr[4] = new Account("1234167-ASDF", "Ranjan Das", "Mumbai", 50900f);
		arr[5] = new Account("1234267-ASDF", "Rahul Kumar", "Hyderabad", 50080f);
		arr[6] = new Account("1234367-ASDF", "Sanjay Mallick", "Asansol", 10000f);
		arr[7] = new Account("1234467-ASDF", "Sayan Biswas", "Varanasi", 9000f);
		arr[8] = new Account("1231467-ASDF", "Roshan Kumar", "Gurgaon", 500f);
		arr[9] = new Account("1234067-ASDF", "Swagar Seth", "Bhubaneswar", 50060f);

		arr[0].showDetails();
		// Bikash is taking an loan
		Loan lo = new Loan(arr[0]);
		// applying for loan of 300000
		lo.getLoan("123L", "home", 300000);
		lo.showLoanDetails();

		// adding money to account
		// Creating a Transaction
		Transaction tr = new Transaction(arr[1]);
		// this transaction is associated with an object of Account
		// Initial Details of arr[1]
		tr.showAccountDetails();
		tr.depositAmount(5000);
		// After depositing amount
		tr.showAccountDetails();

		// now withdraw 2000 from arr[1] account
		tr.withdrawAmount(2000);
		tr.showAccountDetails();

		Transaction tr2 = new Transaction(arr[0]);
		// After paying 200000 in Loan Account
		tr2.payLoan(200000, lo);
		lo.showLoanDetails();
	}
}
