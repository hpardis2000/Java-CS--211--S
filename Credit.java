import java.time.LocalDate;
import java.lang.Math;

public class Credit extends Account {

    private static final String DEFAULT_CREDIT_NAME = "General Credit Line";

    // Constructors
//    public Credit(int accountNo, String accountName, int clientID, double balance, boolean joint, int jointID,
//                  LocalDate open) {
//        super(accountNo, accountName, clientID, balance, joint, jointID, open);
//    }

    public Credit(String accountName, int clientID, double balance, boolean joint, int jointID, LocalDate open) {
        super(accountName, clientID, balance, joint, jointID, open);
    }

//    public Credit(int accountNo, int clientID, double balance, boolean joint, int jointID, LocalDate open) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID, balance, joint, jointID, open);
//    }

    public Credit(int clientID, double balance, boolean joint, int jointID, LocalDate open) {
        super(DEFAULT_CREDIT_NAME, clientID, balance, joint, jointID, open);
    }

//    public Credit(int accountNo, String accountName, int clientID, double balance, boolean joint, int jointID) {
//        super(accountNo, accountName, clientID, balance, joint, jointID);
//    }

    public Credit(String accountName, int clientID, double balance, boolean joint, int jointID) {
        super(accountName, clientID, balance, joint, jointID);
    }

//    public Credit(int accountNo, int clientID, double balance, boolean joint, int jointID) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID, balance, joint, jointID);
//    }

    public Credit(int clientID, double balance, boolean joint, int jointID) {
        super(DEFAULT_CREDIT_NAME, clientID, balance, joint, jointID);
    }

//    public Credit(int accountNo, String accountName, int clientID, double balance, LocalDate open) {
//        super(accountNo, accountName, clientID, balance, open);
//    }

    public Credit(String accountName, int clientID, double balance, LocalDate open) {
        super(accountName, clientID, balance, open);
    }

//    public Credit(int accountNo, String accountName, int clientID, boolean joint, int jointID, LocalDate open) {
//        super(accountNo, accountName, clientID, joint, jointID, open);
//    }

    public Credit(String accountName, int clientID, boolean joint, int jointID, LocalDate open) {
        super(accountName, clientID, joint, jointID, open);
    }

//    public Credit(int accountNo, int clientID, boolean joint, int jointID, LocalDate open) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID, joint, jointID, open);
//    }

    public Credit(int clientID, boolean joint, int jointID, LocalDate open) {
        super(DEFAULT_CREDIT_NAME, clientID, joint, jointID, open);
    }

//    public Credit(int accountNo, String accountName, int clientID, double balance) {
//        super(accountNo, accountName, clientID, balance);
//    }

    public Credit(String accountName, int clientID, double balance) {
        super(accountName, clientID, balance);
    }

//    public Credit(int accountNo, int clientID, double balance) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID, balance);
//    }

    public Credit(int clientID, double balance) {
        super(DEFAULT_CREDIT_NAME, clientID, balance);
    }

//    public Credit(int accountNo, String accountName, int clientID, boolean joint, int jointID) {
//        super(accountNo, accountName, clientID, joint, jointID);
//    }

    public Credit(String accountName, int clientID, boolean joint, int jointID) {
        super(accountName, clientID, joint, jointID);
    }

//    public Credit(int accountNo, int clientID, boolean joint, int jointID) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID, joint, jointID);
//    }

    public Credit(int clientID, boolean joint, int jointID) {
        super(DEFAULT_CREDIT_NAME, clientID, joint, jointID);
    }

//    public Credit(int accountNo, String accountName, int clientID, LocalDate open) {
//        super(accountNo, accountName, clientID, open);
//    }

    public Credit(String accountName, int clientID, LocalDate open) {
        super(accountName, clientID, open);
    }

//    public Credit(int accountNo, int clientID, LocalDate open) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID, open);
//    }

    public Credit(int clientID, LocalDate open) {
        super(DEFAULT_CREDIT_NAME, clientID, open);
    }

//    public Credit(int accountNo, String accountName, int clientID) {
//        super(accountNo, accountName, clientID);
//    }

    public Credit(String accountName, int clientID) {
        super(accountName, clientID);
    }

//    public Credit(int accountNo, int clientID) {
//        super(accountNo, DEFAULT_CREDIT_NAME, clientID);
//    }

    public Credit(int clientID) {
        super(DEFAULT_CREDIT_NAME, clientID);
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Credit) {
            Credit other = (Credit) obj;
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
