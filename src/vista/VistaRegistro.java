package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaRegistro extends JFrame {
    private JTable tablaVisitantes;
    private DefaultTableModel modeloTabla;
    private JButton btnActualizar;
    private JTextField txtNombre;
    private JTextField txtDocumento;
    private JTextField txtEntrada;
    private JButton btnAgregar;

    public VistaRegistro() {
        setTitle("Registro de Visitantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Documento", "Entrada"}, 0);
        tablaVisitantes = new JTable(modeloTabla);
        
        add(new JScrollPane(tablaVisitantes), BorderLayout.CENTER);

        btnActualizar = new JButton("Actualizar Lista");
        add(btnActualizar, BorderLayout.SOUTH);
        
        JPanel panelIngreso = new JPanel(new GridLayout(0, 4, 10, 10));
        txtNombre = new JTextField();
        txtDocumento = new JTextField();
        txtEntrada = new JTextField();
        
        btnAgregar = new JButton("Agregar");

        panelIngreso.add(new JLabel("Nombre:"));
        panelIngreso.add(txtNombre);
        panelIngreso.add(new JLabel("Documento:"));
        panelIngreso.add(txtDocumento);
        panelIngreso.add(new JLabel("Entrada:"));
        panelIngreso.add(txtEntrada);
        panelIngreso.add(btnAgregar);

        add(panelIngreso, BorderLayout.SOUTH);
        
        setVisible(true);
        
    }

    public void actualizarTabla(Object[][] datos) {
        modeloTabla.setRowCount(0); // Limpiar la tabla
        for (Object[] fila : datos) {
            modeloTabla.addRow(fila);
        }
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }
    
    public String getNombre() {
        return txtNombre.getText();
    }

    public String getDocumento() {
        return txtDocumento.getText();
    }

    public String getEntrada() {
        return txtEntrada.getText();
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtDocumento.setText("");
        txtEntrada.setText("");
    }

    public void agregarListenerAgregar(ActionListener listenForAgregarButton){
        btnAgregar.addActionListener(listenForAgregarButton);
    }
}
