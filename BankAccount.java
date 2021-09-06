import java.time.LocalDate;

public  class BankAccount {

	private Bank bank;
	private Client client;
	private double balance;
	private LocalDate openDate;
	private String accountType;
	
	private static final LocalDate DEFAULT_OPEN_DATE=LocalDate.now();
	private static final double DEFAULT_BALANCE=0;
	private static final String DEFAULT_ACCOUNT_TYPE="Personal";
	
	public BankAccount(Bank bank, Client client, String accountType, LocalDate openDate,double balance) {
		this.bank=bank;
		this.client=client;
		this.accountType=accountType;
		this.openDate=openDate;
		this.balance=balance;
	}
	
	public BankAccount(Bank bank, Client client, LocalDate openDate,double balance) {
		this(bank,client,DEFAULT_ACCOUNT_TYPE,openDate,balance);
	}
	public BankAccount(Bank bank, Client client,String accountType, double balance) {
		this(bank,client,accountType,DEFAULT_OPEN_DATE,balance);
	}
	public BankAccount(Bank bank, Client client, String accountType, LocalDate openDate) {
		this(bank,client,accountType,openDate,DEFAULT_BALANCE);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount) {
			BankAccount otherBankAccount =(BankAccount) obj;
			return (this.bank.equals(otherBankAccount.bank) &&
					this.client.equals(otherBankAccount.client) && 
					this.accountType.equalsIgnoreCase(otherBankAccount.accountType) &&
					this.openDate.equals(otherBankAccount.openDate) && 
							(this.balance-otherBankAccount.balance) < 0.00001);
		}else {
		return false;
		}
	}
	

	@Override
	public String toString() {
		return "BankAccount: \n\tbank=" + bank + 
				", client=" + client + ", balance=" +
				balance + ", openDate=" + openDate
				+ ", accountType=" + accountType ;
	}
	
	
}
