package model;

import java.util.ArrayList;

import portsin.SaludarCumpleanios;
import portsout.Reader;

public class Servicio implements Reader {

	private SaludarCumpleanios cumplea�os;
	private Reader archivo;

	public Servicio(SaludarCumpleanios cumple) {
		this.cumplea�os = cumple;
	}

	public void saludar() {
		cumplea�os.SaludarEmpleados();
	}

	@Override
	public ArrayList<Empleado> cargarEmpleados() {
		return archivo.cargarEmpleados();
	}

}
