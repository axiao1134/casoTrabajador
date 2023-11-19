package modelo;

public class Trabajador extends Persona {
	private String isapre;
	private String afp;
	private Empresa empresa;
	public Principal unnamed_Principal_;

	// Constructores
	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
		super(nombre, apellido, rut);
		this.isapre = isapre;
		this.afp = afp;
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
}
