import java.time.LocalDate;
import java.lang.Math;

public abstract class Account {
    private int accountNo;          // This should be unique so would not have a default
    private String accountName;     // Default account name should be at child class
    private int clientID;
    private double balance;
    private boolean joint;          // Maybe only add in personal account if we separate client types further
    private int jointID;            // Default to -1 if joint is false
    private LocalDate open;         // Represents date (year, month, day (yyyy-MM-dd))
    private LocalDate close;

    private final static double DEFAULT_BALANCE = 0;
    private final static boolean DEFAULT_JOINT = false;
    private final static int DEFAULT_JOINTID = -1;
    private final static LocalDate DEFAULT_OPEN_DATE = LocalDate.now();
    private final static LocalDate DEFAULT_CLOSE_DATE = null;

    public Account(int accountNo, String accountName, int clientID, double balance, boolean joint, int jointID,
                   LocalDate open) {
        if (accountNo <= 0 || clientID <= 0) {
            throw new IllegalArgumentException("Account number or client ID cannot be less than or equal to 0.");
        } else if (joint && !(jointID > 0)) {
            throw new IllegalArgumentException("Joint ID is required for joint accounts and cannot be less than 1.");
        } else {
            this.accountNo = accountNo;
            this.accountName = accountName;
            this.clientID = clientID;
            this.balance = balance;
            this.joint = joint;
            this.jointID = jointID;
            this.open = open;
            this.close = DEFAULT_CLOSE_DATE;
        }
    }

    // Constructors
    public Account(int accountNo, String accountName, int clientID, double balance, boolean joint, int jointID) {
        this(accountNo, accountName, clientID, balance, joint, jointID, DEFAULT_OPEN_DATE);
    }

    public Account(int accountNo, String accountName, int clientID, double balance, LocalDate open) {
        this(accountNo, accountName, clientID, balance, DEFAULT_JOINT, DEFAULT_JOINTID, open);
    }

    public Account(int accountNo, String accountName, int clientID, boolean joint, int jointID, LocalDate open) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, joint, jointID, open);
    }

    public Account(int accountNo, String accountName, int clientID, double balance) {
        this(accountNo, accountName, clientID, balance, DEFAULT_JOINT, DEFAULT_JOINTID, DEFAULT_OPEN_DATE);
    }

    public Account(int accountNo, String accountName, int clientID, boolean joint, int jointID) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, joint, jointID, DEFAULT_OPEN_DATE);
    }

    public Account(int accountNo, String accountName, int clientID, LocalDate open) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, DEFAULT_JOINT, DEFAULT_JOINTID, open);
    }

    public Account(int accountNo, String accountName, int clientID) {
        this(accountNo, accountName, clientID, DEFAULT_BALANCE, DEFAULT_JOINT, DEFAULT_JOINTID, DEFAULT_OPEN_DATE);
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
        if (clientID >= 0) {
            this.clientID = clientID;
        }
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

        if (joint && (jointID <= 0)) {
            System.out.println("Please update joint ID.");
        } else if (!joint) {
            jointID = DEFAULT_JOINTID;
        }

    }

    public int getJointID() {
        return jointID;
    }

    public void setJointID(int jointID) {
        if (joint && jointID > 0) {
            this.jointID = jointID;
        } else if (!joint && jointID > 0) {
            System.out.println("This is not a joint account.");
        }
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
                "\n\tJoint ID: " + (joint ? jointID : "N/A") +
                "\n\tOpen Date: " + open +
                "\n\tClose Date: " + close;
    }

    // abstract equals
    @Override
    public abstract boolean equals(Object obj);

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
}
