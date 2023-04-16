package kamalesh.array;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transacton){
    public Customer(String name, double intitalDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transacton.add(intitalDeposit);
    }
}
public class Main {
    public static void main(String[] args) {
        Customer kamalesh = new Customer("kamalesh",1000.00);
        System.out.println(kamalesh);

        Bank bank = new Bank("bala");
        bank.addNewCustomers("kala", 500.0);
        System.out.println(bank);

        bank.addTransaction("kala",-10.25);
        bank.addTransaction("kala ",-75.01);
        bank.printStatement("kala");

        bank.addNewCustomers("bala",25);
        bank.addTransaction("bala",100);
        bank.printStatement("bala");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customers (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomers(String customerName, double initialDeposit){
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("new customers added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if(customer != null){
            customer.transacton().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Tranactions: ");
        for(double d : customer.transacton()){ //unboxing
            System.out.printf("$%10.2f (%s)%n",d,d < 0 ? "debit" : "credit");
        }
    }
}
