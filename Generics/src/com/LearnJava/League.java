package com.LearnJava;

import java.util.ArrayList;


public class League<T extends Team> {
    private String name;


    ArrayList<T> teams=new ArrayList<>();
    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team){
        if(teams.contains(team)){
            System.out.println("Already Present");
        }
        else {
            teams.add(team);
        }
    }

    public void calculate_total_pts(){
        for(int i=0;i<teams.size()-1;i++) {
            teams.get(i).total_pts += (teams.get(i).won * 2) + teams.get(i).tie;
        }
    }

    public void pointsTable(){
        calculate_total_pts();
        for(int i=0;i<teams.size()-1;i++){
            for(int j=i+1;j<teams.size();j++) {
                if (teams.get(i).total_pts < teams.get(i).total_pts) {
                    T temp = teams.get(i);
                    teams.set(i, teams.get(j));
                    teams.set(i,temp);
                }
            }
        }

    }
    public void printTable(){
        pointsTable();
        for(int i=0;i<teams.size()-1;i++) {
            System.out.println(teams.get(i).getName()+" in the position "+(i+1)+" with points "+teams.get(i).total_pts);
        }
    }
}
