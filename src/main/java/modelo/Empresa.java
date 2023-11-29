package modelo;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Trabajador> trabajadores;

	public Empresa() {
		this.trabajadores = new ArrayList<>();
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public void agregarTrabajador(Trabajador trabajador) {
		trabajadores.add(trabajador);
	}
}
