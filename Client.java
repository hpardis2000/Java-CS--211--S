
public class Client {
	private int clientId;
	private String clientName;
	private String clientAddress;

	// Since there should be a unique client ID number, I don't think there should be a default. You can set it though
	// where it will calculate the next number in the constructor. I forgot what this is called. I think you have a
	// variable inside the class that gets updated each time a new object is instantiated, which we can build on.
	// For now though, I don't think there should be a default and it should be a required field.
	private final static int DEFAULT_CLIENT_ID = 1;
	// In answer to your question below for the constructor, practically would you ever want a client account where
	// there isn't a client name?
	private final static String DEFAULT_CLIENT_NAME = "Anonymous";
	private final static String DEFAULT_CLIENT_ADDRESS = "Zoneless";
	
	public Client (int clientId, String clientName, String clientAddress) {
		this.clientId=clientId;
		this.clientName=clientName;
		this.clientAddress=clientAddress;
	}

	public Client (String clientName,String clientAddress) {
		this(DEFAULT_CLIENT_ID, clientName, clientAddress);
	}

	public Client (int clientId,String clientName) {
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
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddress() {
		return clientAddress;
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
