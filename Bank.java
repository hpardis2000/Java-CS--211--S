
public class Bank {
	private int bankId;
	private String bankName;
	private String bankAddress;
	
	private final static String DEFAULT_BANK_ADDRESS="Zoneless";
	
	public Bank(int bankId, String bankName, String bankAddress) {
		this.bankId=bankId;
		this.bankName=bankName;
		this.bankAddress=bankAddress;
	}
	public Bank(int bankId, String bankName) {
		this(bankId, bankName,DEFAULT_BANK_ADDRESS);
	}
	
	
	// Getter and Setter 
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		bankAddress = bankAddress;
	}

	
	// toString
	
	@Override
	public String toString() {
		return "Bank: \n\tID =" + bankId + 
		           ", Name=" + bankName + 
		               ", Address=" + bankAddress ;
	}
	
	// equals 
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bank) {
			Bank otherBank=(Bank)obj;
			return(this.bankId==otherBank.bankId && 
					this.bankName.equalsIgnoreCase(otherBank.bankName) && 
					this.bankAddress.equalsIgnoreCase(otherBank.bankAddress));
		}else {
		return false;
		}
	}
	
	
}
