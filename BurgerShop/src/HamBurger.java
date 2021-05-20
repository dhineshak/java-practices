public class HamBurger {
    private String bread_roll_type;
    private String meat;
    private boolean cheese;
    private boolean tomato;
    private boolean carrot;
    private boolean lettuce;
    private double price;

    public HamBurger(String bread_roll_type, String meat, double price) {
        this.bread_roll_type = bread_roll_type;
        this.meat = meat;
        this.price = price;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
        if(cheese){
            price+=15;
        }
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        if(tomato){
            price+=5;
        }
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
        if(carrot){
            price+=6;
        }
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        if(lettuce){
            price+=10;
        }
    }

    public double getPrice() {
        return price;
    }

    public void additional_item_price(double price) {
        if(price>0) {
            this.price += price;
        }
        else{
            System.out.println("Invalid price");
        }
    }
}
