package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RegistroVisitante {
	
	private ArrayList<Visitante> visitantes;
	
	public RegistroVisitante(){ //inicializamos el arraylist
		visitantes = new ArrayList<>();
		
	} 
	
	public void agregarVisitante(Visitante visitante) {
		visitantes.add(visitante);
	}
	
	public void eliminarVisitante(Visitante visitante) {
		visitantes.remove(visitante);
	}
	
	public ArrayList<Visitante> obtenerVisitantes() {
		return visitantes;
	}
	
	public ArrayList<Visitante> obtenerVisitantesOrdenadosPorNombre() {
	    visitantes.sort(Comparator.comparing(Visitante::getNombre));
	    return visitantes;
	}
	
	

}
