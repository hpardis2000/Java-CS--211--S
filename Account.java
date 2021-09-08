import java.time.LocalDate;
import java.util.Random;
import java.lang.Math;

public abstract class Account {
    private int accountNo;          // This should be unique so would not have a default
    private String accountName;     // Default account name should be at child class
    private int clientID;
    private double balance;
    private boolean joint;          // Maybe only add in personal account if we separate account types further
    private LocalDate open;         // Represents date (year, month, day (yyyy-MM-dd))
    private LocalDate close;

    private final static double DEFAULT_BALANCE = 0;
    private final static boolean DEFAULT_JOINT = false;
    private final static LocalDate DEFAULT_OPEN_DATE = LocalDate.now();
    private final static LocalDate DEFAULT_CLOSE_DATE = null;

    public Account(int accountNo, String accountName, int clientID, double balance, boolean joint, LocalDate open) {
        if (accountNo < 0 || clientID < 0) {
            throw new IllegalArgumentException("Account number or client ID cannot be less than 0.");
        } else {
            this.accountNo = accountNo;
            this.accountName = accountName;
            this.clientID = clientID;
            this.balance = balance;
            this.joint = joint;
            this.open = open;
            this.close = DEFAULT_CLOSE_DATE;
        }
    }

    // Constructors
    public Account(int accountNo, String accountName, int clientID, double balance, boolean joint) {
        this(accountNo, accountName, clientID, balance, joint, DEFAULT_OPEN_DATE);
    }

    public Account(int accountNo, String accountName, int clientID, double balance, LocalDate open) {
        this(accountNo, accountName, clientID, balance, DEFAULT_JOINT, open);
    }

    public Account(int accountNo, String accountName, int clientID, boolean joint, LocalDate open) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, joint, open);
    }

    public Account(int accountNo, String accountName, int clientID, double balance) {
        this(accountNo, accountName, clientID, balance, DEFAULT_JOINT, DEFAULT_OPEN_DATE);
    }

    public Account(int accountNo, String accountName, int clientID, boolean joint) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, joint, DEFAULT_OPEN_DATE);
    }

    public Account(int accountNo, String accountName, int clientID, LocalDate open) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, DEFAULT_JOINT, open);
    }

    public Account(int accountNo, String accountName, int clientID) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, DEFAULT_JOINT, DEFAULT_OPEN_DATE);
    }

    // Getters and Setters
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        if (accountNo >= 0) {
            this.accountNo = accountNo;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {     // Not sure we should allow the client to be changed as security
        this.clientID = clientID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isJoint() {
        return joint;
    }

    public void setJoint(boolean joint) {
        this.joint = joint;
    }

    public LocalDate getOpen() {
        return open;
    }

    public void setOpen(LocalDate open) {
        this.open = open;
    }

    public LocalDate getClose() {
        return close;
    }

    public void setClose(LocalDate close) {
        this.close = close;
    }

    // toString
    @Override
    public String toString() {
        return "Account: \n\tAccount No.: " + accountNo +
                "\n\tAccount Name: " + accountName +
                "\n\tClient ID: " + clientID +
                "\n\tAccount Balance: " + balance +
                "\n\tJoint Account: " + (joint ? "yes" : "no") +
                "\n\tOpen Date: " + open +
                "\n\tClose Date: " + close;
    }

    // equals - since this is Abstract and there's never an Account object, would this just be left blank?
    @Override
    public abstract boolean equals(Object obj);
//    {
//        if (obj instanceof Account) {
//            Account other = (Account) obj;
//            return (this.accountNo == other.accountNo && this.accountName.equalsIgnoreCase(other.accountName) &&
//                    this.clientID == other.clientID && (Math.abs(this.balance - other.balance) < .01) &&
//                    this.joint == other.joint && this.open.equals(other.open) && this.close.equals(other.close));
//        } else {
//            return false;
//        }
//    }

    // Class-Specific Methods

    public void deposit(double amount) {
        this.balance += amount;
        printBalance();
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            printBalance();
        }
    }

    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }
    
    public static int generateAccountNumber()
    {
    	Random rand = new Random();
    	int newAccountNumber = rand.nextInt(1000000000);
    	
    	return newAccountNumber;
    }
}
