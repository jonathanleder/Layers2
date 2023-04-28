package model;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {

	private String apellido;
	private String nombre;
	private String fecha;
	private String email;

	public Empleado(String apellido, String nombre, String fechaNacimiento, String email) {
		Objects.requireNonNull(apellido);
		Objects.requireNonNull(nombre);
		Objects.requireNonNull(fechaNacimiento);
		Objects.requireNonNull(email);

		if (apellido.isBlank())
			new RuntimeException("Debe ingresar un apellido valido");
		if (nombre.isBlank())
			new RuntimeException("Debe ingresar un nombre valido");
		if (email.isBlank())
			new RuntimeException("Debe ingresar un email valido");
		this.apellido = apellido;
		this.nombre = nombre;
		this.fecha = fechaNacimiento;
		this.email = email;
	}

	boolean cumplehoy() {
		return this.fecha.equals(LocalDate.now().toString());
	}

}
