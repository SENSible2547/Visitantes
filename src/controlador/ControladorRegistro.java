package controlador;

import modelo.RegistroVisitante;
import modelo.Visitante;
import vista.VistaRegistro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ControladorRegistro {
    private RegistroVisitante modelo;
    private VistaRegistro vista;

    public ControladorRegistro(RegistroVisitante modelo, VistaRegistro vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.getBtnActualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarVista();
            }
        });
        this.vista.agregarListenerAgregar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = vista.getNombre();
                String documento = vista.getDocumento();
                String entrada = vista.getEntrada();
                if(!nombre.isEmpty() && !documento.isEmpty() && !entrada.isEmpty()) {
                    modelo.agregarVisitante(new Visitante(nombre, documento, entrada));
                    actualizarVista();
                    vista.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios.");
                }
            }
        });
    }

    public void actualizarVista() {
        ArrayList<Visitante> visitantes = modelo.obtenerVisitantesOrdenadosPorNombre();
        Object[][] datos = new Object[visitantes.size()][3];

        for (int i = 0; i < visitantes.size(); i++) {
            Visitante v = visitantes.get(i);
            datos[i][0] = v.getNombre();
            datos[i][1] = v.getDocumento();
            datos[i][2] = v.getEntrada();
        }

        vista.actualizarTabla(datos);
    }

 
}
