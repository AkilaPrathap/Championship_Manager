package com.company;
import javax.lang.model.element.Name;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* creates a GUI with 4 buttons
       * button 1 view stats of existing drivers
       * button 2 views ordered data table in ascending order of total points
       * button 3 views ordered dta in descending order of total first places
       * button 4 creates a random race and adds the stats to the main table 
 */

public interface ChampionshipManager {

    public static void GUI() {

         // BUTTON 1
        JButton button1 = new JButton("See driver stats table");
        button1.setSize(60,10);
        button1.setBackground(Color.lightGray);

        // PANEL 1 FOR BUTTON 1
        JPanel panel = new JPanel();
        panel.setSize(600,100);
        panel.getBaseline(600,100);
        panel.add(button1,BorderLayout.AFTER_LAST_LINE);

        //BUTTON 2
        JButton button2 = new JButton("View driver with highest number of Points");
        button2.setSize(60,10);
        button2.setBackground(Color.lightGray);

        //PANEL 2 FOR BUTTON 2
        JPanel panel1 = new JPanel();
        panel1.setSize(600,100);
        panel1.getBaseline(600,100);
        panel1.add(button2,BorderLayout.AFTER_LINE_ENDS);

        // BUTTON 3
        JButton button3 = new JButton("View driver with highest number of first places");
        button3.setSize(60,10);
        button3.setBackground(Color.lightGray);

        // PANEL FOR BUTTON 3
        JPanel panel2 = new JPanel();
        panel2.setSize(600,100);
        panel2.getBaseline(600,100);
        panel2.add(button3,BorderLayout.AFTER_LINE_ENDS);

        // BUTTON 4
        JButton button4 = new JButton("Crate a random race");
        button4.setSize(60,10);
        button4.setBackground(Color.lightGray);

        // PANEL FOR BUTTON 4
        JPanel panel4 = new JPanel();
        panel4.setSize(600,100);
        panel4.getBaseline(600,100);
        panel4.add(button4,BorderLayout.AFTER_LINE_ENDS);

        //Button 5
        JButton button5 = new JButton("view individual driver stats");
        button5.setSize(60,10);
        button5.setBackground(Color.lightGray);

        // pannel for button 5
        JPanel panel5 = new JPanel();
        panel5.setSize(600,100);
        panel5.getBaseline(600,100);
        panel5.add(button5,BorderLayout.AFTER_LINE_ENDS);




        // BOX TO ORDER ELEMENTS
        Box box = Box.createVerticalBox();
        box.add(panel);
        box.add(panel1);
        box.add(panel2);
        box.add(panel4);
        box.add(panel5);


        JFrame frame = new JFrame("Formula 1  GUI");
        frame.setBackground(Color.blue);
        frame.add(box);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

        class AddListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                Formula1ChampionshipManager.table();
                Stats.date();
            }
        }
        class AddListener2 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                Formula1ChampionshipManager.ordtable();
            }
        }
        class AddListener3 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
               Table.orgnizedTable1(Formula1ChampionshipManager.Name);
            }
        }
        class AddListener4 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                RandRace.Rand();
                Stats.totrace();
            }
        }
        class AddListener5 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI2();
            }
        }
        ActionListener listener = new AddListener();
        button1.addActionListener(listener);

        ActionListener listener1 = new AddListener2();
        button2.addActionListener(listener1);


        ActionListener listener3 = new AddListener3();
        button3.addActionListener(listener3);

        ActionListener listener4 = new AddListener4();
        button4.addActionListener(listener4);

        ActionListener listener5 = new AddListener5();
        button5.addActionListener(listener5);



    }
    public static void GUI2(){

        // BUTTON 1
        JButton button1 = new JButton("See driver stats table");
        button1.setSize(60,10);
        button1.setBackground(Color.lightGray);

        // PANEL 1 FOR BUTTON 1
        JPanel panel = new JPanel();
        panel.setSize(600,100);
        panel.getBaseline(600,100);
        panel.add(button1,BorderLayout.AFTER_LAST_LINE);

        JTextField tf = new JTextField();
        tf.setSize(600,100);


        Box box = Box.createVerticalBox();
        box.add(panel);
        box.add(tf);

        JFrame frame = new JFrame("Formula 1  GUI 2");
        frame.setBackground(Color.blue);
        frame.add(box);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

        class AddListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText();
                Stats.driverstats(Formula1ChampionshipManager.Name,name);
            }
    }
        ActionListener listener = new AddListener();
        button1.addActionListener(listener);

}
}
