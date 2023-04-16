public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phNumber;



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + "made . new Balance is $" +
                accountBalance);
    }
    public void withdrawFunds(double withdrawAmount){
        if(accountBalance - withdrawAmount < 0){
            System.out.println("Insufficent funds! you only have $" + accountBalance +
                    "in your account");
        }else{
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount +
                    "processed, remaing balance = $" + accountBalance);
        }
    }
}
