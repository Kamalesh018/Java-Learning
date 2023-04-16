public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",
                3.56,"white");
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        System.out.printf("Total Burger price is %.2f\n" , hamburger.itemizehamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Should not do this",50.53);
        System.out.printf("Total Deluxe burger price is %.2f\n " , db.itemizehamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizehamburger());
    }
}