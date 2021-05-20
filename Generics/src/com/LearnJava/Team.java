package com.LearnJava;

public class Team {
   private String name;
    int no_of_matches;
    int won;
    int lose;
    int tie;
    int total_pts;
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
