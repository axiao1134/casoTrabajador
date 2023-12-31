package modelo;

public class Persona {
	private String nombre;
	private String apellido;
	private String rut;

	// Constructores
	public Persona(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}

	// Métodos getter y setter para nombre
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para apellido
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Métodos getter y setter para rut
	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	// Método toString
	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", rut='" + rut + '\'' +
				'}';
	}

	// Puedes implementar equals() y hashCode() según tus necesidades
}
