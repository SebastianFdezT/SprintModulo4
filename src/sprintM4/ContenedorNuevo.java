package sprintM4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContenedorNuevo {
	
	private List<IAsesoria> usuarios = new ArrayList<IAsesoria>();
	private List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
	Scanner scanner = new Scanner(System.in);

	public void AlmacenarCliente() {

		System.out.print("Ingrese el nombre del usuario(entre 10 y 50 caracteres): ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese la fecha de nacimiento(dd/mm/aaaa): ");
		String fechaNacimiento = scanner.nextLine();
		
		boolean inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el run(menor a 99.999.999): ");
			if (scanner.hasNextInt()) {
				run = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
//		System.out.print("Ingrese el run: ");
//		int run = scanner.nextInt();
//		scanner.nextLine();
		
		inputValid = false;
		int rut = 0;
		while (!inputValid) {
			System.out.print("Ingrese el rut del cliente(menor a 99.999.999): ");
			if (scanner.hasNextInt()) {
				rut = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
		
//		System.out.print("Ingrese el rut del cliente: ");
//		int rut = scanner.nextInt();
//		scanner.nextLine();
		
		System.out.print("Ingrese el nombre del cliente(entre 5 y 30 caracteres): ");
		String nombres = scanner.nextLine();
		System.out.print("Ingrese el apellido del cliente(entre 5 y 30 caracteres): ");
		String apellidos = scanner.nextLine();
		System.out.print("Ingrese el telefono del cliente: ");
		String telefono = scanner.nextLine();
		System.out.print("Ingrese la afp del cliente(entre 4 y 30 caracteres): ");
		String afp = scanner.nextLine();
		
		inputValid = false;
		int sistemadesalud = 0;
		while (!inputValid) {
			System.out.print("Ingrese el sistema de salud del cliente (1:fonasa, 2:isapre): ");
			if (scanner.hasNextInt()) {
				sistemadesalud = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				if (sistemadesalud == 1 || sistemadesalud == 2) {
                    inputValid = true;
                } else {
                    System.out.println("Ingrese un valor válido (1 o 2).");
                }
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
		
//		System.out.print("Ingrese el sistema de salud del cliente (1:fonasa, 2:isapre): ");
//		int sistemadesalud = scanner.nextInt();
//		scanner.nextLine();
		
		System.out.print("Ingrese la direccion del cliente(menor a 70 caracteres): ");
		String direccion = scanner.nextLine();
		System.out.print("Ingrese la comuna del cliente(menor a 50 caracteres): ");
		String comuna = scanner.nextLine();
		
		inputValid = false;
		int edad = 0;
		while (!inputValid) {
			System.out.print("Ingrese la edad del cliente: ");
			if (scanner.hasNextInt()) {
				edad = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
		
//		System.out.print("Ingrese la edad del cliente: ");
//		int edad = scanner.nextInt();
//		scanner.nextLine();

		// String direccion, String comuna, int edad

		// Leer los demás atributos del cliente...

		// Crear una instancia de Cliente y agregarlo a la lista de asesorías
		Cliente cliente = new Cliente(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp,
				sistemadesalud, direccion, comuna, edad);
		usuarios.add(cliente);

		System.out.println("Cliente almacenado exitosamente.");
	}

	public void AlmacenarProfesional() {
		System.out.print("Ingrese el nombre del usuario(entre 10 y 50 caracteres): ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese la fecha de nacimiento(dd/mm/aaaa): ");
		String fechaNacimiento = scanner.nextLine();
		
		boolean inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el run(menor a 99.999.999): ");
			if (scanner.hasNextInt()) {
				run = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
//		System.out.print("Ingrese el run: ");
//		int run = scanner.nextInt();
//		scanner.nextLine();
		
		System.out.print("Ingrese el titulo(entre 10 y 50 caracteres): ");
		String titulo = scanner.nextLine();
		System.out.print("Ingrese la fecha de ingreso(dd/mm/aaaa): ");
		String fechaIngreso = scanner.nextLine();
		
		// Leer los demás atributos del profesional...

		// Crear una instancia de Profesional y agregarlo a la lista de asesorías
		Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
		usuarios.add(profesional);

		System.out.println("Profesional almacenado exitosamente.");
	}

	public void AlmacenarAdministrativo() {

		System.out.print("Ingrese el nombre del usuario(entre 10 y 50 caracteres): ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese la fecha de nacimiento(dd/mm/aaaa): ");
		String fechaNacimiento = scanner.nextLine();
		
		boolean inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el run(menor a 99.999.999): ");
			if (scanner.hasNextInt()) {
				run = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
//		System.out.print("Ingrese el run: ");
//		int run = scanner.nextInt();
//		scanner.nextLine();
		
		System.out.print("Ingrese el area(entre 5 y 20 caracteres): ");
		String area = scanner.nextLine();
		System.out.print("Ingrese la experiencia previa(entre 0 y 100 caracteres): ");
		String experienciaPrevia = scanner.nextLine();

		// Leer los demás atributos del administrativo...

		// Crear una instancia de Administrativo y agregarlo a la lista de asesorías
		Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);
		usuarios.add(administrativo);

		System.out.println("Administrativo almacenado exitosamente.");
	}

	public void AlmacenarCapacitacion() {
		
		boolean inputValid = false;
		int rutCliente = 0;
		while (!inputValid) {
			System.out.print("Ingrese el Rut del Cliente: ");
			if (scanner.hasNextInt()) {
				rutCliente = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
//		System.out.print("Ingrese el Rut del Cliente: ");
//		int rutCliente = scanner.nextInt();
//		scanner.nextLine();
		
		System.out.print("Ingrese el dia: ");
		String dia = scanner.nextLine();
		System.out.print("Ingrese la hora: ");
		String hora = scanner.nextLine();
		System.out.print("Ingrese el lugar: ");
		String lugar = scanner.nextLine();
		System.out.print("Ingrese la duracion: ");
		String duracion = scanner.nextLine();
		
		inputValid = false;
		int cantidadAsistentes = 0;
		while (!inputValid) {
			System.out.print("Ingrese la cantidad de asistentes: ");
			if (scanner.hasNextInt()) {
				cantidadAsistentes = scanner.nextInt();
				scanner.nextLine(); // Para consumir el salto de línea después del entero
				inputValid = true;
			} else {
				System.out.println("Ingrese un valor entero valido.");
				scanner.nextLine(); // Para descartar la entrada no válida
			}
		}
//		System.out.print("Ingrese la cantidad de asistentes: ");
//		int cantidadAsistentes = scanner.nextInt();
//		scanner.nextLine();
		
		// Leer los demás atributos de la capacitación...

		// Crear una instancia de Capacitación y agregarla a la lista de capacitaciones
		Capacitacion capacitacion = new Capacitacion(rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
		capacitaciones.add(capacitacion);

		System.out.println("Capacitación almacenada exitosamente.");
	}

	public void EliminarUsuario() {
		try (// Leer el RUN del usuario a eliminar desde el teclado
				Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el RUN del usuario a eliminar: ");
			int run = scanner.nextInt();

			// Buscar y eliminar el usuario de la lista de asesorías
			for (IAsesoria asesoria : usuarios) {
				if (asesoria instanceof Usuario) {
					Usuario usuario = (Usuario) asesoria;
					if (usuario.getRun() == run) {
						usuarios.remove(asesoria);
						System.out.println("Usuario eliminado exitosamente.");
						return;
					}
				}
			}
		}
		System.out.println("No se encontró un usuario con el RUN especificado.");
	}

	public void ListarUsuarios() {
		System.out.println("===== Lista de Usuarios =====");
		for (IAsesoria asesoria : usuarios) {
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				System.out.print("Usuario [Nombre=" + usuario.getNombre() + ", Fecha de nacimiento="
						+ usuario.getFechaNacimiento() + ", RUN=" + usuario.getRun() + ", ");
				System.out.println(usuario);
			}
		}
	}
	


	public void ListarUsuariosPorTipo() {

		System.out.print("Ingrese el tipo de usuario (cliente, administrativo o profesional): ");
		String tipoUsuario = scanner.nextLine();

		System.out.println("===== Lista de Usuarios - " + tipoUsuario + " =====");
		for (IAsesoria asesoria : usuarios) {
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				if (usuario.getClass().getSimpleName().equalsIgnoreCase(tipoUsuario)) {
					System.out.print("Usuario [Nombre=" + usuario.getNombre() + ", Fecha de nacimiento="
							+ usuario.getFechaNacimiento() + ", RUN=" + usuario.getRun() + ", ");
					System.out.println(usuario);
				}
			}
		}

	}
	
	public void ListarCapacitaciones() {
		for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion.toString());

			for (IAsesoria asesoria : usuarios) {
				if (asesoria instanceof Cliente) {
					Cliente cliente = (Cliente) asesoria;
					if (capacitacion.getRutCliente() == cliente.getRut()) {
						System.out.println(cliente.toString());
					}
				}
			}

		}

	}
}