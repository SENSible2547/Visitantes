package main;

import modelo.RegistroVisitante;
import vista.VistaRegistro;
import controlador.ControladorRegistro;

public class main {
    public static void main(String[] args) {
        RegistroVisitante modelo = new RegistroVisitante();
        VistaRegistro vista = new VistaRegistro();
        ControladorRegistro controlador = new ControladorRegistro(modelo, vista);

    }
}
