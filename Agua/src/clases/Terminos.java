package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Terminos extends JFrame implements ActionListener {

    // Botones de la ventana terminos

    protected JButton Aceptar, Noaceptar;

    public Terminos() {

        // Etiquetas de la ventana terminos

        JLabel Terminos, Yo, Autor;

        Terminos = new JLabel("TÉRMINOS Y CONDICIONES");
        Terminos.setBounds(320, 30, 400, 30);
        Terminos.setFont(new Font("Arial", Font.BOLD, 20));
        add(Terminos);

        Yo = new JLabel("Yo " + Inicial.Nombre);
        Yo.setBounds(30, 480, 500, 20);
        Yo.setFont(new Font("Arial", Font.PLAIN, 18));
        add(Yo);

        Autor = new JLabel("© 2022 Ingeniero Ambiental Marlon Alfredo Paez Gonzalez");
        Autor.setBounds(305, 600, 500, 30);
        Autor.setFont(new Font("Arial", Font.PLAIN, 10));
        add(Autor);

        // Areas de texto de la ventana terminos

        JTextArea txtarea;

        txtarea = new JTextArea();
        txtarea.setBounds(30, 80, 825, 350);
        txtarea.setEditable(false);
        txtarea.setText("\n\n         TÉRMINOS Y CONDICIONES" +
                "\n\n           A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DEL AUTOR." +
                "\n\n           B. PROHIBIDA LA ALTERACIÓN DEL CODIGO FUENTE Y EL DISEÑO DE LAS INTERFACES GRÁFICAS." +
                "\n\n           C. EL AUTOR NO SE HACE RESPONSABLE DEL MAL USO DEL SOFTWARE." +
                "\n\n           LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE. EL AUTOR NO " +
                "\n           SE HACE RESPONSABLE DEL USO QUE USTED HAGA CON EL SOFTWARE. PARA ACEPTAR LOS TÉRMINOS Y CONDICIONES" +
                "\n           DESCRITOS ANTERIORMENTE, HAGA CLICK EN EL BOTON (ACEPTAR), DE LO CONTRARIO, HAGA CLICK EN EL BOTON (NO ACEPTAR), " +
                "\n           PARA CERRAR EL PROGRAMA Y NO UTILIZARLO." +
                "\n\n           PARA MAYOR INFORMACIÓN Y APORTES A LA MEJORA CONTINÚA DEL SOFTWARE, CONTACTE EL DESARROLLADOR.");
        add(txtarea);

        // ScrollPane de la ventana terminos

        JScrollPane Rueda;

        Rueda = new JScrollPane(txtarea);
        Rueda.setBounds(30, 80, 825, 350);
        add(Rueda);

        // Botones de la ventana terminos

        Aceptar = new JButton("Acepto");
        Aceptar.setBounds(30, 520, 120, 40);
        Aceptar.setFont(new Font("Arial", 1, 15));
        Aceptar.addActionListener(this);
        add(Aceptar);

        Noaceptar = new JButton("No Acepto");
        Noaceptar.setBounds(170, 520, 120, 40);
        Noaceptar.setFont(new Font("Arial", 1, 15));
        Noaceptar.addActionListener(this);
        add(Noaceptar);

        // Evitar ejecuciones en segundo plano

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // Eventos

    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == Aceptar) {
            Presion ventanapresion = new Presion();
            ventanapresion.setLayout(null);
            ventanapresion.getContentPane().setBackground(new Color(255, 247, 242));
            ventanapresion.setBounds(0, 0, 900, 700);
            ventanapresion.setLocationRelativeTo(null);
            ventanapresion.setResizable(false);
            ventanapresion.setTitle("Water Saturation Pressure");
            ventanapresion.setVisible(true);
            this.setVisible(false);
        }

        if (evento.getSource() == Noaceptar) {
            System.exit(0);
        }

    }

}






