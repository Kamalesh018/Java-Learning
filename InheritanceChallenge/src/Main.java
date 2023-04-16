public class Main {
    public static void main(String[] args) {
        Employee kamal = new Employee("kamal","18/09/2002",
                "12/09/2023");
        System.out.println(kamal);
        System.out.println("Age = " + kamal.getAge());
        System.out.println("Pay = " + kamal.collectPay());

        SalariedEmployee bala = new SalariedEmployee("bala","07/03/2000","03/03/2022",35000);
        System.out.println(bala);
        System.out.println("bala is payback = " + bala.collectPay());

        bala.retired();
        System.out.println("bala pension check = " + bala.collectPay());

        HourlyEmployee kavin = new HourlyEmployee("kavin","09/03/2002","02/03/2022",15);
        System.out.println(kavin);
        System.out.println("kavin paycheck = " + kavin.collectPay());
        System.out.println("kavin hoilday pay = " + kavin.getDoublePay());
    }
}