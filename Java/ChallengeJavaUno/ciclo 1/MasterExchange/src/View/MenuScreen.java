package View;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class MenuScreen {

    public MenuScreen(){
        MenuOptions();
    }

    public void MenuOptions(){
        //Opciones que se muestran al usuario en el JOptionPane
        String[] optionsList = {"Selecione una opción","Conversor de divisas","Conversor de temperatura"};

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
        Validations(optionSelected);
        System.out.println(optionSelected);
    }

    public void Validations(String optionSelected) {
        Validations.MenuScreenValidations validations = new Validations.MenuScreenValidations();

        if(validations.optionValidation(optionSelected)){ exitQuestion(); }
        else {}
    }

    public void exitQuestion(){
        int optionExitQuestion = Integer.valueOf(JOptionPane.showConfirmDialog(null,"Estas seguro que desea salir"));
    }
}
