package model;

import java.util.ArrayList;

import portsin.SaludarCumpleanios;
import portsout.Reader;

public class Servicio implements Reader {

	private SaludarCumpleanios cumpleaños;
	private Reader archivo;

	public Servicio(SaludarCumpleanios cumple) {
		this.cumpleaños = cumple;
	}

	public void saludar() {
		cumpleaños.SaludarEmpleados();
	}

	@Override
	public ArrayList<Empleado> cargarEmpleados() {
		return archivo.cargarEmpleados();
	}

}
