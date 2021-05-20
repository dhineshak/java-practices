package com.LearnJava;

import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static MobilePhone obj=new MobilePhone();
    public static void main(String[] args) {
        System.out.println("                                         Contacts Application \n");
        printActions();
        System.out.println("Choose your action: ");
        int number=1;
        while(number!=0){
            number=scan.nextInt();
            scan.nextLine();
            if(number==0){
                System.out.println("Contacts Application turned off");
                System.exit(0);
            }
            else if(number==1){
                obj.printContacts();
            }
            else if(number==2){
                System.out.println("Enter new name : ");
                String name=scan.nextLine();
                System.out.println("Enter new Mob_number : ");
                String mob_number=scan.nextLine();
                obj.addContact(name,mob_number);
            }
            else if(number==3){
                System.out.println("Enter name to edit : ");
                String name=scan.nextLine();
                int position=obj.indexOfContact(name);
                if(position>-1){
                    System.out.println("Enter new name : ");
                    String newname=scan.nextLine();
                    System.out.println("Enter new number : ");
                    String newMob_numnber=scan.nextLine();
                    obj.updateExistingContact(newname,newMob_numnber,position);
                }
                else{
                    System.out.println("Contact not Found");
                }
            }
            else if(number==4){
                System.out.println("Enter name to remove : ");
                String name=scan.nextLine();
                obj.removeContact(name);
            }
            else if(number==5){
                System.out.println("Enter name to check : ");
                String name=scan.nextLine();
                int position=obj.indexOfContact(name);
                if(position>=0){
                    Contacts checking=obj.togetContact(position);
                    System.out.println("Contact Found -> name : "+checking.getName()+"  Mob_number : "+ checking.getMob_number() );
                }
                else{
                    System.out.println("Contact not Found");
                }
            }
            else if(number==6){
                printActions();
            }
            System.out.println("Choose your Action : ");
        }
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to exit Application\n" + "1  - to print all contacts\n" + "2  - to add a new contact\n" +
                "3  - to edit contact\n" + "4  - to remove an contact\n" + "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
    }
}
