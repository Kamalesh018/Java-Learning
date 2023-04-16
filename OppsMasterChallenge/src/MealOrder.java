public class MealOrder {
    private Burger buger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String bugerType, String drinkType, String sideType) {
        if (bugerType.equalsIgnoreCase("deluxe")) {
            this.buger = new DeluxeBurger(bugerType, 8.5);
        } else {
            this.buger = new Burger(bugerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice() {
        if (buger instanceof DeluxeBurger) {
            return buger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                buger.getAdjustedPrice();
    }

    public void printItemizedList() {
        buger.printItem();
        if (buger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addTopping(String extra1, String extra2, String extra3) {
        buger.addToppimgs(extra1, extra2, extra3);
    }

    public void addTopping(String extra1, String extra2, String extra3
            , String extra4, String extra5) {
        if (buger instanceof DeluxeBurger db) {
            db.addToppimgs(extra1, extra2, extra3, extra4, extra5);
        } else{
            buger.addToppimgs(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
