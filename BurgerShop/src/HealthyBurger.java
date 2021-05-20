public class HealthyBurger extends HamBurger {
    private boolean cabbage;
    private boolean brocolli;
    private String name="Healthy Burger";

    public HealthyBurger(String meat) {
        super("brown rye bread roll", meat, 50);
    }

    public void setCabbage(boolean cabbage) {
        this.cabbage = cabbage;
        if(cabbage){
            this.additional_item_price(5);
        }
    }

    public void setBrocolli(boolean brocolli) {
        this.brocolli = brocolli;
        if(brocolli) {
            this.additional_item_price(12);
        }
    }

}
