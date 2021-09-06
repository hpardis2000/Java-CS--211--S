
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
		
		
//		BankAccount account1=new BankAccount(bank1,client1,"personal",100);
//		System.out.println(account1);
		
		
		
		// TEST CHECKING CLASS
		
		int checkingAccountNo1 = 1000000001;
		int checkingAccountNo2 = 1000000002;
		int clientIdNo1 = 101;
		int clientIdNo2 = 102;
		LocalDate today = Localdate.now();
		boolean overdraftProtection = true;
		boolean joint = false;
		double balance = 0.0;
		String checkingAccountName1 = "LastName0, FirstName0";
		String checkingAccountName2 = "LastName1, FirstName1";
		
		Checking checkingAccount1 = new Checking(checkingAccountNo1, checkingAccountName1, clientIdNo1, balance, joint, today, overdraftProtection);
		Checking checkingAccount2 = new Checking(checkingAccountNo2, checkingAccountName2, clientIdNo2, balance, joint, today, overdraftProtection);
		
		// this line is wrong. will have to redo checking account logic later
		checking.setOverdraftProtection(overdraftProtection);
		
		// TESTING TOSTRING() METHOD
		System.out.println("New checking account: " + checkingAccount1.toString());
		
		// TESTING EQAULS() METHOD
		if (checkingAccount1.equals(checkingAccount2) 
		{
			System.out.println("New checking account:  " + checkingAccount2.toString() + " belong to " + checkingAccount1.toString());
		}
	}

}
