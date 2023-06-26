package sprintM4;

import java.time.LocalDate;
import java.util.regex.Matcher;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */
class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;

	// Constructor que no recibe parámetros
	public Profesional() {
		// Inicializar atributos
	}

	// Constructor que recibe todos los atributos de la clase como parámetros
	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	// Métodos accesores
	public String getTitulo() {
		return titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	// Métodos mutadores
	public void setTitulo(String titulo) {
		if (titulo.length() >= 10 && titulo.length() <= 50) {
			this.titulo = titulo;
		} else {
			throw new IllegalArgumentException("El titulo debe tener entre 10 y 50 caracteres.");
		}
	}

	public void setFechaIngreso(String fechaIngreso) {
		Matcher matcher = Accidente.patronFecha.matcher(fechaIngreso);

		if (!matcher.matches()) {
			throw new IllegalArgumentException("Formato de fecha invalido. Debe ser DD/MM/AAAA.");
		} else {
			int diaFecha = Integer.parseInt(fechaIngreso.substring(0, 2));
			int mesFecha = Integer.parseInt(fechaIngreso.substring(3, 5));
			int añoFecha = Integer.parseInt(fechaIngreso.substring(6, 10));

			if (diaFecha < 1 || diaFecha > LocalDate.of(añoFecha, mesFecha, 1).lengthOfMonth() || mesFecha < 1
					|| mesFecha > 12) {
				throw new IllegalArgumentException("Formato de fecha invalido. Debe ser una fecha existente.");
			}
			this.fechaIngreso = fechaIngreso;
		}
	}
	
	// Implementación del método analizarUsuario() de la interfaz IAsesoria
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo);
		System.out.println("Fecha de ingreso: " + fechaIngreso);
	}

	// Método toString()
	@Override
	public String toString() {
		return "tipo de usuario= Profesional, titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}