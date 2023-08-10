import javax.swing.*;
import java.awt.*;

public class probandoVentanas {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Eggs are not supposed to be green.");
        JOptionPane.showMessageDialog(null, "Tipo mensaje", "Titulo de tipo  mensaje", JOptionPane.WARNING_MESSAGE);
        System.out.println("Hello world!");

        probandoVentanas output = new probandoVentanas();
        output.crearMarco();
        output.ventanaPersonalizada();
    }

    public void crearMarco(){
        //1. Create the frame.
        JFrame frame = new JFrame("FrameDemo");

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
        frame.getContentPane().add(new JLabel("Texto para rellenar"),BorderLayout.CENTER);

        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);

        //6. Window center
        frame.setLocationRelativeTo(null);
    }

    public void ventanaPersonalizada(){
        //Ask for window decorations provided by the look and feel.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create the frame.
        JFrame frame = new JFrame("A window");

        //Set the frame icon to an image loaded from a file.
        frame.setIconImage(new ImageIcon(getClass().getResource("resources/logoApp.png")).getImage());


        // Set the dimensions of the frame.
        frame.setSize(800, 600);

        // Specify what happens when the frame is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible.
        frame.setVisible(true);
    }
}