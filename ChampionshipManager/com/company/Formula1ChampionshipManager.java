package com.company;
import com.company.*;
import javax.lang.model.element.Name;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatException;
import java.util.*;

public class Formula1ChampionshipManager implements ChampionshipManager {
    public static String[] Name ={"e", "e", "e", "e", "e", "e", "e", "e", "e", "e"};
    public static Integer[] Location = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static String[] Team = {"e", "e", "e", "e", "e", "e", "e", "e", "e", "e"};


    public static void input() {
        // ARRAYS TO HOLD NAME, LOCATION ND THE TEAM OF EACH DRIVER

        // LOOP STARTING FOR USER INPUTS
        // INFINITE LOOP
        // 33 TO EXIT THE LOOP
        while (true) {
            System.out.println("1.. To enter a new contestant");
            System.out.println("2.. Delete a contestant");
            System.out.println("3..Change the driver for an existing team");
            System.out.println("4..view Stats");
            System.out.println("5..Add Stats");
            System.out.println("6..view Stats of specific driver");
            System.out.println("7..view dates the races was conducted");
            System.out.println("00..view all contestants");
            System.out.println("33..To EXIT");
            Scanner choice1 = new Scanner(System.in);
            int choice = choice1.nextInt();

            if (choice == 1) {
                // ADD A NEW RACER TO THE POOL
                Scanner name = new Scanner(System.in);
                System.out.println("enter the name of the new racer");
                String Name1 = name.next();
                Name = Driver.name(Name1, Name);
                Scanner team = new Scanner(System.in);
                String Team1 = new String();
                System.out.println("Enter the racers team ");
                Team1 = team.next();
                Team = Driver.team(Team1, Team);


            } else if (choice == 2) {
                // DELETE A RACER FOR THE POOL
                System.out.println("Enter the name of the driver that leaves the race ");
                Scanner nme = new Scanner(System.in);
                String name = nme.next();
                Name=Driver.delete(name, Name, Team);
                Team=Driver.delete1(name, Name, Team);

            }
            else if (choice==3){
                // EDIT THE DRIVER OF A TEAM
                System.out.println("Enter the name of the changing driver's team");
                Scanner name=new Scanner(System.in);
                String tname=name.next();
                Name=Driver.edit(tname,Name, Team, Location);
            }
            else if(choice==4 ) {
                Table.simpleTable(Name);
                System.out.println("Organized  TABLE\n");
                Table.orgnizedTable(Name);
                System.out.println("Organized table by most first plaaces \n");
                Table.orgnizedTable1(Name);
            }
            else if (choice==5){
                Stats.addstats(Name,Team);
            }
            else if (choice==6){
                Stats.Formula1Driver(Name);// view statics of specific driver
            }
            else if (choice==7){
                Stats.date();
            }
            else if (choice == 00) {
                // VIEW ALL THE DRIVERS IN THE RACE
                Driver.viewall(Name, Team, Location);
            }
            else if (choice==33){
                        // Writing the all the data to a file while closing
                File_Writer.write();
                        // EXIT THE LOOP ONCE ALL THE CHANGES ARE DONE
                break;
            }

        }

    }
    public static void table(){
        Table.simpleTable(Name);
    }
    public static void ordtable(){
        Table.orgnizedTable(Name);
    }

}






