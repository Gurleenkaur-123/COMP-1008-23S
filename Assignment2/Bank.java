package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private BranchLocations branchLocation;
    private List<Account> accounts;

    public enum BranchLocations {
        BRANCH_A,
        BRANCH_B,
        BRANCH_C,
        BRANCH_D,
        BRANCH_E
    }

    public Bank() {
        bankName = "";
        branchLocation = null;
        accounts = new ArrayList<>();
    }

    public Bank(String bankName, String branchLocation) {
        setBankName(bankName);
        setBranchLocation(branchLocation);
        accounts = new ArrayList<>();
    }

    public Bank(String bankName, BranchLocations branchLocation) {
        setBankName(bankName);
        setBranchLocation(branchLocation);
        accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean setBankName(String bankName) {
        if (isValidBankName(bankName)) {
            this.bankName = bankName;
            return true;
        }
        return false;
    }

    private boolean isValidBankName(String bankName) {
        // The bank name can only contain alphabetical characters, numbers, ampersand, and space.
        // The bank name should be a minimum of 8 characters.
        return bankName.matches("[a-zA-Z0-9&\\s]{8,}");
    }

    public boolean setBranchLocation(String branchLocation) {
        for (BranchLocations loc : BranchLocations.values()) {
            if (loc.toString().equals(branchLocation)) {
                this.branchLocation = loc;
                return true;
            }
        }
        return false;
    }

    public String getBranchLocation() {
        return branchLocation != null ? branchLocation.toString() : "";
    }

    public boolean setBranchLocation(BranchLocations branchLocation) {
        this.branchLocation = branchLocation;
        return true;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return new Account(); // Return an empty object if not found
    }

    public boolean addAccount(Account account) {
        if (isUniqueAccountNumber(account.getAccountNumber())) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
        if (isUniqueAccountNumber(accountNumber)) {
            Account account = new Account(accountName, accountNumber, accountBalance);
            accounts.add(account);
            return true;
        }
        return false;
    }

    private boolean isUniqueAccountNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return false;
            }
        }
        return true;
    }

    public Account viewAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return new Account(); // Return an empty object if not found
    }

    public Account viewAccount(byte index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return new Account(); // Return an empty object if index is not valid
    }

    public boolean modifyAccount(int accountNumber, String accountName) {
        Account account = getAccountByNumber(accountNumber);
        if (account.getAccountNumber() == 0) {
            return false; // Account not found
        }
        return account.setAccountName(accountName);
    }

    public boolean modifyAccount(int accountNumber, double accountBalance) {
        Account account = getAccountByNumber(accountNumber);
        if (account.getAccountNumber() == 0) {
            return false; // Account not found
        }
        return account.setAccountBalance(accountBalance);
    }

    public boolean modifyAccount(int accountNumber, String accountName, double accountBalance) {
        Account account = getAccountByNumber(accountNumber);
        if (account.getAccountNumber() == 0) {
            return false; // Account not found
        }
        boolean isNameUpdated = account.setAccountName(accountName);
        boolean isBalanceUpdated = account.setAccountBalance(accountBalance);
        return isNameUpdated && isBalanceUpdated;
    }

    public boolean modifyAccount(byte index, String accountName) {
        Account account = viewAccount(index);
        if (account.getAccountNumber() == 0) {
            return false; // Account not found
        }
        return account.setAccountName(accountName);
    }

    public boolean modifyAccount(byte index, double accountBalance) {
        Account account = viewAccount(index);
        if (account.getAccountNumber() == 0) {
            return false; // Account not found
        }
        return account.setAccountBalance(accountBalance);
    }

    public boolean modifyAccount(byte index, String accountName, double accountBalance) {
        Account account = viewAccount(index);
        if (account.getAccountNumber() == 0) {
            return false; // Account not found
        }
        boolean isNameUpdated = account.setAccountName(accountName);
        boolean isBalanceUpdated = account.setAccountBalance(accountBalance);
        return isNameUpdated && isBalanceUpdated;
    }

    public boolean deleteAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                return true;
            }
        }
        return false; // Account not found
    }

    public boolean deleteAccount(byte index) {
        if (index >= 0 && index < accounts.size()) {
            accounts.remove(index);
            return true;
        }
        return false; // Index not valid
    }
}
