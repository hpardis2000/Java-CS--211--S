
import java.time.LocalDate;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		// Test Client Class
		
		Client client1=new Client(101,"Ali","San Francisco");
		Client client2=new Client(102);
		Client client3=new Client(103);
		Client client4=new Client("Joye","Belmont");
		System.out.println(client1);
		System.out.println("Client3.equals(Client2)= " + client3.equals(client2));
		System.out.println("Client3.equals(Client4)= " +client3.equals(client4));

		
		// Test Bank Class
		
		Bank bank1=new Bank(10001,"Bank Of America","San Francisco");
		Bank bank2=new Bank(10002,"Chase");
		Bank bank3=new Bank(10003,"Wells Fargo");
		
		System.out.println(bank1);
		System.out.println("Bank3.equals(Bank2)= " + bank3.equals( bank2));
		System.out.println("Bank3.equals(Bank1)= " +bank3.equals(bank1));
		
		
		// Test automated account number assignment

				Checking checkAcct1 = new Checking(client1.getClientId(), 5500);
				Savings savingsAcct1 = new Savings(Account.generateAccountNumber(), null, client2.getClientId(), 10000, false);
				Credit creditAcct1 = new Credit(Account.generateAccountNumber(), null, client3.getClientId(), -777, false);

				System.out.println(creditAcct1.toString());
				System.out.println(savingsAcct1.toString());
				System.out.println(checkAcct1.toString());

				/*
				Account:
					Account No.: 3
					Account Name: General Credit Line
					Client ID: 103
					Account Balance: -777.0
					Joint Account: no
					Joint ID: N/A
					Open Date: 2021-09-06
					Close Date: null
				Account:
					Account No.: 2
					Account Name: General Savings Account
					Client ID: 102
					Account Balance: 10000.0
					Joint Account: no
					Joint ID: N/A
					Open Date: 2021-09-06
					Close Date: null
				Account:
					Account No.: 1
					Account Name: General Checking Account
					Client ID: 101
					Account Balance: 5500.0
					Joint Account: no
					Joint ID: N/A
					Open Date: 2021-09-06
					Close Date: null
					Overdraft Protection: no
				 */
				
		

		/************** DRIVER IS HERE **************/
		// DRIVER PROGRAM
		Account[] childrenAccounts = new Account[10];
		childrenAccounts[0] = checkAcct1;
		childrenAccounts[1] = savingsAcct1;
		childrenAccounts[2] = creditAcct1;
		for (int i = 0; i < childrenAccounts.length; i++)
		{
			if (childrenAccounts[i] instanceof Checking)
			{
				Checking checkingAcc = (Checking) childrenAccounts[i];
				System.out.println("\n\nThe current array member " + i  + ": is of type of Checking account ");
				
				if (!checkingAcc.isOverdraftProtection()) 
				{
					System.out.println("Current balance on your checkingAccount: " + checkingAcc.getBalance());
					double withdrawalAmount = -1000000000.99;
					System.out.println("Withdrawal amount: " + withdrawalAmount + ". Withdrawing...");
					checkingAcc.withdrawal(withdrawalAmount);
					System.out.println("Current balance of checking Account: " + checkingAcc.getBalance());
				}
			}
			
			if (childrenAccounts[i] instanceof Credit)
			{
				Credit creditAcc = (Credit) childrenAccounts[i];
				System.out.println("\n\nThe current array member " + i  + ": is of type of Credit account ");
				try {
					if (creditAcc.equals(childrenAccounts[i])) 
					{
						System.out.println("CreditAcc " + creditAcc.toString() + " and array member "  + childrenAccounts[i].toString() + "are the same." );
					}
				}
				catch (Exception e)
				{
					System.out.println("\n***\nError: Equals method requires closeDate member not to be null\n" + e.getMessage());
				}
			}
			
			if (childrenAccounts[i] instanceof Savings)
			{
				Savings savingsAcc = (Savings) childrenAccounts[i];
				System.out.println("\n\nThe current array member " + i  + ": is of type of Savings account ");
				
				System.out.println("Savings account balance: "  + savingsAcc.getBalance() + " before deposit.");
				savingsAcc.deposit(1000.00);
				System.out.println("Savings balance after 1000.00 deposit : " + savingsAcc.getBalance());
			}
			
		}
		
		/*                      **** OUTPUT ****
		 * 
		    The current array member 0: is of type of Checking account 
			Current balance on your checkingAccount: 5500.0
			Withdrawal amount: -1.00000000099E9. Withdrawing...
			Insufficient funds
			Current balance of checking Account: 5500.0
			
			
			The current array member 1: is of type of Savings account 
			Savings account balance: 10000.0 before deposit.
			Current balance: 11000.0
			Savings balance after 1000.00 deposit : 11000.0
			
			
			The current array member 2: is of type of Credit account 
			
			***
			Error: Equals method requires closeDate member not to be null
			Cannot invoke "java.time.LocalDate.equals(Object)" because the return value of "Account.getClose()" is null

		 */
	}
	
	//******************** DRIVER() *******************************
	/*
	 * Driver method
	 */
	private static void driver(Account ... childrenAccounts) 
	{
		for (int i = 0; i < childrenAccounts.length; i++)
		{
			if (childrenAccounts[i] instanceof Checking)
			{
				Checking checkingAcc = (Checking) childrenAccounts[i];
				System.out.println("\n\nThe current array member " + i  + ": is of type of Checking account ");
				
				if (!checkingAcc.isOverdraftProtection()) 
				{
					System.out.println("Current balance on your checkingAccount: " + checkingAcc.getBalance());
					double withdrawalAmount = -1000000000.99;
					System.out.println("Withdrawal amount: " + withdrawalAmount + ". Withdrawing...");
					checkingAcc.withdrawal(withdrawalAmount);
					System.out.println("Current balance of checking Account: " + checkingAcc.getBalance());
				}
			}
			
			if (childrenAccounts[i] instanceof Credit)
			{
				Credit creditAcc = (Credit) childrenAccounts[i];
				System.out.println("\n\nThe current array member " + i  + ": is of type of Credit account ");
				try {
					if (creditAcc.equals(childrenAccounts[i])) 
					{
						System.out.println("CreditAcc " + creditAcc.toString() + " and array member "  + childrenAccounts[i].toString() + "are the same." );
					}
				}
				catch (Exception e)
				{
					System.out.println("\n***\nError: Equals method requires closeDate member not to be null\n" + e.getMessage());
				}
			}
			
			if (childrenAccounts[i] instanceof Savings)
			{
				Savings savingsAcc = (Savings) childrenAccounts[i];
				System.out.println("\n\nThe current array member " + i  + ": is of type of Savings account ");
				
				System.out.println("Savings account balance: "  + savingsAcc.getBalance() + " before deposit.");
				savingsAcc.deposit(1000.00);
				System.out.println("Savings balance after 1000.00 deposit : " + savingsAcc.getBalance());
			}
			
		}
		
		/*                      **** OUTPUT ****
		 * 
		    The current array member 0: is of type of Checking account 
			Current balance on your checkingAccount: 5500.0
			Withdrawal amount: -1.00000000099E9. Withdrawing...
			Insufficient funds
			Current balance of checking Account: 5500.0
			
			
			The current array member 1: is of type of Savings account 
			Savings account balance: 10000.0 before deposit.
			Current balance: 11000.0
			Savings balance after 1000.00 deposit : 11000.0
			
			
			The current array member 2: is of type of Credit account 
			
			***
			Error: Equals method requires closeDate member not to be null
			Cannot invoke "java.time.LocalDate.equals(Object)" because the return value of "Account.getClose()" is null

		 */
	}


}

