public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
        System.out.println("Showed the details of the customers");
        bobsAccount.setAccountNumber("123421324");
        bobsAccount.setAccountBalance(1000.00);
        bobsAccount.setCustomerName("KAMALESH");
        bobsAccount.setEmail("slkdnvsldnvs@gmail.com");
        bobsAccount.setPhNumber("9500347692");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhNumber());
        System.out.println("--------------------------------------------------");
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        System.out.println("-------NEXT TRANSACTION-------");
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(55.55);
    }

}
