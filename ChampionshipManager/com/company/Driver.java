package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Driver {


    public static String[] name(String name,String[] Name ) {
        // TO ADD A NEW DRIVER
        int i = Name.length;
        for (int x=0;x<i;x++){
            if (Name[x].equals("e")){
                Name[x] = name;
                break;
            }

        }
        return Name;
    }



    public static Integer[] location( Integer[] Location) {
        // UPDATE THE LOCATION
        int i = Location.length;
        for (int x=0;x<i;x++){
            if (Location[x]==x){
                Location[x] = x;
            }
        }
        return Location;
    }

    public static String[] team(String team,String[] Team) {
        // ADD THE TEAM NAME OF THE DRIVER
        int i = Team.length;
        for (int x=0;x<i;x++){
            if (Team[x].equals("e")){
                Team[x] = team;
                break;
            }
        }
        return Team;
    }
    public static  String[] delete(String name, String[] Name ,String[] Team ) {
        // DELETE THE NAME OF A DRIVER FOR THE COMPETITORS LIST
        for (int x=0;x< Name.length;x++){
            if (Name[x].toUpperCase().equals(name.toUpperCase())){
                Name[x] = "e";
                System.out.println("Driver updated");

            }

        }

        return Name;
    }
    public static  String[] delete1(String name, String[] Name ,String[] Team ) {
        // DELETE THE TEAM OF THE DELETED DRIVER
        for (int x=0;x< Name.length;x++){
            if (Name[x].toUpperCase().equals(name.toUpperCase())){
                Team[x] = "e";
                System.out.println("Your diver has been deleated");
                break; // ENDING THE LOOP ONCE THE REQUIRED DRIVER IS FOUND

            }
            else{
                System.out.println("we couldn't find your driver ");
            }

        }

        return Team;
    }

    public static String[] edit(String tname,String[] Name ,String[] Team ,Integer[] Location){
        // TO EDIT THE NAME OF A EXISTING DRIVER
        for (int i =0;i< Team.length;i++){
            if (Team[i].toUpperCase().equals(tname.toUpperCase())){
                System.out.println("Is "+Name[i]+" the changing driver?"+" From team"+Team[i]);
                System.out.println("1.. to confirm" +"\n"+
                        "2.. to deni");// SECOND CONFIRMATION BEFORE UPDATING THE DRIVER IN CASE OF EMERGENCY
                Scanner choice1 = new Scanner(System.in);
                int choice = choice1.nextInt();
                if (choice==1){// DIRECT EDITION ONCE THE USER CONFIRMS
                    System.out.println("Enter the name of the new driver");
                    Scanner nme = new Scanner(System.in);
                    String name = nme.next();
                    Name[i]=name;
                    break;

                }
                else if (choice==2){// TAKING USER INPUT IF THE FIRST EDIT WAS NOT CORRECT
                    System.out.println("please re-check and  enter the name of the team");
                    Scanner name=new Scanner(System.in);
                    String ntname=name.next();
                    for (int j =0;j< Team.length;j++){
                        if (Team[j].toUpperCase().equals(ntname.toUpperCase())){
                            System.out.println("Is "+Name[j]+"the changing driver ?"+" From team"+Team[j]);
                            System.out.println("1.. to confirm");// USER CONFIRMATION BEFORE UPDATING
                            Scanner choice2 = new Scanner(System.in);
                            int choce = choice1.nextInt();
                            if (choce==1){
                                System.out.println("Enter the name of the new driver");
                                Scanner nme1 = new Scanner(System.in);
                                String name1 = nme1.next();
                                Name[j]=name1;
                                System.out.println("your newe driver "+name1+" has been aded to team "+Team[j]);
                                break;

                            }

                        }

                    }

                }
            }

        }

        return Name;
    }

    public static void viewall( String[] Name ,String[] Team ,Integer[] Location){
        // VIEW ALL THE EXISTING PARTICIPANTS
        for (int i=0;i<Name.length;i++){
            if (Name[i].equals("e")){
                System.out.println(Location[i]+" contestant location is empty");
            }
            else{
                System.out.println(Name[i]+" is from team "+Team[i]+" is in location "+Location[i]);
            }
        }
    }




}




