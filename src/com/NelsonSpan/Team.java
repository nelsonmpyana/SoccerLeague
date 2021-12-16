package com.NelsonSpan;


import java.util.Vector;
import java.util.Collections;


import java.util.Collections;
import java.util.Comparator;

public class Team implements Comparable <Team>  {

    //use different variable to compare the teams
    int division;
    String name;
    String code;
    int points;
    int played;
    int scored;
    int conceded;
    //goal difference for incase the teams are of the same #points
    int difference;

    public int compareTo(Team aTeam){

        return 0;
    }//end method compareTo()

    public Team(int division, String code, String name) {
        this.division = division;
        this.code = code;
        this.name = name;
    }// end constructor Team(code, name)

    public void addResult(int home, int away) {
// home and away are goals score by home and away teams in a match
    }// end method addResult()

    public void addHomeResult(int home, int away) {
        if (home==away) points = points + 1;  // Draw
        if (home > away) points = points + 2; // Home Win
//if (home < away) points = points + 3; // Away Win
        played++;
        scored = scored + home;
        conceded = conceded + away;
        difference = scored - conceded;
    }// end method addHomeResult()

    public void addAwayResult(int home, int away) {
        if (home==away) points = points + 1;  // Draw
//if (home > away) points = points + 2; // Home Win
        if (home < away) points = points + 3; // Away Win
        played++;
        scored = scored + home;
        conceded = conceded + away;
        difference = scored - conceded;
    }// end method addAwayResult()

    public void print() {
        System.out.println("DIV"+"\t"+"CODE"+"\t"+"POINTS"+"\t"+"PLAYED"+"\t"+"SCORED"+"\t"+"CONC"+"\t"+"DIFF");
        System.out.println(division+"\t"+code+"\t"+points+"\t"+played+"\t"+scored+"\t"+conceded+"\t"+difference+"\t");
    } //end method print()

}// end class Team

