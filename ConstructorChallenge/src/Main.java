public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("kamelesh",100.00,"kamalesh@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());


        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thirdCustomer = new Customer("jp","jp@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());

        Customer fourthCustomer = new Customer(100);
        System.out.println(fourthCustomer.getName());
        System.out.println(fourthCustomer.getCreditLimit());
        System.out.println(fourthCustomer.getEmailAddress());
    }


}

