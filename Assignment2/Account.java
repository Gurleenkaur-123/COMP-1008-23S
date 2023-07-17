package Assignment2;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String accountName;

    public Account() {
        accountNumber = 0;
        accountBalance = 0.0;
        accountName = "";
    }

    public Account(String accountName, int accountNumber, double accountBalance) {
        setAccountName(accountName);
        setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
    }

    public String getAccountName() {
        return accountName;
    }

    public boolean setAccountName(String accountName) {
        if (isValidAccountName(accountName)) {
            this.accountName = accountName;
            return true;
        }
        return false;
    }

    private boolean isValidAccountName(String accountName) {
        // The account name can only contain letters, hyphens, single quotes, and spaces.
        // The account name must be a minimum of 4 characters.
        return accountName.matches("[a-zA-Z'-\\s]{4,}");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean setAccountNumber(int accountNumber) {
        if (isValidAccountNumber(accountNumber)) {
            this.accountNumber = accountNumber;
            return true;
        }
        return false;
    }

    private boolean isValidAccountNumber(int accountNumber) {
        // The account number can only contain positive numeric values and must be between 5 and 9 digits.
        return accountNumber > 0 && String.valueOf(accountNumber).matches("\\d{5,9}");
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean setAccountBalance(double accountBalance) {
        if (isValidAccountBalance(accountBalance)) {
            this.accountBalance = accountBalance;
            return true;
        }
        return false;
    }

    private boolean isValidAccountBalance(double accountBalance) {
        // The account balance can contain positive and negative values but must have a maximum precision of 2 decimal places.
        return String.format("%.2f", accountBalance).equals(String.valueOf(accountBalance));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Account otherAccount = (Account) obj;
        return accountNumber == otherAccount.accountNumber
                && Double.compare(accountBalance, otherAccount.accountBalance) == 0
                && accountName.equals(otherAccount.accountName);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
