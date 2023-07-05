package com.company;
import java.awt.*;
import java.util.*;
import java.util.stream.*;



/*
*prints all the stats in a tabular format
*       name, total number of races, points ect..
* CODE REFERED FROM
*https://itsallbinary.com/java-printing-to-console-in-table-format-simple-code-with-flexible-width-left-align-header-separator-line/
*/
public class Table {

    public static void simpleTable(String[] Name) {

        /*
         * leftJustifiedRows - If true, it will add "-" as a flag to format string to
         * make it left justified. Otherwise right justified.
         */
        boolean leftJustifiedRows = false;
        Integer[] noracesparticipated = Stats.noracesparticipated;
        int[] totalpoints = new int[10];
        int[] Plces = Stats.Plces;
        Integer[] points = Stats.points;
        Integer [] TotalSeasonPoints = Stats.TotalSeasonPoints;
        int[] num = Stats.nofirstplaces;

        /*
         * Table to print in console in 2-dimensional array. Each sub-array is a row.
         */

        String[][] table = new String[11][];
        table[0] = new String[]{"Name", "Total Races", "Pacing last race","Points from last race", "Total Season Points","Total number of first places"};
        for (int i = 0; i < Name.length; i++) {
            if (Name[i] == "e") {
                table[i + 1] = new String[]{" - ", " - ", " - ", " - "," - ","-"};
            } else {
                table[i + 1] = new String[]{Name[i], String.valueOf(noracesparticipated[i]), String.valueOf(points[(Plces[i]-1)]),
                        String.valueOf(totalpoints[i]), String.valueOf(TotalSeasonPoints[i]), String.valueOf(num[i])};
            }
        }


        /*
         * Calculate appropriate Length of each column by looking at width of data in
         * each column.
         *
         * Map columnLengths is <column_number, column_length>
         */
        Map<Integer, Integer> columnLengths = new HashMap<>();
        Arrays.stream(table).forEach(a -> Stream.iterate(0, (i -> i < a.length), (i -> ++i)).forEach(i -> {
            if (columnLengths.get(i) == null) {
                columnLengths.put(i, 0);
            }
            if (columnLengths.get(i) < a[i].length()) {
                columnLengths.put(i, a[i].length());
            }
        }));

        /*
         * Prepare format String
         */
        final StringBuilder formatString = new StringBuilder("");
        String flag = leftJustifiedRows ? "-" : "";
        columnLengths.entrySet().stream().forEach(e -> formatString.append("| %" + flag + e.getValue() + "s "));
        formatString.append("|\n");

        /*
         * Print table
         */
        Stream.iterate(0, (i -> i < table.length), (i -> ++i))
                .forEach(a -> System.out.printf(formatString.toString(), table[a]));

    }


    public static void orgnizedTable(String[] Name) {
        boolean leftJustifiedRows = false;
        /*
         * leftJustifiedRows - If true, it will add "-" as a flag to format string to
         * make it left justified. Otherwise right justified.
         */


        String [] Name1 = Formula1ChampionshipManager.Name; //new String[10];
        Integer[] noracesparticipated = Stats.noracesparticipated;
        int [] Places = Stats.Plces;
        Integer [] points = Stats.points;
        Integer [] TotalSeasonPoints = Stats.TotalSeasonPoints;
        Integer [] totalSeasonPoints = Stats.TotalSeasonPoints;
        int [] nofirstplaces = Stats.nofirstplaces;
        int [] num = new int[10];
        int count = 0;

                // Ordering total points obtained by each driver
                // in ascending order
       for (int i=0;i<Name1.length;i++){
           for (int x=i+1;x<Name1.length;x++){
               int temp = 0;
               String temp1 = "";

               if (TotalSeasonPoints[i]>TotalSeasonPoints[x]){
                   temp = TotalSeasonPoints[i];
                   TotalSeasonPoints[i] = TotalSeasonPoints[x];
                   TotalSeasonPoints[x] = temp;

                   temp1 = Name1[i];
                   Name1[i]=Name1[x];
                   Name1[x] = temp1;

                   temp=Places[i];
                   Places[i] = Places[x];
                   Places[x] = temp;

                   temp=noracesparticipated[i];
                   noracesparticipated[i]= noracesparticipated[x];
                   noracesparticipated[x]=temp;

                   temp = nofirstplaces[i];
                   nofirstplaces[i] = nofirstplaces[x];
                   nofirstplaces[x] = temp;
               }
           }
       }


        /*
         * Table to print in console in 2-dimensional array. Each sub-array is a row.
         */

        final Object[][] table = new String[11][];
        table[0] = new String[]{"Name","|","Total Races","|", "Pacing last race","|",
                "Points from last race","|", "Total Season Points","|","Total number of first places"};


        for(int i = 0 ; i <Name.length;i++) {
            if (Name[i] == "e") {
            table[i + 1] = new String[]{" - ","|", " - ","|", " - ","|", "-","|", "-","|", "-"};
        }
        else {
            table[i + 1] = new String[]{Name1[i],"|", String.valueOf(noracesparticipated[i]),"|", String.valueOf(Places[i]),
                    "|",String.valueOf(points[(Places[i]-1)]),"|",String.valueOf(TotalSeasonPoints[i]),"|", String.valueOf(nofirstplaces[i])};
        }
        }

        for (final Object[] row : table) {
            System.out.format("%-15s%2s%20s%2s%20s%2s%25s%2s%25s%2s%20s%n", row);

        }

    }

