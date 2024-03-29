package model;

import java.util.ArrayList;

import portsin.SaludarCumpleanios;
import portsout.Reader;

public class Servicio implements Reader {

	private SaludarCumpleanios cumpleaņos;
	private Reader archivo;

	public Servicio(SaludarCumpleanios cumple) {
		this.cumpleaņos = cumple;
	}

	public void saludar() {
		cumpleaņos.SaludarEmpleados();
	}

	@Override
	public ArrayList<Empleado> cargarEmpleados() {
		return archivo.cargarEmpleados();
	}

}
