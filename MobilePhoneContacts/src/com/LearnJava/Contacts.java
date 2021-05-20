package com.LearnJava;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String mob_number;

    public Contacts(){

    }

    public String getName() {
        return name;
    }

    public String getMob_number() {
        return mob_number;
    }

    public Contacts(String name, String mob_number) {
        this.name = name;
        this.mob_number = mob_number;
    }

}
