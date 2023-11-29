package modelo;

public class Trabajador extends Persona {
	private String isapre;
	private String afp;
	private Empresa empresa;

	// Constructor
	public Trabajador(String nombre, String apellido, String rut) {
		super(nombre, apellido, rut);
		// Asignar valores iniciales a isapre y afp si es necesario
		this.isapre = "IsaprePorDefecto";
		this.afp = "AfpPorDefecto";
	}

	// Métodos getter y setter para isapre
	public String getIsapre() {
		return this.isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	// Métodos getter y setter para afp
	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	// Métodos getter y setter para empresa
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	// Método toString
	@Override
	public String toString() {
		return "Trabajador{" +
				"nombre='" + getNombre() + '\'' +
				", apellido='" + getApellido() + '\'' +
				", rut='" + getRut() + '\'' +
				", isapre='" + isapre + '\'' +
				", afp='" + afp + '\'' +
				", empresa=" + empresa +
				'}';
	}
}
