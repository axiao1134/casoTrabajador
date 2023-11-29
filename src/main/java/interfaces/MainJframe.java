package interfaces;

import modelo.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class VentanaTrabajador extends JFrame {
    private JTextField nombreTextField;
    private JTextField apellidoTextField;
    private JTextField rutTextField;
    private JTextField isapreTextField;
    private JTextField afpTextField;
    private JButton guardarButton;
    private JButton verTrabajadoresButton;
    private ArrayList<Trabajador> listaTrabajadores;

    public VentanaTrabajador() {
        // Inicializar la lista de trabajadores
        listaTrabajadores = new ArrayList<>();

        // Configuración básica de la ventana
        setTitle("Ventana Trabajador");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creación de componentes
        nombreTextField = new JTextField(20);
        apellidoTextField = new JTextField(20);
        rutTextField = new JTextField(20);
        isapreTextField = new JTextField(20);
        afpTextField = new JTextField(20);
        guardarButton = new JButton("Guardar");
        verTrabajadoresButton = new JButton("Ver Trabajadores");

        // Configuración del diseño
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel("Nombre:"));
        panel.add(nombreTextField);
        panel.add(new JLabel("Apellido:"));
        panel.add(apellidoTextField);
        panel.add(new JLabel("RUT:"));
        panel.add(rutTextField);
        panel.add(new JLabel("Isapre:"));
        panel.add(isapreTextField);
        panel.add(new JLabel("AFP:"));
        panel.add(afpTextField);
        panel.add(new JLabel(""));
        panel.add(guardarButton);
        panel.add(new JLabel(""));
        panel.add(verTrabajadoresButton);

        getContentPane().add(panel, BorderLayout.CENTER);

        // Configurar acciones para el botón Guardar
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarTrabajador();
                mostrarMensaje("Guardado exitosamente");
            }
        });

        // Configurar acciones para el botón Ver Trabajadores
        verTrabajadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verTrabajadores();
            }
        });
    }

    private void guardarTrabajador() {
        String nombre = nombreTextField.getText();
        String apellido = apellidoTextField.getText();
        String rut = rutTextField.getText();
        String isapre = isapreTextField.getText();
        String afp = afpTextField.getText();

        Trabajador trabajador = new Trabajador(nombre, apellido, rut);
        trabajador.setIsapre(isapre);
        trabajador.setAfp(afp);

        listaTrabajadores.add(trabajador);
    }

    private void verTrabajadores() {
        StringBuilder mensaje = new StringBuilder("Lista de Trabajadores:\n");
        for (Trabajador trabajador : listaTrabajadores) {
            mensaje.append(trabajador.getNombre()).append(" ").append(trabajador.getApellido()).append("\n");
        }

        mostrarMensaje(mensaje.toString());
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaTrabajador().setVisible(true);
            }
        });
    }
}
