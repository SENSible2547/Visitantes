package modelo;

public class Visitante {
	
	private String nombre;
	private String documento;
	private String entrada;
	
	public Visitante(String nombre, String documento, String entrada) {
        this.nombre = nombre;
        this.documento = documento;
        this.entrada = entrada;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	

}
