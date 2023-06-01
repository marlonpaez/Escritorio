package combustion;

import java.awt.*;

public class Ejecucion {

    public static void main(String[] args) {

        Balance initialwindow = new Balance();
        initialwindow.setLayout(null);
        initialwindow.setBounds(0, 0, 1100, 700);
        initialwindow.setLocationRelativeTo(null);
        initialwindow.setVisible(true);
        initialwindow.setResizable(false);
        initialwindow.getContentPane().setBackground(new Color(241, 241, 241));
        initialwindow.setTitle("Mass Balance Chemical Equation Combustion Hydrocarbon");

    }

}
