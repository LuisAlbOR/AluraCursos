package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase se crea para ser la el frame de la pantalla de bienvenida del aplicativo
 * además, se extiende de JFrame para que la propia clase configure la estructura del frame,
 * dicha estructura se hará de acuerdo a los requisitos pedidos
 *
 * @author Luis Alberto Ortiz Rodríguez
 * @deprecated No
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class WelcomeScreen extends JFrame implements ActionListener {

    /**
     * Estos objetos se usan para dar forma y diseño a la ventana de acuerdo a los requerimientos
     */
    private JLabel logoAppImage, logoAppTitle;
    private JButton enterButton;

    /**
     * Se crea el constructor y se inicializa el frame en cero, para así personalizarlo
     * de acuerdo a los requisitos
     */
    public WelcomeScreen(){
        createWindow();
    }

    public void createWindow(){
        setLayout(null);

        //Aplication background
        getContentPane().setBackground(new Color(77, 121, 225));

        ImageIcon imageApp = new ImageIcon(getClass().getResource("/resources/logoApp.png"));
        logoAppImage = new JLabel(imageApp);
        logoAppImage.setBounds(116,40,256,256);
        add(logoAppImage);

        logoAppTitle = new JLabel("Master Exchange");
        logoAppTitle.setBounds(100,350,300,30);
        logoAppTitle.setFont(new Font("Verdana",3,30));
        logoAppTitle.setForeground(new Color(255,255,255));
        add(logoAppTitle);

        enterButton = new JButton("Press to enter");
        enterButton.setBounds(140,420,200,30);
        enterButton.setBackground(new Color(97, 175, 79));
        enterButton.setFont(new Font("Verdana",3,20));
        enterButton.setForeground(new Color(255,255,255));
        enterButton.addActionListener(this);
        add(enterButton);
    }

    /**
     * @param enterButtonAction: este parámetro es para manipular la accion
     * del boton para poder acceder al aplicativo.
     */
    @Override
    public void actionPerformed(ActionEvent enterButtonAction) {
        if(enterButtonAction.getSource() == enterButton) {
            this.setVisible(false);
            MenuScreen menuScreen = new MenuScreen();
        }
    }
}
