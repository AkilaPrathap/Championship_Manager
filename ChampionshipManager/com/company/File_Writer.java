package com.company;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
public class File_Writer {

        /*
          *Code refered from
          * https://www.w3schools.com/java/java_files_read.asp
         */

    public static void createfile(){
        try {
            File myObj = new File("Formula_1_Data.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    /*
    Formula1ChampionshipManager.Name[i]+" is from team "
                        +Formula1ChampionshipManager.Team[i]+" is in location "
                        +Formula1ChampionshipManager.Location[i] +"\n"
     */

    public static void write (){
        try {
            FileWriter myWriter = new FileWriter("Formula_1_Data.txt");
            myWriter.write("Name \n");
            myWriter.write(Arrays.toString(Formula1ChampionshipManager.Name));
            myWriter.write(" \nTeam \n");
            myWriter.write(Arrays.toString(Formula1ChampionshipManager.Team));
            myWriter.write("\nLocation \n");
            //myWriter.write(Arrays.toString(Formula1ChampionshipManager.Location));
            for (int i=0;i<10;i++){
                myWriter.write(String.valueOf(Formula1ChampionshipManager.Location[i]+","));
            }
            myWriter.write(" \nTotalSeasonPoints \n");
            //myWriter.write(Arrays.toString(Stats.TotalSeasonPoints));
            for (int i=0;i<10;i++){
                myWriter.write(String.valueOf(Stats.TotalSeasonPoints[i]+","));
            }
            myWriter.write("\nnofirstplaces \n");
            //myWriter.write(Arrays.toString(Stats.nofirstplaces));
            for (int i=0;i<10;i++){
                myWriter.write(String.valueOf(Stats.nofirstplaces[i]+","));
            }
            myWriter.write("\nnoracesparticipated \n");
            //myWriter.write(Arrays.toString(Stats.noracesparticipated));
            for (int i=0;i<10;i++){
                myWriter.write(String.valueOf(Stats.noracesparticipated[i]+","));
            }
            myWriter.write("\nDate \n");
            myWriter.write(Arrays.toString(Stats.Date));

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void read(){
        try {
            File myObj = new File("Formula_1_Data.txt");
            Scanner myReader = new Scanner(myObj);
            String[] data = new String[30];
            for (int i = 0; myReader.hasNextLine(); i++) {
                data[i]= myReader.nextLine();
            }

/*

            for (int i = 0; i < data.length;i++) {
                if (i==2){
                    int x =0;
                    while ( x<10){
                        Formula1ChampionshipManager.Name[x] = data[i];
                        x++;
                    }
                }
                if (i==4){
                    int x =0;
                    while ( x<10){
                        Formula1ChampionshipManager.Team[x] = data[i];
                        x++;
                    }
                }

                if (i==6) {
                    String[] num = data[i-1].split(",");

                    int x =0;
                    while ( x<10){
                        Formula1ChampionshipManager.Location[x] = Integer.valueOf(num[x]);
                        x++;
                    }
                }

                if (i==8){
                    String[] num = data[i-1].split(",");

                    int x =0;
                    while ( x<10){
                        Stats.TotalSeasonPoints[x] = Integer.valueOf(num[x]);
                        x++;
                    }
                }
                if (i==10){
                    String[] num = data[i-1].split(",");

                    int x =0;
                    while ( x<10){
                        Stats.nofirstplaces[x] = Integer.valueOf(num[x]);
                        x++;
                    }
                }
                if (i==12){
                    String[] num = data[i-1].split(",");

                    int x =0;
                    while ( x<10){
                        Stats.noracesparticipated[x] = Integer.valueOf(num[x]);
                        x++;
                    }
                }
                if (i==14){
                    int x =0;
                    while ( x<10){
                        Stats.Date[x] = String.valueOf(data[i]);
                        x++;
                    }
                }
                }
*/


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
