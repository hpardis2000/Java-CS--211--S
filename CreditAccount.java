import java.time.LocalDate;

public class CreditAccount extends BankAccount{

	private int expireDate;
	
	public CreditAccount(Bank bank, Client client, LocalDate openDate, double balance,LocalDate expieDate) {
			super(bank, client, openDate, balance);
			this.expireDate=expireDate;
			
		}

	

	public int getExpireDate() {
		return expireDate;
	}



	public void setExpireDate(int expireDate) {
		this.expireDate = expireDate;
	}



	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof CreditAccount) {
			CreditAccount otherCreditAccount=(CreditAccount)obj;
			return super.equals(otherCreditAccount) && this.expireDate==otherCreditAccount.expireDate;
			
		}else {
		return false;
		}
	}


	@Override
	public String toString() {
		return super.toString() + " \n\tannualInterestRate=" + expireDate ;
	}

}
