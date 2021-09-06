import java.time.LocalDate;
import java.lang.Math;

public class Savings extends Account {

    private final static String DEFAULT_SAVINGS_NAME = "General Savings Account";

    // Constructors
//    public Savings(int accountNo, String accountName, int clientID, double balance, boolean joint, int jointID,
//                   LocalDate open) {
//        super(accountNo, accountName, clientID, balance, joint, jointID, open);
//    }

    public Savings(String accountName, int clientID, double balance, boolean joint, int jointID, LocalDate open) {
        super(accountName, clientID, balance, joint, jointID, open);
    }

//    public Savings(int accountNo, int clientID, double balance, boolean joint, int jointID,
//                   LocalDate open) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, balance, joint, jointID, open);
//    }

    public Savings(int clientID, double balance, boolean joint, int jointID, LocalDate open) {
        super(DEFAULT_SAVINGS_NAME, clientID, balance, joint, jointID, open);
    }

//    public Savings(int accountNo, String accountName, int clientID, double balance, boolean joint, int jointID) {
//        super(accountNo, accountName, clientID, balance, joint, jointID);
//    }

    public Savings(String accountName, int clientID, double balance, boolean joint, int jointID) {
        super(accountName, clientID, balance, joint, jointID);
    }

//    public Savings(int accountNo, int clientID, double balance, boolean joint, int jointID) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, balance, joint, jointID);
//    }

    public Savings(int clientID, double balance, boolean joint, int jointID) {
        super(DEFAULT_SAVINGS_NAME, clientID, balance, joint, jointID);
    }

//    public Savings(int accountNo, String accountName, int clientID, double balance, LocalDate open) {
//        super(accountNo, accountName, clientID, balance, open);
//    }

    public Savings(String accountName, int clientID, double balance, LocalDate open) {
        super(accountName, clientID, balance, open);
    }

//    public Savings(int accountNo, int clientID, double balance, LocalDate open) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, balance, open);
//    }

    public Savings(int clientID, double balance, LocalDate open) {
        super(DEFAULT_SAVINGS_NAME, clientID, balance, open);
    }

//    public Savings(int accountNo, String accountName, int clientID, boolean joint, int jointID, LocalDate open) {
//        super(accountNo, accountName, clientID, joint, jointID, open);
//    }

    public Savings(String accountName, int clientID, boolean joint, int jointID, LocalDate open) {
        super(accountName, clientID, joint, jointID, open);
    }

//    public Savings(int accountNo, int clientID, boolean joint, int jointID, LocalDate open) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, joint, jointID, open);
//    }

    public Savings(int clientID, boolean joint, int jointID, LocalDate open) {
        super(DEFAULT_SAVINGS_NAME, clientID, joint, jointID, open);
    }

//    public Savings(int accountNo, String accountName, int clientID, double balance) {
//        super(accountNo, accountName, clientID, balance);
//    }

    public Savings(String accountName, int clientID, double balance) {
        super(accountName, clientID, balance);
    }

//    public Savings(int accountNo, int clientID, double balance) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, balance);
//    }

    public Savings(int clientID, double balance) {
        super(DEFAULT_SAVINGS_NAME, clientID, balance);
    }

//    public Savings(int accountNo, String accountName, int clientID, boolean joint, int jointID) {
//        super(accountNo, accountName, clientID, joint, jointID);
//    }

    public Savings(String accountName, int clientID, boolean joint, int jointID) {
        super(accountName, clientID, joint, jointID);
    }

//    public Savings(int accountNo, int clientID, boolean joint, int jointID) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, joint, jointID);
//    }

    public Savings(int clientID, boolean joint, int jointID) {
        super(DEFAULT_SAVINGS_NAME, clientID, joint, jointID);
    }

//    public Savings(int accountNo, String accountName, int clientID, LocalDate open) {
//        super(accountNo, accountName, clientID, open);
//    }

    public Savings(String accountName, int clientID, LocalDate open) {
        super(accountName, clientID, open);
    }

//    public Savings(int accountNo, int clientID, LocalDate open) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID, open);
//    }

    public Savings(int clientID, LocalDate open) {
        super(DEFAULT_SAVINGS_NAME, clientID, open);
    }

//    public Savings(int accountNo, String accountName, int clientID) {
//        super(accountNo, accountName, clientID);
//    }

    public Savings(String accountName, int clientID) {
        super(accountName, clientID);
    }

//    public Savings(int accountNo, int clientID) {
//        super(accountNo, DEFAULT_SAVINGS_NAME, clientID);
//    }

    public Savings(int clientID) {
        super(DEFAULT_SAVINGS_NAME, clientID);
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Savings) {
            Savings other = (Savings) obj;
            return (super.getAccountNo() == other.getAccountNo() &&
                    super.getAccountName().equalsIgnoreCase(other.getAccountName()) &&
                    super.getClientID() == other.getClientID() &&
                    (Math.abs(super.getBalance() - other.getBalance()) < .01) &&
                    super.isJoint() == other.isJoint() && super.getJointID() == other.getJointID() &&
                    super.getOpen().equals(other.getOpen()) && super.getClose().equals(other.getClose()));
        } else {
            return false;
        }
    }
}
