package problem2;

/*
  Create a class called account with the data members(Acc_No – integer, Name String,
Phone_No: integer, balance_amt:float), and following methods :
a. getinput() to get input from the user
b. Deposit() method which takes the amount to be deposited in to his/her account and
do the calculation.
c. Withdraw() method which gets the amount to be withdrawn from his/her account.
d. Print the appropriate results.
 */

import java.util.Scanner;

public class Account {


    int Acc_No;
	long Phone_No;
	String Name;
	float balanceAmt;
	

	void getCustomerInfo() {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		Name = sc.nextLine();
		System.out.println("Enter the account number");
        Acc_No = sc.nextInt();
        System.out.println("Enter the current balance amount");
		balanceAmt = sc.nextFloat();
		System.out.println("Enter the phone number");
		Phone_No = sc.nextLong();
		sc.close();

	}

	void withdraw(float amount) {
		if (amount <= balanceAmt) {
			balanceAmt -= amount;
			System.out.println(amount + " was withdrawn from"+Name+"'s account");
			System.out.println("Current balance is " + balanceAmt);
		} else {
			System.out.println("Transaction failed");
			System.out.println("Current balance is " + balanceAmt);
        }
    }
	void deposit(float amount) {
		balanceAmt += amount;
		System.out.println("Deposited " + amount + " in"+Name +"'s account");
		System.out.println("Current balance is " + balanceAmt);
	}


        

	


	public static void main(String[] args) {
		Account account = new Account();
		account.getCustomerInfo();
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		int i = 0;
		while (i != 3) {
			System.out.println("\n****Enter a choice \n1)Withdraw \n2)Deposit\n3)Exit****\n");
			i=scan.nextInt();
			if(i==1)
			{
				System.out.println("Enter the amount you want to withdraw\n");
				float withdrawAmount=scan.nextFloat();
				account.withdraw(withdrawAmount);
			}
			else if(i==2)
			{
				System.out.println("Enter the amount you want to deposit\n");
				float depositAmount=scan.nextFloat();
				account.deposit(depositAmount);
			}
		}
		scan.close();
	}

}



































