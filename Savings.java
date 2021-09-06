import java.time.LocalDate;
import java.lang.Math;

public class Savings extends Account {

    public Savings(int accountNo, String accountName, int clientID, double balance, boolean joint, LocalDate open) {
        super(accountNo, accountName, clientID, balance, joint, open);
    }

    public Savings(int accountNo, String accountName, int clientID, double balance, boolean joint) {
        super(accountNo, accountName, clientID, balance, joint);
    }

    public Savings(int accountNo, String accountName, int clientID, double balance, LocalDate open) {
        super(accountNo, accountName, clientID, balance, open);
    }

    public Savings(int accountNo, String accountName, int clientID, boolean joint, LocalDate open) {
        super(accountNo, accountName, clientID, joint, open);
    }

    public Savings(int accountNo, String accountName, int clientID, double balance) {
        super(accountNo, accountName, clientID, balance);
    }

    public Savings(int accountNo, String accountName, int clientID, boolean joint) {
        super(accountNo, accountName, clientID, joint);
    }

    public Savings(int accountNo, String accountName, int clientID, LocalDate open) {
        super(accountNo, accountName, clientID, open);
    }

    public Savings(int accountNo, String accountName, int clientID) {
        super(accountNo, accountName, clientID);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
