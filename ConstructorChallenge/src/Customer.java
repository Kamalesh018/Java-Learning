public class Customer {

    public String name;
    public double creditLimit;
    public String emailAddress;

    public Customer(double creditLimit){
        this("kavin",creditLimit,"kavin@gmail.com");
    }


    public Customer(){
        this("bala","bala@gmail.com");
    }

    public Customer(String name,String emailAddress){
        this(name,1000.0,emailAddress);
    }
    public Customer(String name,double creditLimit,String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
