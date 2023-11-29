package modelo;

public class Principal {
	private Persona persona;
	private Trabajador trabajador;
	private Empresa empresa;

	// Constructor
	public Principal() {
		this.persona = new Persona("Nombre", "Apellido", "12345678-9");
		this.trabajador = new Trabajador("NombreTrabajador", "ApellidoTrabajador", "98765432-1");
		this.empresa = new Empresa();
		// Puedes agregar más inicializaciones si es necesario
	}

	// Método principal
	public void ejecutarPrograma() {
		// Lógica principal del programa
		System.out.println("Hola, mundo desde el método ejecutarPrograma!");
		// Puedes interactuar con instancias de Persona, Trabajador y Empresa aquí
	}

	// Getters y setters para las instancias
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	// Método main
	public static void main(String[] args) {
		// Crear una instancia de Principal y ejecutar el programa
		Principal principal = new Principal();
		principal.ejecutarPrograma();
	}
}
