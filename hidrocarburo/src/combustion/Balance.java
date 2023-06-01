package combustion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balance extends JFrame implements ActionListener {

    // Declaracion de objetos graficos

    private JTextField cajauno, cajados;
    private JTextArea txtareauno;
    private JButton Ver;
    private JMenuBar Barra;
    private JMenu opciones, consultar, acercade;
    private JMenuItem borrardatos, salir, combustioncompleta, combustionincompleta, eldesarrollador, elsoftware;
    private JLabel Compuesto;

    // Constructor

    public Balance() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Etiquetas();
        Botones();
        Cajas();
        Menu();
        Texto();

    }

    // Inicializacion y Caracteristicas Etiquetas

    private void Etiquetas() {

        JLabel Ecuacion, Combustion, Balanceada, Ingresar, Atomos, Descripcion, Autor;

        Ecuacion = new JLabel("Ecuación Química");
        Ecuacion.setBounds(700, 20, 500, 50);
        Ecuacion.setFont(new Font("Bauhaus 93", Font.PLAIN, 40));
        add(Ecuacion);

        Combustion = new JLabel("Combustión Hidrocarburo");
        Combustion.setBounds(700, 50, 500, 50);
        Combustion.setForeground(new Color(175, 41, 41));
        Combustion.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
        add(Combustion);

        Balanceada = new JLabel("balanceada");
        Balanceada.setBounds(702, 70, 500, 50);
        Balanceada.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
        add(Balanceada);

        Ingresar = new JLabel("Ingrese el número de átomos del elemento Carbono e Hidrógeno del Hidrocarburo:");
        Ingresar.setBounds(20, 40, 800, 30);
        Ingresar.setFont(new Font("Arial", Font.PLAIN, 17));
        add(Ingresar);

        Atomos = new JLabel("C     H");
        Atomos.setBounds(20, 70, 800, 50);
        Atomos.setFont(new Font("Arial", Font.PLAIN, 30));
        add(Atomos);

        Compuesto = new JLabel();
        Compuesto.setBounds(200, 70, 400, 50);
        Compuesto.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
        Compuesto.setForeground(new Color(122, 122, 122));
        add(Compuesto);

        Descripcion = new JLabel("A continuación se efectuara la construcción y balance de materia de la ecuación química de combustión de un Hidrocarburo, " +
                "según los datos del número de átomos ingresado:");
        Descripcion.setBounds(20, 140, 1000, 30);
        Descripcion.setFont(new Font("Arial", Font.PLAIN, 12));
        add(Descripcion);

        Autor = new JLabel("© 2022 Ingeniero Ambiental Marlon Alfredo Paez Gonzalez");
        Autor.setBounds(405, 600, 500, 30);
        Autor.setFont(new Font("Arial", Font.PLAIN, 10));
        add(Autor);

    }

    // Inicializacion y Caracteristicas Areas de Texto

    private void Texto() {

        txtareauno = new JTextArea();
        txtareauno.setBorder(BorderFactory.createEtchedBorder());
        txtareauno.setBounds(20, 180, 1040, 400);
        txtareauno.setFont(new Font("Arial", Font.PLAIN, 17));
        txtareauno.setEditable(false);
        add(txtareauno);

    }

    // Inicializacion y Caracteristicas Botones

    private void Botones() {

        Ver = new JButton("Ver reacción");
        Ver.setBounds(490, 80, 130, 30);
        Ver.setFont(new Font("Arial", Font.BOLD, 15));
        Ver.addActionListener(this);
        add(Ver);

    }

    // Inicializacion y Caracteristicas Cajas de Texto

    private void Cajas() {

        cajauno = new JTextField();
        cajauno.setBounds(48, 90, 30, 30);
        cajauno.setFont(new Font("Arial", Font.PLAIN, 20));
        add(cajauno);

        cajados = new JTextField();
        cajados.setBounds(110, 90, 30, 30);
        cajados.setFont(new Font("Arial", Font.PLAIN, 20));
        add(cajados);

    }

    // Inicializacion y Caracteristicas de la Barra Menu

    private void Menu() {

        Barra = new JMenuBar();
        Barra.setBackground(new Color(200, 200, 200));
        setJMenuBar(Barra);

        opciones = new JMenu("Opciones");
        opciones.setFont(new Font("Arial", Font.BOLD, 15));
        Barra.add(opciones);

        consultar = new JMenu("Consultar");
        consultar.setFont(new Font("Arial", Font.BOLD, 15));
        Barra.add(consultar);

        acercade = new JMenu("Acerca de");
        acercade.setFont(new Font("Arial", Font.BOLD, 15));
        Barra.add(acercade);

        borrardatos = new JMenuItem("Borrar datos");
        borrardatos.setFont(new Font("Arial", Font.PLAIN, 15));
        borrardatos.setBackground(new Color(180, 180, 180));
        borrardatos.addActionListener(this);
        opciones.add(borrardatos);

        salir = new JMenuItem("Salir");
        salir.setFont(new Font("Arial", Font.PLAIN, 15));
        salir.setBackground(new Color(180, 180, 180));
        salir.addActionListener(this);
        opciones.add(salir);

        combustioncompleta = new JMenuItem("Combustión completa");
        combustioncompleta.setFont(new Font("Arial", Font.PLAIN, 15));
        combustioncompleta.setBackground(new Color(180, 180, 180));
        combustioncompleta.addActionListener(this);
        consultar.add(combustioncompleta);

        combustionincompleta = new JMenuItem("Combustión incompleta");
        combustionincompleta.setFont(new Font("Arial", Font.PLAIN, 15));
        combustionincompleta.setBackground(new Color(180, 180, 180));
        combustionincompleta.addActionListener(this);
        consultar.add(combustionincompleta);

        eldesarrollador = new JMenuItem("El desarrollador");
        eldesarrollador.setFont(new Font("Arial", Font.PLAIN, 15));
        eldesarrollador.setBackground(new Color(180, 180, 180));
        eldesarrollador.addActionListener(this);
        acercade.add(eldesarrollador);

        elsoftware = new JMenuItem("El software");
        elsoftware.setFont(new Font("Arial", Font.PLAIN, 15));
        elsoftware.setBackground(new Color(180, 180, 180));
        elsoftware.addActionListener(this);
        acercade.add(elsoftware);

    }

    // Variables que contienen la informacion del numero de atomos ingresado

    String atomotxtCarbono, atomotxtHidrogeno;

    // Eventos

    @Override

    public void actionPerformed(ActionEvent evento) {

        try {

            Operaciones operaciones = new Operaciones();

            atomotxtCarbono = cajauno.getText();
            atomotxtHidrogeno = cajados.getText();

            if (evento.getSource() == Ver) {


                operaciones.atomoCarbono = Integer.parseInt(cajauno.getText());
                operaciones.atomoHidrogeno = Integer.parseInt(cajados.getText());

                operaciones.combustionCompleta();
                operaciones.combustionIncompleta();

                txtareauno.setText("\n" + "   Combustión Completa:" + "\n\n " + "  C" + operaciones.atomoCarbono + "H" + operaciones.atomoHidrogeno + " + " + operaciones.coeficienteO2c + " O2" +
                        " → " + operaciones.coeficienteCO2 + "CO2" + " + " + operaciones.coeficienteH20 + " H2O" + "\n\n " + "  Combustión Incompleta:" + "\n\n " + "  C" + operaciones.atomoCarbono
                        + "H" + operaciones.atomoHidrogeno + " + " + operaciones.coeficienteO2i + " O2" + " → " + operaciones.coeficienteCO + "CO" + " + " + operaciones.coeficienteH20 + " H2O" + "\n\n\n" +
                        "   Balance de Elementos ecuación Combustión Completa:" + "\n\n" + "   (Carbono) " + (operaciones.atomoCarbono * 1.0) + " = " + (operaciones.coeficienteCO2 * 1.0)
                        + " (Carbono)   " + "   (Hidrogeno) " + (operaciones.atomoHidrogeno * 1.0) + " = " + (operaciones.coeficienteH20 * 2.0) + " (Hidrogeno)   " + "   (Oxigeno) "
                        + (operaciones.coeficienteO2c * 2) + " = " + operaciones.oxigenoProductosc + " (Oxigeno)" + "\n\n" + "   Balance de Elementos ecuación Combustión Incompleta:" +
                        "\n\n" + "   (Carbono) " + (operaciones.atomoCarbono * 1.0) + " = " + (operaciones.coeficienteCO * 1.0) + " (Carbono)   " + "   (Hidrogeno) " +
                        (operaciones.atomoHidrogeno * 1.0) + " = " + (operaciones.coeficienteH20 * 2.0) + " (Hidrogeno)   " + "   (Oxigeno) " + (operaciones.coeficienteO2i * 2) + " = "
                        + operaciones.oxigenoProductosi + " (Oxigeno)");

                if (atomotxtCarbono.equals("3") & atomotxtHidrogeno.equals("8")) {
                    Compuesto.setText("¡Propano!");
                } else if (atomotxtCarbono.equals("2") & atomotxtHidrogeno.equals("2")) {
                    Compuesto.setText("¡Acetileno!");

                } else if (atomotxtCarbono.equals("1") & atomotxtHidrogeno.equals("4")) {
                    Compuesto.setText("¡Metano!");

                } else if (atomotxtCarbono.equals("2") & atomotxtHidrogeno.equals("6")) {
                    Compuesto.setText("¡Etano!");

                } else if (atomotxtCarbono.equals("4") & atomotxtHidrogeno.equals("10")) {
                    Compuesto.setText("¡Butano!");

                } else if (atomotxtCarbono.equals("5") & atomotxtHidrogeno.equals("12")) {
                    Compuesto.setText("¡Pentano!");

                } else if (atomotxtCarbono.equals("6") & atomotxtHidrogeno.equals("6")) {
                    Compuesto.setText("¡Benceno!");

                } else if (atomotxtCarbono.equals("2") & atomotxtHidrogeno.equals("4")) {
                    Compuesto.setText("¡Etileno!");
                } else {
                    Compuesto.setText("? ? ?");
                }
            }

            if (evento.getSource() == borrardatos) {
                cajauno.setText("");
                cajados.setText("");
                txtareauno.setText("");
                Compuesto.setText("");
            }

            if (evento.getSource() == salir) {
                System.exit(0);
            }

            if (evento.getSource() == combustioncompleta) {
                JOptionPane.showMessageDialog(null, "Cuando las reacciones indicadas están desplazadas totalmente a la derecha, es decir, " + "\n\n " +
                        "los componentes se oxidan completamente, formando dióxido de carbono (CO2), agua líquida (H2O), " + "independientemente de la cantidad de aire " + "\n\n " +
                        "empleada en la reacción. Esto implica que el oxígeno presente en el aire, ha sido cuando menos, " + "suficiente para oxidar completamente los " + "\n\n " +
                        "componentes.");
            }

            if (evento.getSource() == combustionincompleta) {
                JOptionPane.showMessageDialog(null, "Es aquella cuyos gases de combustión contienen compuestos parcialmente oxidados llamados " +
                        "inquemados, como: monóxido de carbono (CO), partículas de carbono.");
            }

            if (evento.getSource() == elsoftware) {
                JOptionPane.showMessageDialog(null, "Este software crea y balancea la ecuacion de combustion completa e incompleta de un" +
                        " hidrocarburo compuesto por atomos de Carbono e Hidrogeno.");
            }

            if (evento.getSource() == eldesarrollador) {
                JOptionPane.showMessageDialog(null, "Marlon Alfredo Paez Gonzalez. Ingeniero Ambiental. Universidad Francisco de Paula Santander.");
            }

        } catch (Exception error) {
            txtareauno.setText("Error ! " + error);
        }


    }


}
