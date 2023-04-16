public class HealthyBurger extends Hamburger{

    public HealthyBurger(String meat, Double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name,double price) {
        super.addHamburgerAddition1(name, price);
    }

    public void addHealthyAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

}
