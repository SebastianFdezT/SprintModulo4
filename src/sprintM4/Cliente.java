package sprintM4;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */

public class Cliente extends Usuario {
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistemadesalud;
	private String direccion;
	private String comuna;
	private int edad;

	// método de constructor que no reciba parametros

	public Cliente() {
	}

	// método de constructor que reciba parametros

	public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos, String telefono, String afp, int sistemadesalud,
			String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		setRut(rut);
		setNombres(nombres);
		setApellidos(apellidos);
		setTelefono(telefono);
		setAfp(afp);
		setSistemadesalud(sistemadesalud);
		setDireccion(direccion);
		setComuna(comuna);
		setEdad(edad);
	}

	// Métodos accesores y mutadores

	public int getRut() {
		return rut;
	}

	// Metodo de validacion y modificacion para el run
	public void setRut(int rut) {
		if (rut <= 99999999) {
			this.rut = rut;
		} else {
			throw new IllegalArgumentException("El RUT debe ser un número menor a 99.999.999.");
		}
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		if (nombres.length() >= 5 && nombres.length() <= 30) {
			this.nombres = nombres;
		} else {
			throw new IllegalArgumentException("Los nombres deben tener entre 5 y 30 caracteres.");
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidos.length() >= 5 && apellidos.length() <= 30) {
			this.apellidos = apellidos;
		} else {
			throw new IllegalArgumentException("Los apellidos deben tener entre 5 y 30 caracteres.");
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if (telefono.length() >= 1) {
			this.telefono = telefono;
		} else {
			throw new IllegalArgumentException("El telefono es obligatorio, debe tener un largo mayor a 1 caracter.");
		}
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		if (afp.length() >= 4 && afp.length() <= 30) {
			this.afp = afp;
		} else {
			throw new IllegalArgumentException("El AFP debe tener entre 4 y 30 caracteres.");
		}
	}

	public int getSistemadesalud() {
		return sistemadesalud;
	}

	public void setSistemadesalud(int sistemadesalud) {
		if (sistemadesalud == 1 || sistemadesalud == 2) {
			this.sistemadesalud = sistemadesalud;
		} else {
			throw new IllegalArgumentException("El valor de sistema de salud debe ser 1 o 2.");
		}
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		if (direccion.length() <= 70) {
			this.direccion = direccion;
		} else {
			throw new IllegalArgumentException("La direccion debe tener maximo 70 caracteres.");
		}
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		if (comuna.length() <= 50) {
			this.comuna = comuna;
		} else {
			throw new IllegalArgumentException("La comuna debe tener maximo 50 caracteres.");
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0 && edad < 150) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("La edad debe ser mayor o igual a cero y menor a 150.");
		}
	}

	@Override
	public String toString() {
		return "tipo de usuario= Cliente, RUT=" + rut + ", Nombre Completo=" + ObtenerNombre() + ", Telefono=" + telefono
				+ ", AFP=" + afp + ", Sistema de salud (1, fonasa 2, Isapre)=" + obtenerSistemaSalud() + ", Direccion="
				+ direccion + ", Comuna=" + comuna + ", Edad=" + edad + "]";
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println(" Ademas, su direccion es: " + direccion + " y su comuna es: " + comuna);
	}

	public String obtenerSistemaSalud() {
		String sistemaSalud;
		if (sistemadesalud == 1) {
			sistemaSalud = " Fonasa";
		} else if (sistemadesalud == 2) {
			sistemaSalud = " Isapre";
		} else {
			sistemaSalud = " sistema de salud no valido";
		}
		return sistemaSalud;
	}
	
	public String ObtenerNombre() {
		return nombres + " " + apellidos;
	}
}