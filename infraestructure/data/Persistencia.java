package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import model.Empleado;
import portsout.Reader;

public class Persistencia implements Reader {

	String direccion;// Lugar donde tiene que buscar los empleados

	public Persistencia(String url) {
		Objects.requireNonNull(url);
		this.direccion = url;
	}

	String direccion() {
		return this.direccion;
	}

	@Override
	public ArrayList<Empleado> cargarEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try (BufferedReader br = new BufferedReader(new FileReader(direccion))) {
			String linea;
			while ((linea = br.readLine()) != null) {

				String[] textos = linea.split(", ");
				List<String> datos = new ArrayList<String>();
				for (String texto : textos) {
					datos.add(texto.trim());

				}
				empleados.add(crearEmpleado(datos));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return empleados;
	}

	private Empleado crearEmpleado(List<String> datos) {
		return new Empleado(datos.get(0), datos.get(1), datos.get(2), datos.get(3));
	}

}
