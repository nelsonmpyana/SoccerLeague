/*
* Name: Nelson Mpyana
* Project: League Project
* Version: 1.0
* Company: SPAN DIGITAL
* */

package com.NelsonSpan;

import java.util.Vector;
import java.util.Collections;

public class League {

    Vector<Team> teams;

    String [] list1 = {"AR Arad", "BR Braila", "CR Craiova", "DR Drobeta"};
    String [] list2 = {"ES Escandov", "FO Foscani", "GR Gronstadt", "HE Hermansburg"};

    public League() {
        teams = new Vector<Team>();
    }// end constructor League()

    public void setupDiv1 () {
        for (int i=0; i<list1.length; i++) {
            String code = list1[i].substring(0,2);
            String name = list1[i].substring(3);
            addTeam(1, code, name);
        } //end for i
    }// end method setupDiv1 ()


    public void setupDiv2 () {
        for (int i=0; i<list2.length; i++) {
            String code = list2[i].substring(0,2);
            String name = list2[i].substring(3);
            addTeam(2, code, name);
        } //end for i
    }// end method setupDiv2 ()


    public void addTeam (int division, String code, String name) {
        Team aTeam = new Team(division, code, name);
        teams.add(aTeam);
    }// end method addTeam()

    public Team findTeam(String code) {
        Team aTeam = null;
        for (int i=0; i<teams.size(); i++) {
            aTeam = teams.get(i);
            if (aTeam.code.equals (code))break;
        }// end for i
        return aTeam;
    }//end method findTeam()

    public void testFindTeam(String code) {
        Team aTeam = findTeam(code);
        System.out.println("Found Team = "+aTeam.name);
    }//end method findTeam()


    public void addResult(String results){
        String hCode = "AR";
        String aCode = "BR";
        int hScore = 4;
        int aScore = 5;

        Team homeTeam = this.findTeam(hCode);
        homeTeam.addHomeResult(hScore,aScore);

        Team awayTeam = this.findTeam(aCode);
        awayTeam.addAwayResult(hScore,aScore);
    }//end method addResult() 

    public void print() {
        for (Team aTeam: teams) {
            aTeam.print();
        }// end forall teams
    }// end method print()

}// end class League
 
 