package modelo;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Trabajador> trabajadores;
	// Puede que quieras cambiar el nombre a algo más descriptivo
	private Principal unnamed_Principal_;

	public Empresa() {
		this.trabajadores = new ArrayList<>();
	}

	// Getter y setter para la lista de trabajadores
	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	// Método para agregar un trabajador a la lista
	public void agregarTrabajador(Trabajador trabajador) {
		trabajadores.add(trabajador);
	}

	// Getter y setter para la referencia a Principal
	public Principal getUnnamed_Principal_() {
		return unnamed_Principal_;
	}

	public void setUnnamed_Principal_(Principal unnamed_Principal_) {
		this.unnamed_Principal_ = unnamed_Principal_;
	}
}
