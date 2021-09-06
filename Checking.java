import java.time.LocalDate;
import java.lang.Math;

public class Checking extends Account {

    private boolean overdraftProtection;        // Can also add overdraft limit for more complexity

    private final static String DEFAULT_CHECKING_NAME = "General Checking Account";
    private final static boolean DEFAULT_OVERDRAFT_PROTECTION = false;

    // Constructors
    public Checking(int accountNo, String accountName, int clientID, double balance, boolean joint, LocalDate open,
                    boolean overdraftProtection) {
        super(accountNo, accountName, clientID, balance, joint, open);
        this.overdraftProtection = overdraftProtection;
    }

    public Checking(int accountNo, String accountName, int clientID, double balance, boolean joint, LocalDate open) {
        super(accountNo, accountName, clientID, balance, joint, open);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

    public Checking(int accountNo, int clientID, double balance, boolean joint, LocalDate open,
                    boolean overdraftProtection) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, joint, open, overdraftProtection);
    }

    public Checking(int accountNo, int clientID, double balance, boolean joint, LocalDate open) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, joint, open, DEFAULT_OVERDRAFT_PROTECTION);
    }

    public Checking(int accountNo, String accountName, int clientID, double balance, boolean joint,
                    boolean overdraftProtection) {
        super(accountNo, accountName, clientID, balance, joint);
        this.overdraftProtection = overdraftProtection;
    }

    public Checking(int accountNo, String accountName, int clientID, double balance, boolean joint) {
        /*
        Getting error because it is recognizing the parameter types as redundant with lines 101-104
        even though it is for different variables. Maybe need to flip type to fix.
         */
        super(accountNo, accountName, clientID, balance, joint);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

    public Checking(int accountNo, int clientID, double balance, boolean joint, boolean overdraftProtection) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, joint, overdraftProtection);
    }

    public Checking(int accountNo, int clientID, double balance, boolean joint) {
        /*
        Getting error because it is recognizing the parameter types as redundant with lines 111-113
        even though it is for different variables. Maybe need to flip type to fix.
         */
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, joint, DEFAULT_OVERDRAFT_PROTECTION);
    }

    public Checking(int accountNo, String accountName, int clientID, double balance, LocalDate open,
                    boolean overdraftProtection) {
        super(accountNo, accountName, clientID, balance, open);
        this.overdraftProtection = overdraftProtection;
    }

    public Checking(int accountNo, String accountName, int clientID, double balance, LocalDate open) {
        super(accountNo, accountName, clientID, balance, open);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

    public Checking(int accountNo, int clientID, double balance, LocalDate open, boolean overdraftProtection) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, open, overdraftProtection);
    }

    public Checking(int accountNo, int clientID, double balance, LocalDate open) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, open, DEFAULT_OVERDRAFT_PROTECTION);
    }

    public Checking(int accountNo, String accountName, int clientID, boolean joint, LocalDate open,
                    boolean overdraftProtection) {
        super(accountNo, accountName, clientID, joint, open);
        this.overdraftProtection = overdraftProtection;
    }

    public Checking(int accountNo, String accountName, int clientID, boolean joint, LocalDate open) {
        super(accountNo, accountName, clientID, joint, open);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

    public Checking(int accountNo, int clientID, boolean joint, LocalDate open, boolean overdraftProtection) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, joint, open, overdraftProtection);
    }

    public Checking(int accountNo, int clientID, boolean joint, LocalDate open) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, joint, open, DEFAULT_OVERDRAFT_PROTECTION);
    }

//    public Checking(int accountNo, String accountName, int clientID, double balance, boolean overdraftProtection) {
//        super(accountNo, accountName, clientID, balance);
//        this.overdraftProtection = overdraftProtection;
//    }

    public Checking(int accountNo, String accountName, int clientID, double balance) {
        super(accountNo, accountName, clientID, balance);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

//    public Checking(int accountNo, int clientID, double balance, boolean overdraftProtection) {
//        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, overdraftProtection);
//    }

    public Checking(int accountNo, int clientID, double balance) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, balance, DEFAULT_OVERDRAFT_PROTECTION);
    }

    public Checking(int accountNo, String accountName, int clientID, boolean joint, boolean overdraftProtection) {
        super(accountNo, accountName, clientID, joint);
        this.overdraftProtection = overdraftProtection;
    }

    public Checking(int accountNo, String accountName, int clientID, boolean joint) {
        /*
        Getting error because it is recognizing the parameter types as redundant with lines 163-166
        even though it is for different variables. Maybe need to flip type to fix.
         */
        super(accountNo, accountName, clientID, joint);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

    public Checking(int accountNo, int clientID, boolean joint, boolean overdraftProtection) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, joint, overdraftProtection);
    }

    public Checking(int accountNo, int clientID, boolean joint) {
        /*
        Getting error because it is recognizing the parameter types as redundant with lines 173-175
        even though it is for different variables. Maybe need to flip type to fix.
         */
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, joint, DEFAULT_OVERDRAFT_PROTECTION);
    }

    public Checking(int accountNo, String name, int clientID, LocalDate open, boolean overdraftProtection) {
        super(accountNo, name, clientID, open);
        this.overdraftProtection = overdraftProtection;
    }

    public Checking(int accountNo, String name, int clientID, LocalDate open) {
        super(accountNo, name, clientID, open);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

    public Checking(int accountNo, int clientID, LocalDate open, boolean overdraftProtection) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, open, overdraftProtection);
    }

    public Checking(int accountNo, int clientID, LocalDate open) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, open, DEFAULT_OVERDRAFT_PROTECTION);
    }

//    public Checking(int accountNo, String name, int clientID, boolean overdraftProtection) {
//        super(accountNo, name, clientID);
//        this.overdraftProtection = overdraftProtection;
//    }

    public Checking(int accountNo, String name, int clientID) {
        super(accountNo, name, clientID);
        this.overdraftProtection = DEFAULT_OVERDRAFT_PROTECTION;
    }

//    public Checking(int accountNo, int clientID, boolean overdraftProtection) {
//        this(accountNo, DEFAULT_CHECKING_NAME, clientID, overdraftProtection);
//    }

    public Checking(int accountNo, int clientID) {
        this(accountNo, DEFAULT_CHECKING_NAME, clientID, DEFAULT_OVERDRAFT_PROTECTION);
    }

    // Getters and Setters
    public boolean isOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(boolean overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\n\tOverdraft Protection: " + (overdraftProtection ? "yes" : "no");
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Checking) {
            Checking other = (Checking) obj;
            return (super.getAccountNo() == other.getAccountNo() &&
                    super.getAccountName().equalsIgnoreCase(other.getAccountName()) &&
                    super.getClientID() == other.getClientID() &&
                    (Math.abs(super.getBalance() - other.getBalance()) < .01) &&
                    super.isJoint() == other.isJoint() && super.getOpen().equals(other.getOpen()) &&
                    super.getClose().equals(other.getClose()) && this.overdraftProtection == other.overdraftProtection);
        } else {
            return false;
        }
    }

    // Class-Specific Method
    @Override
    public void withdrawal(double amount) {
        if (overdraftProtection) {
            super.setBalance(getBalance() - amount);
            super.printBalance();
        } else {
            super.withdrawal(amount);
        }
    }
}
