package View;

import javax.swing.*;

public class MenuScreen {

    public MenuScreen(){
        MenuOptions();
    }

    public void MenuOptions(){
        //Opciones que se muestran al usuario en el JOptionPane
        String[] optionsList = {"Conversor de divisas","Conversor de temperatura"};

        //Mostramos el cuadro  de dialogo con las opciones y se guarda la opción seleccionada
        String optionSelected = String.valueOf(JOptionPane.showInputDialog(
                null,
                "Por favor, seleccione una opcion",
                "Menu de opciones",
                JOptionPane.PLAIN_MESSAGE,
                null,
                optionsList,
                optionsList[0]
                ));
    }
}
