package Validations;

import javax.swing.*;

import static java.util.Objects.isNull;

/**
 * Esta clase es para validar las entradas y salidas de la vista 'MenuScreen', además
 * de manejar las excepciones indicadas en el caso de uso
 * (ChallengeJavaUno\ciclo 1\Testing).
 */
public class MenuScreenValidations {

    /**
     * @param optionSelected : opción seleccionada en el modal, se verifica de diferentes maneras de
     *                         acuerdo a las validaciones en el caso de uso
     */
    public void optionValidation(String optionSelected){
        if(isNull(optionSelected)){
            System.out.println("salida exitosa");
            exitConfirm();
        } else {
            System.out.println("salida no exitosa");
            exitConfirm();
        }
    }

    public boolean isNull(String optionSelected){
        return optionSelected == null;
    }

    public void exitConfirm(){
        exitDialog();
        System.exit(0);
    }

    public void exitDialog(){
        JOptionPane.showMessageDialog(null,"Gracias por usar la aplicacion");
    }

    //Verificar un grupo de excepciones para abtraer dichas excepciones
}
