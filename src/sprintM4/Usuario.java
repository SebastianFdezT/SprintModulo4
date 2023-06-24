package sprintM4;

import java.time.LocalDate;
import java.util.regex.Matcher;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */

public class Usuario implements IAsesoria{
	private String nombre;
	private String fechaNacimiento;
	private int run;

//método de constructor que no reciba parametros

	public Usuario() {
	}

	// método de constructor que reciba parametros

	public Usuario(String nombre, String fechaNacimiento, int run) {
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
		setRun(run);
	}

	// Métodos accesores y mutadores

	public String getNombre() {
		return nombre;
	}

	// Metodo de validacion y modificacion para el nombre
	public void setNombre(String nombre) {
		if (nombre.length() >= 10 && nombre.length() <= 50) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres.");
		}
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	// Metodo de validacion y modificacion para la fecha de nacimiento
	public void setFechaNacimiento(String fechaNacimiento) {
		Matcher matcher = Accidente.patronFecha.matcher(fechaNacimiento);

		if (!matcher.matches()) {
			throw new IllegalArgumentException("Formato de fecha invalido. Debe ser DD/MM/AAAA.");
		} else {
			int diaFecha = Integer.parseInt(fechaNacimiento.substring(0, 2));
			int mesFecha = Integer.parseInt(fechaNacimiento.substring(3, 5));
			int añoFecha = Integer.parseInt(fechaNacimiento.substring(6, 10));

			if (diaFecha < 1 || diaFecha > LocalDate.of(añoFecha, mesFecha, 1).lengthOfMonth() || mesFecha < 1
					|| mesFecha > 12) {
				throw new IllegalArgumentException("Formato de fecha invalido. Debe ser una fecha existente.");
			}
			this.fechaNacimiento = fechaNacimiento;
		}
	}

	public int getRun() {
		return run;
	}

	// Metodo de validacion y modificacion para el run
	public void setRun(int run) {
		if (run <= 99999999) {
			this.run = run;
		} else {
			throw new IllegalArgumentException("El RUN debe ser un numero menor a 99.999.999.");
		}
	}

	// Método para imprimir la información cuándo se solicite.

	@Override
	public String toString() {
		return "Usuario [Nombre=" + nombre + ", Fecha de nacimiento=" + fechaNacimiento + ", RUN=" + run + "]";
	}
	
	public String MostrarEdad() {
		int diaFecha = Integer.parseInt(fechaNacimiento.substring(0, 2));
		int mesFecha = Integer.parseInt(fechaNacimiento.substring(3, 5));
		int añoFecha = Integer.parseInt(fechaNacimiento.substring(6, 10));
		
		int edad = LocalDate.now().getYear() - añoFecha;

        // Ajustar la edad si el cumpleaños aún no ha pasado este año
        if (LocalDate.now().getMonthValue() < mesFecha || (LocalDate.now().getMonthValue() == mesFecha && LocalDate.now().getDayOfMonth() < diaFecha)) {
            edad--;
        }
		return "El usuario tiene " + edad + " anios";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.print("El nombre del usuario es: " + nombre + " y su run es: " + run + ".");
	}
}