package com.LearnJava;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    static Contacts obj=new Contacts();
    private ArrayList<Contacts> contact;

    public MobilePhone() {
        this.contact = new ArrayList<Contacts>();
    }

    public void printContacts(){
        for (int i=0;i<contact.size();i++){
            System.out.println("Name : "+contact.get(i).getName()+"  Mob_number : "+contact.get(i).getMob_number());
        }
        if(contact.size()==0){
            System.out.println("No contact Found");
        }
    }
    public void addContact(String name,String mob_number){
        if(ContactFound(name,mob_number)){
            System.out.println("Contact Found Already");
        }
        else{
            Contacts newContact=new Contacts(name,mob_number);
            contact.add(newContact);
            System.out.println("Contact Added");
        }
    }

    public void removeContact(String name){
        if(indexOfContact(name)>-1){
            contact.remove(indexOfContact(name));
            System.out.println("Contact Deleted");
        }
        else{
            System.out.println("No contact found in the name : "+name);
        }
    }
    public void updateExistingContact(String name,String mob_num,int position){
        int position2=indexOfContact(name);
            if(position2<0) {
                contact.set(position,new Contacts(name, mob_num));
                System.out.println("Contact Updated Successfully");
            }
            else{
                System.out.println("New Contact name already exists");
            }
    }
    public boolean ContactFound(String name,String mob_number){
        Contacts newContact=new Contacts(name,mob_number);
        if(contact.indexOf(newContact)>-1){
                return true;
            }
        return false;
    }

    public int indexOfContact(String name){
        for (int i=0;i<contact.size();i++){
            if(contact.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public Contacts togetContact(int position){
        return contact.get(position);
    }
}

