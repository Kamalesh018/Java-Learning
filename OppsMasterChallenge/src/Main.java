public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacado = new Item("Topping", "avacado",1.50);
//        avacado.printItem();

//        Burger buger = new Burger("regular", 4.00);
//        buger.addToppimgs("BACON","CHEESE","MAYO");
//        buger.printItem();


//        MealOrder regualarMeal = new MealOrder();
//        regualarMeal.addTopping("CHEESE","BACON","MAYO");
//        regualarMeal.setDrinkSize("LARGE");
//        regualarMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey","7-up","chill");
//        secondMeal.addTopping("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chilli");
        deluxeMeal.addTopping("AVACADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("small");
        deluxeMeal.printItemizedList();


    }
}