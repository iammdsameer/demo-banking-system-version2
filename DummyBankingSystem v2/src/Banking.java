public class Banking {

    private String accountNumber;   // I preferred String. Long or Int could be used as well.
    private String accountHolder;
    private String holderType;
    private double balance;


    public Banking(String accountNumber, String accountHolder, String holderType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.holderType = holderType;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public String getHolderType() {
        return holderType;
    }


    public double getBalance() {
        return balance;
    }


    public void depositAmount(double amount) {
        this.balance += amount;
        System.out.println("Amount of Rs. " + amount + " was successfully deposited in your account.");
    }

    public void withdrawAmount(double amount) {
        if(this.balance > amount) {
            this.balance -= amount;
            System.out.println("Withdrawn Rs. " + amount);
        } else {
            System.out.println("Insufficient Fund !");
        }
    }
}
