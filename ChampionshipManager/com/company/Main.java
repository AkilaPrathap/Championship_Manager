package com.company;


public class Main {


    public static void main(String[] args) {
        File_Writer.createfile();
                // reading the data in the file to continue the season
        File_Writer.read();
            // runs the GUI
        ChampionshipManager.GUI();
            // runs the rest of the code
        Formula1ChampionshipManager.input();

    }



}


