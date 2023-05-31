package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperatura extends JFrame implements ActionListener {

    // Botones de la ventana temperatura
    protected JButton botonCalcular;

    // Cajas de texto de la ventana temperatura
    protected JTextField cajaPresion;

    // Submenus de la ventana temperatura
    protected JMenuItem menuitemPresion, menuitemTemperatura, menuitemborrar, menuitemsalir, menuitemctemperatura, menuitemdesarrollador;

    // Areas de texto de la ventana temperatura
    protected JTextArea txtareaTemperatura;

    // Jcombobox de la ventana temperatura
    protected JComboBox boxPresion;

    // Valor numerico double Presion
    protected double Presion;

    public Temperatura() {

        // Etiquetas de la ventana temperatura

        JLabel Temperatura, Area, Bienvenido, Autor, Ingrese, Saturacion, Usuario, Unidad, Rango, Resultados;

        Temperatura = new JLabel("Temperatura");
        Temperatura.setBounds(30, 30, 300, 50);
        Temperatura.setFont(new Font("Bodoni MT", Font.PLAIN, 50));
        add(Temperatura);

        Area = new JLabel(Inicial.Area);
        Area.setBounds(480, 5, 380, 30);
        Area.setFont(new Font("Arial", Font.ITALIC, 20));
        add(Area);

        Bienvenido = new JLabel("Bienvenido");
        Bienvenido.setBounds(480, 50, 190, 30);
        Bienvenido.setFont(new Font("@Microsoft YaHei", Font.BOLD, 35));
        Bienvenido.setForeground(new Color(0, 85, 255));
        add(Bienvenido);

        Autor = new JLabel("© 2022 Ingeniero Ambiental Marlon Alfredo Paez Gonzalez");
        Autor.setBounds(305, 600, 500, 30);
        Autor.setFont(new Font("Arial", Font.PLAIN, 10));
        add(Autor);

        Ingrese = new JLabel("Ingrese la Presión:");
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

        Unidad = new JLabel("Seleccione la unidad de Presión:");
        Unidad.setBounds(400, 150, 400, 30);
        Unidad.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Unidad);

        Rango = new JLabel("Rango de calculo: (0,611  -  476,198) kPa");
        Rango.setBounds(30, 235, 250, 20);
        Rango.setFont(new Font("Arial", Font.PLAIN, 12));
        add(Rango);

        Resultados = new JLabel("Resultados del Cálculo: (ºC, ºF, ºK, ºR)");
        Resultados.setBounds(30, 295, 600, 30);
        Resultados.setFont(new Font("Arial", Font.PLAIN, 20));
        add(Resultados);

        // Barra, Menu y submenus de la ventana temperatura

        JMenuBar menuBar;

        JMenu Calcular, Opciones, Conceptos, Acerca;

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(209, 224, 255));
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
        menuitemPresion.setBackground(new Color(190, 212, 255));
        menuitemPresion.addActionListener(this);
        Calcular.add(menuitemPresion);

        menuitemTemperatura = new JMenuItem("Temperatura de Saturación");
        menuitemTemperatura.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemTemperatura.setBackground(new Color(130, 171, 255));
        menuitemTemperatura.addActionListener(this);
        Calcular.add(menuitemTemperatura);

        menuitemborrar = new JMenuItem("Borrar datos");
        menuitemborrar.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemborrar.setBackground(new Color(190, 212, 255));
        menuitemborrar.addActionListener(this);
        Opciones.add(menuitemborrar);

        menuitemsalir = new JMenuItem("Salir");
        menuitemsalir.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemsalir.setBackground(new Color(130, 171, 255));
        menuitemsalir.addActionListener(this);
        Opciones.add(menuitemsalir);

        menuitemctemperatura = new JMenuItem("Presión de Saturación");
        menuitemctemperatura.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemctemperatura.setBackground(new Color(190, 212, 255));
        menuitemctemperatura.addActionListener(this);
        Conceptos.add(menuitemctemperatura);

        menuitemdesarrollador = new JMenuItem("El desarrollador");
        menuitemdesarrollador.setFont(new Font("Arial", Font.PLAIN, 15));
        menuitemdesarrollador.setBackground(new Color(190, 212, 255));
        menuitemdesarrollador.addActionListener(this);
        Acerca.add(menuitemdesarrollador);

        // Jcombobox de la ventana temperatura

        boxPresion = new JComboBox();
        boxPresion.setBounds(400, 200, 330, 30);
        boxPresion.setFont(new Font("Arial", Font.PLAIN, 17));
        boxPresion.setBackground(new Color(209, 224, 255));
        add(boxPresion);
        boxPresion.addItem("");
        boxPresion.addItem("kPa (kN / m2)");
        boxPresion.addItem("Psi (lbf / in2)");
        boxPresion.addItem("mmHg (milímetro Mercurio)");
        boxPresion.addItem("atm (atmósfera)");
        boxPresion.addItem("Bar");

        // Botones y cajas de texto de la ventana temperatura

        cajaPresion = new JTextField();
        cajaPresion.setBounds(30, 200, 215, 30);
        cajaPresion.setFont(new Font("Arial", Font.PLAIN, 15));
        add(cajaPresion);

        botonCalcular = new JButton("Calcular Temperatura Saturación");
        botonCalcular.setBounds(445, 240, 240, 30);
        botonCalcular.addActionListener(this);
        add(botonCalcular);

        // Areas de texto de la ventana temperatura

        txtareaTemperatura = new JTextArea();
        txtareaTemperatura.setBounds(30, 340, 820, 235);
        txtareaTemperatura.setFont(new Font("Arial", Font.PLAIN, 17));
        txtareaTemperatura.setEditable(false);
        txtareaTemperatura.setBorder(BorderFactory.createEtchedBorder());
        add(txtareaTemperatura);

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

            if (evento.getSource() == menuitemPresion) {
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

            if (evento.getSource() == menuitemborrar) {
                cajaPresion.setText("");
                txtareaTemperatura.setText("");
                boxPresion.setSelectedIndex(0);
            }

            if (evento.getSource() == menuitemctemperatura) {
                JOptionPane.showMessageDialog(null, "A una determinada presión, la temperatura a la que una sustancia pura \n" +
                        "cambia de fase se llama temperatura de saturación.");
            }

            if (evento.getSource() == menuitemdesarrollador) {
                JOptionPane.showMessageDialog(null, "Ingeniero Ambiental Marlon Alfredo Páez González. Universidad\n" +
                        "Francisco de Paula Santander.");
            }

            if (evento.getSource() == botonCalcular) {

                Operaciones operaciones = new Operaciones();
                Presion = Double.parseDouble(cajaPresion.getText());

                if (boxPresion.getSelectedItem().toString().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar la unidad de Presión.");
                } else if (boxPresion.getSelectedItem().toString().equals("kPa (kN / m2)") & (Presion >= 0.611 & Presion <= 19.944)) {
                    Operaciones.Presionconversion = Presion * (1 / 101.325) * 760;
                    operaciones.calculartemperatura();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  kPa:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("Psi (lbf / in2)") & (Presion >= 0.0886 & Presion <= 2.8925)) {
                    Operaciones.Presionconversion = Presion * (1 / 14.7) * 760;
                    operaciones.calculartemperatura();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  Psi:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("mmHg (milímetro Mercurio)") & (Presion >= 4.5 & Presion <= 149.5)) {
                    Operaciones.Presionconversion = Presion;
                    operaciones.calculartemperatura();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  mmHg:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("atm (atmósfera)") & (Presion >= 0.006031 & Presion <= 0.196880)) {
                    Operaciones.Presionconversion = Presion * 760;
                    operaciones.calculartemperatura();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  atm:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("Bar") & (Presion >= 0.0061 & Presion <= 0.19944)) {
                    Operaciones.Presionconversion = Presion * 750.062;
                    operaciones.calculartemperatura();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  Bar:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("kPa (kN / m2)") & (Presion >= 19.953 & Presion <= 476.198)) {
                    Operaciones.Presionconversion = Presion * (1 / 101.325) * 760;
                    operaciones.calculartemperatura1();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  kPa:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("Psi (lbf / in2)") & (Presion >= 2.8938 & Presion <= 69.0642)) {
                    Operaciones.Presionconversion = Presion * (1 / 14.7) * 760;
                    operaciones.calculartemperatura1();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  Psi:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("mmHg (milímetro Mercurio)") & (Presion >= 149.51 & Presion <= 3571.57)) {
                    Operaciones.Presionconversion = Presion;
                    operaciones.calculartemperatura1();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  mmHg:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("atm (atmósfera)") & (Presion >= 0.196969 & Presion <= 4.7)) {
                    Operaciones.Presionconversion = Presion * 760;
                    operaciones.calculartemperatura1();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  atm:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else if (boxPresion.getSelectedItem().toString().equals("Bar") & (Presion >= 0.19953 & Presion <= 4.76)) {
                    Operaciones.Presionconversion = Presion * 750.062;
                    operaciones.calculartemperatura1();
                    txtareaTemperatura.setText(" Temperatura de Saturación Agua a  " + Presion + "  Bar:" + "\n\n " + operaciones.Tsat + "  ºC" + "\n\n " + operaciones.farengei + "  ºF" +
                            "\n\n " + operaciones.kelvin + "  ºK" + "\n\n " + operaciones.rankine + "  ºR");
                } else {
                    txtareaTemperatura.setText("Null.");
                }
            }

        } catch (Exception error) {
            txtareaTemperatura.setText("¡Error! " + error);
        }

    }
}