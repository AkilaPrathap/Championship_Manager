package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
/*
    * creates a random race and places ti the existing driver in the race
 */

public class RandRace {
            // duplicate of names from Formula1ChampionshipManager for the use of random race
    private static String [] Name = Formula1ChampionshipManager.Name;
            // duplicate of location from Formula1ChampionshipManager
    private static  Integer[] Location = Formula1ChampionshipManager.Location;
            // duplicate of teams from Formula1ChampionshipManager
    private static String [] Team = Formula1ChampionshipManager.Team;
            // duplicate of placings from stats (contains the places than can be obtained by a driver)
    private static Integer [] Placing = Stats.place;
            // duplicate of oints from stats (contains all the points awarsed for each plce)
    private static Integer [] points = Stats.points;


            // create a random race for existing drivers
    public static void Rand(){
        Collections.shuffle(Arrays.asList(Location));
        System.out.println("Random race stats \n \n");
        for (int i = 0; i< Location.length;i++){
                    //System.out.println(Location[i]);
            if (Placing[Location[i]-1]==1){
                        // pass the first driver to stats to incere total number of first places
                Stats.no1st(Placing[Location[i]-1]);
            }
                    // adding the points of the random race to total poits by each driver
            Stats.totalSeasonPoints(Placing[Location[i]-1],points[Location[i]-1]);
                    // passing the places obtained by each driver to main stats
            Stats.Places(Placing[Location[i]-1],Placing[Location[i]-1]);
                    // adding date the race was held
                        // system date will e added as no user inputs are taken
            Stats.addDate();
                    // displaying stats of drivers created randomly
            System.out.printf("%-15s %10s %5s %15s %5s %10s %n",Name[Location[i]-1]," placed ",Placing[Location[i]-1]," in the race and got "
                    ,points[Location[i]-1]," points ");


        }

    }


}
