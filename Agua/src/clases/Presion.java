package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presion extends JFrame implements ActionListener {

    // Botones de la ventana presion
    protected JButton botonCalcular;

    // Cajas de texto de la ventana presion
    protected JTextField cajaTemperatura;

    // Submenus de la ventana presion
    protected JMenuItem menuitemPresion, menuitemTemperatura, menuitemborrar, menuitemsalir, menuitemcpresion, menuitemdesarrollador;

    // Areas de texto de la ventana presion
    protected JTextArea txtareaPresion;

    // Jcombobox de la ventana presion
    protected JComboBox boxTemperatura;

    // Valor numerico double Temperatura
    protected double Temperatura;

    public Presion() {

        // Etiquetas de la ventana presion

        JLabel Presion, Area, Bienvenido, Autor, Ingrese, Saturacion, Usuario, Unidad, Rango, Resultados;

        Presion = new JLabel("Presión");
        Presion.setBounds(30, 30, 200, 40);
        Presion.setFont(new Font("Bodoni MT", Font.PLAIN, 50));
        add(Presion);

        Area = new JLabel(Inicial.Area);
        Area.setBounds(480, 5, 380, 30);
        Area.setFont(new Font("Arial", Font.ITALIC, 20));
        add(Area);

        Bienvenido = new JLabel("Bienvenido");
        Bienvenido.setBounds(480, 50, 190, 30);
        Bienvenido.setFont(new Font("@Microsoft YaHei", Font.BOLD, 35));
        Bienvenido.setForeground(new Color(200, 86, 0));
        add(Bienvenido);

        Autor = new JLabel("© 2022 Ingeniero Ambiental Marlon Alfredo Paez Gonzalez");
        Autor.setBounds(305, 600, 500, 30);
        Autor.setFont(new Font("Arial", Font.PLAIN, 10));
        add(Autor);

        Ingrese = new JLabel("Ingrese la Temperatura:");
        Ingrese.setBounds(30, 150, 250, 30);
        Ingrese.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Ingrese);

        Saturacion = new JLabel("Saturación");
        Saturacion.setBounds(30, 75, 220, 30);
        Saturacion.setFont(new Font("Bodoni MT", Font.PLAIN, 40));
        add(Saturacion);

        Usuario = new JLabel(Inicial.Nombre);
        Usuario.setBounds(675, 60, 180, 20);
        Usuario.setFont(new Font("Arial", Font.PLAIN, 15));
        add(Usuario);

        Unidad = new JLabel("Seleccione la unidad de Temperatura:");
        Unidad.setBounds(400, 150, 400, 30);
        Unidad.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Unidad);

        Rango = new JLabel("Rango de calculo: (0 - 150) ºC");
        Rango.setBounds(30, 235, 200, 20);
        Rango.setFont(new Font("Arial", Font.PLAIN, 12));
        add(Rango);

        Resultados = new JLabel("Resultados del Cálculo: (mmHg, Psi, kPa, atm, Bar)");
        Resultados.setBounds(30, 295, 600, 30);
        Resultados.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Resultados);

        // Barra, Menu y submenus de la ventana presion

        JMenuBar menuBar;

        JMenu Calcular, Opciones, Conceptos, Acerca;

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 234, 218));
        setJMenuBar(menuBar);

        Calcular = new JMenu("Calcular");
        Calcular.setFont(new Font("Arial", Font.PLAIN, 17));
        menuBar.add(Calcular);

        Opciones = new JMenu("Opciones");
        Opciones.setFont(new Font("Arial", Font.PLAIN, 17));
        menuBar.add(Opciones);

        Conceptos = new JMenu("Conceptos");
        Conceptos.setFont(new Font("Arial", Font.PLAIN, 17));
        menuBar.add(Conceptos);

        Acerca = new JMenu("Acerca de");
        Acerca.setFont(new Font("Arial", Font.PLAIN, 17));
        menuBar.add(Acerca);

        menuitemPresion = new JMenuItem("Presión de Saturación");
        menuitemPresion.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemPresion.setBackground(new Color(255, 216, 186));
        menuitemPresion.addActionListener(this);
        Calcular.add(menuitemPresion);

        menuitemTemperatura = new JMenuItem("Temperatura de Saturación");
        menuitemTemperatura.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemTemperatura.setBackground(new Color(251, 190, 142));
        menuitemTemperatura.addActionListener(this);
        Calcular.add(menuitemTemperatura);

        menuitemborrar = new JMenuItem("Borrar datos");
        menuitemborrar.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemborrar.setBackground(new Color(255, 216, 186));
        menuitemborrar.addActionListener(this);
        Opciones.add(menuitemborrar);

        menuitemsalir = new JMenuItem("Salir");
        menuitemsalir.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemsalir.setBackground(new Color(251, 190, 142));
        menuitemsalir.addActionListener(this);
        Opciones.add(menuitemsalir);

        menuitemcpresion = new JMenuItem("Presión de Saturación");
        menuitemcpresion.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemcpresion.setBackground(new Color(255, 216, 186));
        menuitemcpresion.addActionListener(this);
        Conceptos.add(menuitemcpresion);

        menuitemdesarrollador = new JMenuItem("El desarrollador");
        menuitemdesarrollador.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemdesarrollador.setBackground(new Color(255, 216, 186));
        menuitemdesarrollador.addActionListener(this);
        Acerca.add(menuitemdesarrollador);

        // Jcombobox de la ventana presion

        boxTemperatura = new JComboBox();
        boxTemperatura.setBounds(400, 200, 330, 30);
        boxTemperatura.setFont(new Font("Arial", Font.PLAIN, 17));
        boxTemperatura.setBackground(new Color(255, 234, 218));
        add(boxTemperatura);
        boxTemperatura.addItem("");
        boxTemperatura.addItem("ºC (grados Centígrados)");
        boxTemperatura.addItem("ºF (grados Fahrenheit)");
        boxTemperatura.addItem("ºK (grados Kelvin)");
        boxTemperatura.addItem("ºR (grados Rankine)");

        // Botones y cajas de texto de la ventana presion

        cajaTemperatura = new JTextField();
        cajaTemperatura.setBounds(30, 200, 215, 30);
        cajaTemperatura.setFont(new Font("Arial", Font.PLAIN, 15));
        add(cajaTemperatura);

        botonCalcular = new JButton("Calcular Presión Saturación");
        botonCalcular.setBounds(467, 250, 195, 30);
        botonCalcular.addActionListener(this);
        add(botonCalcular);

        // Areas de texto de la ventana presion

        txtareaPresion = new JTextArea();
        txtareaPresion.setBounds(30, 340, 820, 235);
        txtareaPresion.setFont(new Font("Arial", Font.PLAIN, 17));
        txtareaPresion.setEditable(false);
        txtareaPresion.setBorder(BorderFactory.createEtchedBorder());
        add(txtareaPresion);

        // Evitar ejecuciones en segundo plano

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // Eventos

    public void actionPerformed(ActionEvent evento) {

        try {

            if (evento.getSource() == menuitemsalir) {
                Inicial ventanainicial = new Inicial();
                ventanainicial.setLayout(null);
                ventanainicial.getContentPane().setBackground(new Color(235, 255, 254));
                ventanainicial.setBounds(0, 0, 900, 700);
                ventanainicial.setLocationRelativeTo(null);
                ventanainicial.setResizable(false);
                ventanainicial.setTitle("Water Saturation Pressures and Temperatures");
                ventanainicial.setVisible(true);
                this.setVisible(false);
            }

            if (evento.getSource() == menuitemTemperatura) {
                Temperatura ventanatemperatura = new Temperatura();
                ventanatemperatura.setLayout(null);
                ventanatemperatura.getContentPane().setBackground(new Color(242, 246, 255));
                ventanatemperatura.setBounds(0, 0, 900, 700);
                ventanatemperatura.setLocationRelativeTo(null);
                ventanatemperatura.setResizable(false);
                ventanatemperatura.setTitle("Water Saturation Temperature");
                ventanatemperatura.setVisible(true);
                this.setVisible(false);
            }

            if (evento.getSource() == menuitemborrar) {
                cajaTemperatura.setText("");
                txtareaPresion.setText("");
                boxTemperatura.setSelectedIndex(0);
            }

            if (evento.getSource() == menuitemcpresion) {
                JOptionPane.showMessageDialog(null, "A una temperatura determinada, la presión a la que una sustancia pura cambia\n" +
                        "de fase se llama presión de saturación.");
            }

            if (evento.getSource() == menuitemdesarrollador) {
                JOptionPane.showMessageDialog(null, "Ingeniero Ambiental Marlon Alfredo Páez González. Universidad\n" +
                        "Francisco de Paula Santander.");
            }

            if (evento.getSource() == botonCalcular) {

                Operaciones operaciones = new Operaciones();
                Temperatura = Double.parseDouble(cajaTemperatura.getText());

                if (boxTemperatura.getSelectedItem().toString().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar la unidad de Temperatura.");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºC (grados Centígrados)") & (Temperatura >= 0 & Temperatura <= 60)) {
                    Operaciones.Temperaturaconversion = Temperatura;
                    operaciones.calcularpresion();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºC:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºF (grados Fahrenheit)") & (Temperatura >= 32 & Temperatura <= 140)) {
                    Operaciones.Temperaturaconversion = (Temperatura - 32) * 5 / 9;
                    operaciones.calcularpresion();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºF:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºK (grados Kelvin)") & (Temperatura >= 273.15 & Temperatura <= 333.15)) {
                    Operaciones.Temperaturaconversion = Temperatura - 273.15;
                    operaciones.calcularpresion();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºK:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºR (grados Rankine)") & (Temperatura >= 491.67 & Temperatura <= 599.67)) {
                    Operaciones.Temperaturaconversion = (Temperatura - 491.67) * 5 / 9;
                    operaciones.calcularpresion();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºR:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºC (grados Centígrados)") & (Temperatura >= 60.01 & Temperatura <= 150)) {
                    Operaciones.Temperaturaconversion = Temperatura;
                    operaciones.calcularpresion1();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºC:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºF (grados Fahrenheit)") & (Temperatura >= 140.01 & Temperatura <= 302)) {
                    Operaciones.Temperaturaconversion = (Temperatura - 32) * 5 / 9;
                    operaciones.calcularpresion1();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºF:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºK (grados Kelvin)") & (Temperatura >= 333.16 & Temperatura <= 423.15)) {
                    Operaciones.Temperaturaconversion = Temperatura - 273.15;
                    operaciones.calcularpresion1();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºK:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else if (boxTemperatura.getSelectedItem().toString().equals("ºR (grados Rankine)") & (Temperatura >= 599.688 & Temperatura <= 761.67)) {
                    Operaciones.Temperaturaconversion = (Temperatura - 491.67) * 5 / 9;
                    operaciones.calcularpresion1();
                    txtareaPresion.setText(" Presión de Saturación Agua a  " + Temperatura + "  ºR:" + "\n\n " + operaciones.Psat + "  mmHg" + "\n\n " + operaciones.psi + "  Psi" +
                            "\n\n " + operaciones.kpa + "  kPa" + "\n\n " + operaciones.atm + "  atm" + "\n\n " + operaciones.bar + "  Bar");
                } else {
                    txtareaPresion.setText("Null.");
                }
            }

        } catch (Exception error) {
            txtareaPresion.setText("¡Error! " + error);
        }

    }
}
