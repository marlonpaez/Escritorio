package clases;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Inicial conexionInicial = new Inicial();
        conexionInicial.setLayout(null);
        conexionInicial.setBounds(0, 0, 900, 700);
        conexionInicial.setLocationRelativeTo(null);
        conexionInicial.setResizable(false);
        conexionInicial.setTitle("Water Saturation Pressures and Temperatures");
        conexionInicial.getContentPane().setBackground(new Color(235, 255, 254));
        conexionInicial.setVisible(true);

    }

}
