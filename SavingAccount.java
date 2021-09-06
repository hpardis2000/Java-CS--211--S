import java.time.LocalDate;

public class SavingAccount extends BankAccount {

private int annualInterestRate;
	
	public SavingAccount(Bank bank, Client client, LocalDate openDate, double balance,int annualInterestRate) {
			super(bank, client, openDate, balance);
			this.annualInterestRate=annualInterestRate;
			
		}

	

	public int getAnnualInterestRate() {
		return annualInterestRate;
	}



	public void setAnnualInterestRate(int annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}



	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof CreditAccount) {
			SavingAccount otherSavingAccount=(SavingAccount)obj;
			return super.equals(otherSavingAccount) && this.annualInterestRate==otherSavingAccount.annualInterestRate;
			
		}else {
		return false;
		}
	}


	@Override
	public String toString() {
		return super.toString() + " \n\tannualInterestRate=" + annualInterestRate ;
	}

}
