
public class Client {
	private int clientId;
	private String clientName;
	private String clientAddress;
	private final static int DEFAULT_CLIENT_ID=1;
	private final static String DEFAULT_CLIENT_NAME="Anonymous";
	private final static String DEFAULT_CLIENT_ADDRESS="Zoneless";
	
	public Client(int clientId, String clientName, String clientAddress) {
		this.clientId=clientId;
		this.clientName=clientName;
		this.clientAddress=clientAddress;
	}
	public Client(String clientName,String clientAddress) {
		this(DEFAULT_CLIENT_ID, clientName, clientAddress);
	}
	public Client(int clientId,String clientName) {
		this(clientId,clientName,DEFAULT_CLIENT_ADDRESS);
	}
	//  How can i use this also?
//	public Client(int clientId, String clientAddress) {
//		this(clientId,DEFAULT_CLIENT_NAME,clientAddress);
//	}
	public Client(int clientId) {
		this(clientId,DEFAULT_CLIENT_NAME,DEFAULT_CLIENT_ADDRESS);
	}
	// Getter and Setter 
	
	public int getClientId() {
		return this.clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return this.clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddress() {
		return this.clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Client: \n\tID =" + clientId + 
				           ", Name=" + clientName + 
				               ", Address=" + clientAddress ;
	}
	
	// equals
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Client) {
			Client otherClient=(Client)obj;
			return(this.clientId==otherClient.clientId && 
					this.clientName.equalsIgnoreCase(otherClient.clientName) && 
					this.clientAddress.equalsIgnoreCase(otherClient.clientAddress));
		}else {
		return false;
		}
	}

	
}
