package org.Snake;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Chiken");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new Gamefild());
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow mw = new MainWindow();

        }
    };

