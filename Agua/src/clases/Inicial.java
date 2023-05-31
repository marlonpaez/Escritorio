package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicial extends JFrame implements ActionListener {

    // Botones de la ventana inicial
    protected JButton Ingresar;

    // Cajas de texto de la ventana inicial
    protected JTextField cajaNombre, cajaArea;

    public Inicial() {

        // Etiquetas de la ventana inicial

        JLabel Water, Subtitulo, Nombre, Area, Autor;

        Water = new JLabel("W A T E R");
        Water.setBounds(268, 100, 340, 50);
        Water.setFont(new Font("Bodoni MT", Font.BOLD, 70));
        add(Water);

        Subtitulo = new JLabel("Presiones y Temperaturas de Saturación del Agua");
        Subtitulo.setBounds(98, 200, 800, 35);
        Subtitulo.setFont(new Font("Arial", Font.PLAIN, 30));
        add(Subtitulo);

        Nombre = new JLabel("Ingrese su nombre:");
        Nombre.setBounds(345, 300, 300, 30);
        Nombre.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Nombre);

        Area = new JLabel("Ingrese el área de aplicación:");
        Area.setBounds(306, 395, 300, 30);
        Area.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Area);

        Autor = new JLabel("© 2022 Ingeniero Ambiental Marlon Alfredo Paez Gonzalez");
        Autor.setBounds(305, 600, 500, 30);
        Autor.setFont(new Font("Arial", Font.PLAIN, 10));
        add(Autor);

        // Cajas de texto de la ventana inicial

        cajaNombre = new JTextField();
        cajaNombre.setBounds(234, 350, 400, 30);
        add(cajaNombre);

        cajaArea = new JTextField();
        cajaArea.setBounds(234, 445, 400, 30);
        add(cajaArea);

        // Botones de la ventana inicial

        Ingresar = new JButton("Ingresar");
        Ingresar.setBounds(383, 500, 100, 30);
        Ingresar.addActionListener(this);
        add(Ingresar);

        // Evitar ejecuciones en segundo plano

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // variables estaticas que contienen el nombre del usuario y el area de aplicacion
    protected static String Nombre, Area;

    // Eventos

    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == Ingresar) {

            Nombre = cajaNombre.getText().trim();
            Area = cajaArea.getText().trim();

            if (Nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            } else if (Area.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar el área de aplicación.");
            } else {
                Terminos ventanaterminos = new Terminos();
                ventanaterminos.setLayout(null);
                ventanaterminos.getContentPane().setBackground(new Color(246, 246, 246));
                ventanaterminos.setBounds(0, 0, 900, 700);
                ventanaterminos.setLocationRelativeTo(null);
                ventanaterminos.setResizable(false);
                ventanaterminos.setTitle("Terms and Conditions Water Saturation Pressures and Temperatures");
                ventanaterminos.setVisible(true);
                this.setVisible(false);
            }


        }


    }


}
