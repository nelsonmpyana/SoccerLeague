package com.NelsonSpan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String [] arg) {
        //                   "012345678910" alignment guide
        String [] results;
//        = {"AR  4 BR  5",
//                "CR  0 DR  1",
//                "AR 10 CR  9",
//                "BR  3 DR  1",
//                "AR  0 DR  2",
//                "BR  2 AR  2",
//                "BR  0 CR  5",
//                "CR  1 BR  3",
//                "CR  4 AR  2",
//                "DR  1 AR  1",
//                "DR  2 BR  1",
//                "DR  0 CR  2",
//
//                "ES  2 FO  2",
//                "GR  0 HE  0",
//                "FO  1 GR  2",
//                "HE  3 ES  5",
//                "ES  4 GR  3",
//                "ES  0 HE  2",
//                "GR  1 FO  3",
//                "GR  2 ES  1",
//                "FO  2 HE  1",
//                "FO  3 ES  3",
//                "HE  1 FO  0",
//                "HE  2 GR  1"};

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of teams:");
        int length = s.nextInt();
        results = new String[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            results[i] = s.next();
        }

        System.out.println(Arrays.toString(results));


        League myLeague = new League();
        myLeague.setupDiv1();
        myLeague.setupDiv2();
        for(String r: results){
            myLeague.addResult(r);
        }// end for each r

        myLeague.print();
        //myLeague.testFindTeam("DR");


    } //end method main ()
}
