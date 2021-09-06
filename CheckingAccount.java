import java.time.LocalDate;

public class CheckingAccount extends BankAccount {
	private int insufficientsFundsFee;
	
public CheckingAccount(Bank bank, Client client, LocalDate openDate, double balance,int insufficientsFundsFee) {
		super(bank, client, openDate, balance);
		this.insufficientsFundsFee=insufficientsFundsFee;
		
	}

public int getInsufficientsFundsFee() {
	return insufficientsFundsFee;
}

public void setInsufficientsFundsFee(int insufficientsFundsFee) {
	this.insufficientsFundsFee = insufficientsFundsFee;
}

@Override 
public boolean equals(Object obj) {
	if(obj instanceof CheckingAccount) {
		CheckingAccount otherCheckingAccount=(CheckingAccount)obj;
		return super.equals(otherCheckingAccount) && this.insufficientsFundsFee==otherCheckingAccount.insufficientsFundsFee;
		
	}else {
	return false;
	}
}


@Override
public String toString() {
	return super.toString() + " \n\tinsufficientsFundsFee=" + insufficientsFundsFee ;
}



}
