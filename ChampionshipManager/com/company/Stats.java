package com.company;
import java.util.*;
/*
*Used to add stats to each driver in the race
 */

public class Stats {
            // points awarded for each placing first to last (1st to 10th)
    public static Integer [] points = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
            // placings in race
    public static Integer [] place = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            //store total number of races participated in the season
    public static Integer [] noracesparticipated = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            // place obtained by each driver in the most resent race
    public static int []Plces = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};// all should be 0
            //total points earned by each driver in the current season
    public static Integer[] TotalSeasonPoints = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            // count number of first paces
    public static int [] nofirstplaces = {0,0,0,0,0,0,0,0,0,0};
            // calculate number of points obtained in the resent race
    public static Integer[] totalpoints;
            // Date the race was finished
    public static String [] Date = new String[20];



    public static void Formula1Driver(String [] Name) {
                // VIEW STATS OF DRIVERS
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the name of diver you want to view stats of");
        String Name1 = name.next();
        for (int i = 0;i<Name.length;i++){
           if (Name[i].toUpperCase().equals(Name1.toUpperCase())){
               System.out.println("Driver "+Name[i]+" participated in "+noracesparticipated[1]+" and has a total sum of points "+TotalSeasonPoints[i]
                       +" Including "+nofirstplaces[i]+" first places \n");
               break;
           }
            System.out.println("no such driver found");
        }

    }
    public static int[] addstats(String [] Name, String[] Team){
                //ADD STATS OF DIVERS
        Scanner places = new Scanner(System.in);
        int x = 0;
        for (int i = 0;i<Name.length;i++){
            if (Name[i] == "e"){
                x++;
                continue;
            }
            else{
                for (int j = 0;j<Plces.length;j++){
                    System.out.println("Enter the place of driver "+Name[i]+" From team "+Team[i]);

                    int place = places.nextInt();
                    if (place ==1){
                        nofirstplaces[i] = nofirstplaces[i]+1;
                    }
                    Plces[x]=place;
                    noracesparticipated[x]+=1;
                    TotalSeasonPoints[x] = TotalSeasonPoints[x]+points[(Plces[x]-1)];
                    x++;
                    break;
                }


            }
        }
        // adding the date a race wa finished
        for (int i= 0;i<Date.length;i++){
            if (Date[i]==null){
                System.out.println("RACE CONDUCTED DATE REQUIRED \n 1.. to add manuel date \n 2.. to automtically add system date");
                Scanner choice1 = new Scanner(System.in);
                int choice = choice1.nextInt();
                if (choice == 1){
                    Scanner date = new Scanner(System.in);
                    System.out.println("Enter the date race was conducted");
                    Date[i]= date.next();
                    break;
                }
                else if (choice == 2){
                    Date[i]= String.valueOf(java.time.LocalDate.now());
                    System.out.println("Your system date " +java.time.LocalDate.now()
                            + " has been added as the date the was conducted ");
                    break;
                }
            }
            else {continue;}
        }
        return Plces;
    }
    public static void date(){
        int count = 0;
        for (int i=0;i<Date.length;i++){
            if (Date[i]==null){
                count = count+1;
                continue;
            }

            else {
                System.out.println("Race "+(i+1)+" was held on "+Date[i]);
            }


        }
        if (count==20){
            System.out.println("No races have been held yet ");
        }
    }
    public static Integer[] totrace(){
                //calculate total number of races participated by ech driver
        for (int i= 0; i< place.length;i++){
            noracesparticipated[i]++;
        }
        return noracesparticipated;
    }
    public static int[] no1st(int i){
        nofirstplaces[i-1] = nofirstplaces[i-1]+1;
        return nofirstplaces;
    }
    public static Integer[] totalSeasonPoints(int i, int totpoints){
        TotalSeasonPoints[i-1] = TotalSeasonPoints[i-1]+totpoints;
        return TotalSeasonPoints;
    }
    public static int []Places(int i,int placing){
        Plces[i-1]=placing;
        return Plces;
    }
    public static void addDate(){
        for (int i=0;i< Date.length;i++){
            if (Date[i]==null){
                String.valueOf(java.time.LocalDate.now());
            }
        }
    }
    public static void driverstats (String[] Name,String Name1){
        // VIEW STATS OF DRIVERS
        for (int i = 0;i<Name.length;i++){
            if (Name[i].toUpperCase().equals(Name1.toUpperCase())){
                System.out.println("Driver "+Name[i]+" participated in "+noracesparticipated[1]+" and has a total sum of points "+TotalSeasonPoints[i]
                        +" Including "+nofirstplaces[i]+" first places \n");
                break;
            }
            System.out.println("no such driver found");
        }
    }

}




