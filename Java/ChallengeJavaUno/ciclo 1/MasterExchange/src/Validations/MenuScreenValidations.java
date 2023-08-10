package Validations;

/**
 * Esta clase es para validar las entradas y salidas de la vista 'MenuScreen', además
 * de manejar las excepciones indicadas en el caso de uso
 * (ChallengeJavaUno\ciclo 1\Testing).
 */
public class MenuScreenValidations {

    /**
     *
     * @param optionSelected
     * @return
     */
    public boolean optionValidation(String optionSelected){
        return optionSelected == null;
    }
}
