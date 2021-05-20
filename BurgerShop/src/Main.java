import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Bills Burger Shop");
        System.out.println("Enter corresponding numbers for ordering");
        System.out.println("Available Burger:\n 1:Normal_HamBurger-40$ 2:Healthy_HamBurger-50$ 3:Deluxe_HamBurger-80$");
        int burger_number=scan.nextInt();
        HamBurger burger=burger_call(burger_number);

        System.out.println("Do you need to add carrot(6$)(Enter true to add,else false)");
        boolean carrot=scan.nextBoolean();
        burger.setCarrot(carrot);

        System.out.println("Do you need to add extra cheese(15$)(Press true to add,else false)");
        boolean extra_cheese=scan.nextBoolean();
        burger.setCheese(extra_cheese);

        System.out.println("Do you need to add tomato(5$)(Press true to add,else false)");
        boolean tomato=scan.nextBoolean();
        burger.setTomato(tomato);

        System.out.println("Do you need to add lettuce(10$)(Press true to add,else false)");
        boolean lettuce=scan.nextBoolean();
        burger.setLettuce(lettuce);
        System.out.println();
        System.out.println("Grand Total:"+burger.getPrice());

        System.out.println("Have a great day, Thanks for coming");

    }
    public static HamBurger burger_call(int burger_number){
        switch(burger_number){
            case 1:
                return new HamBurger(bread_roll_type(),meat_type(),40);

            case 2:
                return new HealthyBurger(meat_type());

            case 3:
                return new DeluxeBurger(bread_roll_type(),meat_type());

            default:
                System.out.println("Invalid Burger Type");
                return null;
        }
    }
    public static String  bread_roll_type(){
        System.out.println("Enter bread roll type \n1.wheat_bread 2.brown_rye_bread 3.whole_grain_bread");
        int bread_type_num=scan.nextInt();
        if(bread_type_num==1){
            return "wheat_bread";
        }
        else if(bread_type_num==2){
            return "brown_rye_bread";
        }
        else if(bread_type_num==3){
            return "whole_grain_bread";
        }
        else{
            System.out.println("Invalid bread type,so default bread type wheat_bread is selected");
            return "wheat_bread";
        }
    }
    public static String meat_type(){
        System.out.println("Enter meat type\n1.Chicken 2.Mutton");
        int meat_num=scan.nextInt();
        if(meat_num==1){
            return "Chicken";
        }
        else if(meat_num==2){
            return "mutton";
        }
        else{
            System.out.println("Invalid meat type,so default type chicken is selected");
            return "chicken";
        }
    }
}