    public static void orgnizedTable1(String[] Name) {
        boolean leftJustifiedRows = false;
        /*
         * leftJustifiedRows - If true, it will add "-" as a flag to format string to
         * make it left justified. Otherwise right justified.
         */


        String [] Name1 = Formula1ChampionshipManager.Name; //new String[10];
        Integer[] noracesparticipated = Stats.noracesparticipated;
        int [] Places = Stats.Plces;
        Integer [] points = Stats.points;
        Integer [] TotalSeasonPoints = Stats.TotalSeasonPoints;
        Integer [] totalSeasonPoints = Stats.TotalSeasonPoints;
        int [] nofirstplaces = Stats.nofirstplaces;
        int [] num = new int[10];
        int count = 0;


                // Ordering the drivers with most wins
                // in descending order
        for (int i=0;i<Name1.length;i++){
            for (int x=i+1;x<Name1.length;x++){
                int temp = 0;
                String temp1 = "";

                if (nofirstplaces[i]<nofirstplaces[x]){
                    temp = nofirstplaces[i];
                    nofirstplaces[i] = nofirstplaces[x];
                    nofirstplaces[x] = temp;
                    temp = TotalSeasonPoints[i];
                    TotalSeasonPoints[i] = TotalSeasonPoints[x];
                    TotalSeasonPoints[x] = temp;

                    temp1 = Name1[i];
                    Name1[i]=Name1[x];
                    Name1[x] = temp1;

                    temp=Places[i];
                    Places[i] = Places[x];
                    Places[x] = temp;

                    temp=noracesparticipated[i];
                    noracesparticipated[i]= noracesparticipated[x];
                    noracesparticipated[x]=temp;


                }
            }
        }


        /*
         * Table to print in console in 2-dimensional array. Each sub-array is a row.
         */

        final Object[][] table = new String[11][];
        table[0] = new String[]{"Name","|","Total Races","|", "Pacing last race","|",
                "Points from last race","|", "Total Season Points","|","Total number of first places"};


        for(int i = 0 ; i <Name.length;i++) {
            if (Name[i] == "e") {
                table[i + 1] = new String[]{" - ","|", " - ","|", " - ","|", "-","|", "-","|", "-"};
            }
            else {
                table[i + 1] = new String[]{Name1[i],"|", String.valueOf(noracesparticipated[i]),"|", String.valueOf(Places[i]),
                        "|",String.valueOf(points[(Places[i]-1)]),"|",String.valueOf(TotalSeasonPoints[i]),"|", String.valueOf(nofirstplaces[i])};
            }
        }

        for (final Object[] row : table) {
            System.out.format("%-15s%2s%20s%2s%20s%2s%25s%2s%25s%2s%20s%n", row);

        }

    }


}
