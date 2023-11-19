package modelo;

public class Principal {
	private Persona unnamed_Persona;
	private Trabajador unnamed_Trabajador;
	private Empresa unnamed_Empresa;

	// Constructor
	public Principal() {
		// Puedes inicializar instancias de Persona, Trabajador y Empresa aquí si es necesario
	}

	// Método main
	public static void main(String[] args) {
		// Puedes agregar la lógica principal de tu programa aquí
		System.out.println("Hola, mundo desde el método main!");
	}

	// Getters y setters para las instancias
	public Persona getUnnamed_Persona() {
		return unnamed_Persona;
	}

	public void setUnnamed_Persona(Persona unnamed_Persona) {
		this.unnamed_Persona = unnamed_Persona;
	}

	public Trabajador getUnnamed_Trabajador() {
		return unnamed_Trabajador;
	}

	public void setUnnamed_Trabajador(Trabajador unnamed_Trabajador) {
		this.unnamed_Trabajador = unnamed_Trabajador;
	}

	public Empresa getUnnamed_Empresa() {
		return unnamed_Empresa;
	}

	public void setUnnamed_Empresa(Empresa unnamed_Empresa) {
		this.unnamed_Empresa = unnamed_Empresa;
	}
}
