public class DeluxeBurger extends HamBurger{
    private boolean chipsandDrinks=true;
    private String name="Deluxe Burger";

    public DeluxeBurger(String bread_roll_type, String meat) {
        super(bread_roll_type, meat, 80);
    }
}
