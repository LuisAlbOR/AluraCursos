public class TestCuentaExceptionChecked {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        try {
            cuenta. depositar();
        } catch (MiException e) {
            System.out.println("atrapado");
        }

    }
}
