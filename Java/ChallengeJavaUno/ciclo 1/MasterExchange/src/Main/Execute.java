package Main;

import View.WelcomeScreen;

import javax.swing.*;

public class Execute {
    public static void main(String[] args) {
        Execute main = new Execute();
        main.executeApp();
    }

    public void executeApp(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        WelcomeScreen welcomeScreen = new WelcomeScreen();

        //Propierties of window
        welcomeScreen.setBounds(0,0,500,600);
        welcomeScreen.setResizable(false);
        welcomeScreen.setLocationRelativeTo(null);
        welcomeScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        welcomeScreen.setVisible(true);
    }

}
