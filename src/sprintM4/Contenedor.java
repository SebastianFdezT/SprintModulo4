package sprintM4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */
public class Contenedor {

	private List<IAsesoria> usuarios = new ArrayList<IAsesoria>();
	private List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
	Scanner scanner = new Scanner(System.in);

	
	/**
	 * /Aca comienza Opcion 1
	 * AlmacenarCliente
	 */
	
	public void AlmacenarCliente() {
		
		/*
		 * A continuacion se solicitan los datos del cliente para crear la instancia.
		 */
		System.out.print("Ingrese el nombre del usuario: ");
		String nombre = scanner.nextLine();
		while (nombre.length() < 10 || nombre.length() > 50) {
			System.out.println("El nombre debe tener entre 10 y 50 caracteres.");
			System.out.print("Ingrese el nombre del usuario: ");
			nombre = scanner.nextLine();
		}

		System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
		String fechaNacimiento = scanner.nextLine();
		boolean inputValid = false;
		while (!inputValid) {
			if (!fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("Formato de fecha inválido. Debe ser DD/MM/AAAA.");
			} else {
				int diaFecha = Integer.parseInt(fechaNacimiento.substring(0, 2));
				int mesFecha = Integer.parseInt(fechaNacimiento.substring(3, 5));
				int añoFecha = Integer.parseInt(fechaNacimiento.substring(6, 10));

				if (diaFecha < 1 || mesFecha < 1 || diaFecha > 31 || mesFecha > 12) {
					System.out.println("Fecha inválida. Debe ser una fecha existente.");
				} else {
					try {
						LocalDate.of(añoFecha, mesFecha, diaFecha); // Verificar si la fecha es válida
						inputValid = true;
					} catch (DateTimeException e) {
						System.out.println("Fecha inválida. Debe ser una fecha existente.");
					}
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
				fechaNacimiento = scanner.nextLine();
			}
		}

	


		inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el run (menor a 99.999.999): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					run = Integer.parseInt(input);
					if (run <= 99999999) {
						inputValid = true;
					} else {
						System.out.println("el run debe ser menor a 99.999.999: ");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}

		
		inputValid = false;
		int rut = 0;
		while (!inputValid) {
			System.out.print("Ingrese el rut del cliente (menor a 99.999.999): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					rut = Integer.parseInt(input);
					if (rut <= 99999999) {
						inputValid = true;
					} else {
						System.out.println("el rut debe ser menor a 99.999.999: ");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}

		System.out.print("Ingrese el nombre del cliente: ");
		String nombres = scanner.nextLine();
		while (nombres.length() < 5 || nombres.length() > 30) {
			System.out.println("Los nombres deben tener entre 5 y 30 caracteres.");
			System.out.print("Ingrese el nombre del cliente: ");
			nombres = scanner.nextLine();
		}

		System.out.print("Ingrese el apellido del cliente: ");
		String apellidos = scanner.nextLine();
		while (apellidos.length() < 5 || apellidos.length() > 30) {
			System.out.println("Los apellidos deben tener entre 5 y 30 caracteres.");
			System.out.print("Ingrese el apellido del cliente: ");
			apellidos = scanner.nextLine();
		}

		System.out.print("Ingrese el teléfono del cliente: ");
		String telefono = scanner.nextLine();
		while (telefono.isEmpty()) {
			System.out.println("El teléfono es obligatorio.");
			System.out.print("Ingrese el teléfono del cliente: ");
			telefono = scanner.nextLine();
		}

		System.out.print("Ingrese la afp del cliente: ");
		String afp = scanner.nextLine();
		while (afp.length() < 4 || afp.length() > 30) {
			System.out.println("La afp debe tener entre 4 y 30 caracteres.");
			System.out.print("Ingrese afp del cliente: ");
			afp = scanner.nextLine();
		}

		inputValid = false;
		int sistemadesalud = 0;
		while (!inputValid) {
			System.out.print("Ingrese el sistema de salud del cliente (1:fonasa, 2:isapre): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					sistemadesalud = Integer.parseInt(input);
					if (sistemadesalud == 1 || sistemadesalud == 2) {
						inputValid = true;
					} else {
						System.out.println("Ingrese un valor válido (1 o 2).");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}

		System.out.print("Ingrese la direccion del cliente: ");
		String direccion = scanner.nextLine();
		while (direccion.length() < 0 || direccion.length() > 70) {
			System.out.println("La direccion del cliente debe tener maximo 70 caracteres.");
			System.out.print("Ingrese la direccion del cliente: ");
			direccion = scanner.nextLine();
		}

		System.out.print("Ingrese la comuna del cliente: ");
		String comuna = scanner.nextLine();
		while (comuna.length() < 0 || comuna.length() > 50) {
			System.out.println("La comuna del cliente debe tener maximo 50 caracteres.");
			System.out.print("Ingrese la comuna del cliente: ");
			comuna = scanner.nextLine();
		}


		inputValid = false;
		int edad = 0;
		while (!inputValid) {
			System.out.print("Ingrese la edad del cliente(mayor o igual a cero y menor a 150): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					edad = Integer.parseInt(input);
					if (edad < 150) {
						inputValid = true;
					} else {
						System.out.println("La edad debe ser mayor o igual a cero y menor a 150.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}
		
		// Crear una instancia de Cliente y agregarlo a la lista de asesorías
		Cliente cliente = new Cliente(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp,
				sistemadesalud, direccion, comuna, edad);
		usuarios.add(cliente);

		System.out.println("Cliente almacenado exitosamente.");
		
		/*
		 * A continuacion se solicitan los datos de la visita en terreno para crear la instancia.
		 */
		System.out.println("Agendaremos una visita en terreno.");
		
		System.out.print("Ingrese el día del accidente (DD/MM/AAAA): ");
		String dia = scanner.nextLine();
		inputValid = false;
		while (!inputValid) {
			if (!dia.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("Formato de fecha inválido. Debe ser DD/MM/AAAA.");
			} else {
				int diaFecha = Integer.parseInt(dia.substring(0, 2));
				int mesFecha = Integer.parseInt(dia.substring(3, 5));
				int añoFecha = Integer.parseInt(dia.substring(6, 10));

				if (diaFecha < 1 || mesFecha < 1 || diaFecha > 31 || mesFecha > 12) {
					System.out.println("Fecha inválida. Debe ser una fecha existente.");
				} else {
					try {
						LocalDate.of(añoFecha, mesFecha, diaFecha); // Verificar si la fecha es válida
						inputValid = true;
					} catch (DateTimeException e) {
						System.out.println("Fecha inválida. Debe ser una fecha existente.");
					}
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
				dia = scanner.nextLine();
			}
		}
		
		System.out.print("Ingrese la hora de la visita en terreno (HH:MM): ");
		String hora = scanner.nextLine();
		inputValid = false;
		while (!inputValid) {
			if (!hora.matches("\\d{2}:\\d{2}")) {
				System.out.println("Formato de hora inválido. Debe ser HH:MM.");
			} else {
				int horas = Integer.parseInt(hora.substring(0, 2));
				int minutos = Integer.parseInt(hora.substring(3, 5));

				if (horas < 0 || horas > 23 || minutos > 59 || minutos < 0) {
					System.out.println("hora inválida. Debe ser una hora existente.");
				} else {
					inputValid = true;
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la hora de la visita en terreno(HH:MM): ");
				hora = scanner.nextLine();
			}
		}
		
		System.out.print("Ingrese el lugar de la visita en terreno: ");
		String lugar = scanner.nextLine();
		while (lugar.length() < 10 || lugar.length() > 50) {
			System.out.println("El lugar de la visita debe tener minimo 10 caracteres y maximo 50 caracteres.");
			System.out.print("Ingrese el lugar de la visita en terreno: ");
			lugar = scanner.nextLine();
		}
		
		System.out.print("Ingrese algún comentario sobre la visita en terreno: ");
		String comentarios = scanner.nextLine();
		while (comentarios.length() < 0 || comentarios.length() > 100) {
			System.out.println("El comentario debe tener maximo 100 caracteres.");
			System.out.print("Ingrese algún comentario sobre la visita en terreno: ");
			comentarios = scanner.nextLine();
		}
		
		VisitaTerreno visita = new VisitaTerreno(rut, dia, hora, lugar, comentarios);
		System.out.println(visita.toString());
		
		/*
		 * A continuacion se solicitan los datos de la revision para crear la instancia.
		 */
		System.out.println("Agendaremos una revision.");
		
		System.out.print("Ingrese el nombre alusivo a la revision: ");
		String nombreRevision = scanner.nextLine();
		while (nombreRevision.length() < 10 || nombreRevision.length() > 50) {
			System.out.println("El nombre alusivo a la revision debe tener minimo 10 y maximo 50 caracteres.");
			System.out.print("Ingrese el nombre alusivo a la revision: ");
			nombreRevision = scanner.nextLine();
		}
		
		System.out.print("Ingrese el detalle de la revision: ");
		String detalle = scanner.nextLine();
		while (detalle.length() < 0 || detalle.length() > 100) {
			System.out.println("El detalle de la revision debe tener maximo 100 caracteres.");
			System.out.print("Ingrese el detalle de la revision: ");
			detalle = scanner.nextLine();
		}
		
		inputValid = false;
		int estado = 0;
		while (!inputValid) {
			System.out.print("Ingrese el estado de la revision (1:Sin problemas, 2:Con observaciones, 3:No aprueba): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					estado = Integer.parseInt(input);
					if (estado == 1 || estado == 2 || estado == 3) {
						inputValid = true;
					} else {
						System.out.println("Ingrese un valor válido (1, 2 o 3).");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}
		
		Revision revision = new Revision(visita.getIdVisitaTerreno(), nombreRevision, detalle, estado);
		System.out.println(revision.toString());
	}

	
	/**
	 * /Aca comienza Opcion 2
	 * AlmacenarProfesional
	 */
	
	public void AlmacenarProfesional() {
		
		System.out.print("Ingrese el nombre del usuario: ");
		String nombre = scanner.nextLine();
		while (nombre.length() < 10 || nombre.length() > 50) {
			System.out.println("El nombre debe tener entre 10 y 50 caracteres.");
			System.out.print("Ingrese el nombre del usuario: ");
			nombre = scanner.nextLine();
		}

		System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
		String fechaNacimiento = scanner.nextLine();
		boolean inputValid = false;
		while (!inputValid) {
			if (!fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("Formato de fecha inválido. Debe ser DD/MM/AAAA.");
			} else {
				int diaFecha = Integer.parseInt(fechaNacimiento.substring(0, 2));
				int mesFecha = Integer.parseInt(fechaNacimiento.substring(3, 5));
				int añoFecha = Integer.parseInt(fechaNacimiento.substring(6, 10));

				if (diaFecha < 1 || mesFecha < 1 || diaFecha > 31 || mesFecha > 12) {
					System.out.println("Fecha inválida. Debe ser una fecha existente.");
				} else {
					try {
						LocalDate.of(añoFecha, mesFecha, diaFecha); // Verificar si la fecha es válida
						inputValid = true;
					} catch (DateTimeException e) {
						System.out.println("Fecha inválida. Debe ser una fecha existente.");
					}
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
				fechaNacimiento = scanner.nextLine();
			}
		}

	


		inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el run (menor a 99.999.999): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					run = Integer.parseInt(input);
					if (run <= 99999999) {
						inputValid = true;
					} else {
						System.out.println("el run debe ser menor a 99.999.999: ");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}
		
		System.out.print("Ingrese el titulo: ");
		String titulo = scanner.nextLine();
		while (titulo.length() < 10 || titulo.length() > 50) {
			System.out.println("El titulo debe tener entre 10 y 50 caracteres.");
			System.out.print("Ingrese el titulo del usuario: ");
			titulo = scanner.nextLine();
		}

		System.out.print("Ingrese la fecha de ingreso (DD/MM/AAAA): ");
		String fechaIngreso = scanner.nextLine();
		inputValid = false;
		while (!inputValid) {
			if (!fechaIngreso.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("Formato de fecha inválido. Debe ser DD/MM/AAAA.");
			} else {
				int diaFecha = Integer.parseInt(fechaIngreso.substring(0, 2));
				int mesFecha = Integer.parseInt(fechaIngreso.substring(3, 5));
				int añoFecha = Integer.parseInt(fechaIngreso.substring(6, 10));

				if (diaFecha < 1 || mesFecha < 1 || diaFecha > 31 || mesFecha > 12) {
					System.out.println("Fecha inválida. Debe ser una fecha existente.");
				} else {
					try {
						LocalDate.of(añoFecha, mesFecha, diaFecha); // Verificar si la fecha es válida
						inputValid = true;
					} catch (DateTimeException e) {
						System.out.println("Fecha inválida. Debe ser una fecha existente.");
					}
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la fecha de ingreso (DD/MM/AAAA): ");
				fechaIngreso = scanner.nextLine();
			}
		}
		
		// Crear una instancia de Profesional y agregarlo a la lista de asesorías
		Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
		usuarios.add(profesional);

		System.out.println("Profesional almacenado exitosamente.");
	}


	/**
	 * /Aca comienza Opcion 3
	 * AlmacenarAdministrativo
	 */
	
	public void AlmacenarAdministrativo() {
		
		System.out.print("Ingrese el nombre del usuario: ");
		String nombre = scanner.nextLine();
		while (nombre.length() < 10 || nombre.length() > 50) {
			System.out.println("El nombre debe tener entre 10 y 50 caracteres.");
			System.out.print("Ingrese el nombre del usuario: ");
			nombre = scanner.nextLine();
		}

		System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
		String fechaNacimiento = scanner.nextLine();
		boolean inputValid = false;
		while (!inputValid) {
			if (!fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}")) {
				System.out.println("Formato de fecha inválido. Debe ser DD/MM/AAAA.");
			} else {
				int diaFecha = Integer.parseInt(fechaNacimiento.substring(0, 2));
				int mesFecha = Integer.parseInt(fechaNacimiento.substring(3, 5));
				int añoFecha = Integer.parseInt(fechaNacimiento.substring(6, 10));

				if (diaFecha < 1 || mesFecha < 1 || diaFecha > 31 || mesFecha > 12) {
					System.out.println("Fecha inválida. Debe ser una fecha existente.");
				} else {
					try {
						LocalDate.of(añoFecha, mesFecha, diaFecha); // Verificar si la fecha es válida
						inputValid = true;
					} catch (DateTimeException e) {
						System.out.println("Fecha inválida. Debe ser una fecha existente.");
					}
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
				fechaNacimiento = scanner.nextLine();
			}
		}

	
		inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el run (menor a 99.999.999): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					run = Integer.parseInt(input);
					if (run <= 99999999) {
						inputValid = true;
					} else {
						System.out.println("el run debe ser menor a 99.999.999: ");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}
		
		System.out.print("Ingrese el area: ");
		String area = scanner.nextLine();
		while (area.length() < 5 || area.length() > 20) {
			System.out.println("El area debe tener entre 5 y 20 caracteres.");
			System.out.print("Ingrese el area:  ");
			area = scanner.nextLine();
		}
		
		System.out.print("Ingrese la experiencia previa: ");
		String experienciaPrevia = scanner.nextLine();
		while (experienciaPrevia.length() < 0 || experienciaPrevia.length() > 100) {
			System.out.println("La experiencia previa debe tener maximo 100 caracteres.");
			System.out.print("Ingrese la experiencia previa: ");
			experienciaPrevia = scanner.nextLine();
		}

		// Crear una instancia de Administrativo y agregarlo a la lista de asesorías
		Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);
		usuarios.add(administrativo);

		System.out.println("Administrativo almacenado exitosamente.");
	}

	
	/**
	 * /Aca comienza Opcion 4
	 * AlmacenarCapacitacion
	 */
	
	public void AlmacenarCapacitacion() {
		
		boolean inputValid = false;
		int rut = 0;
		while (!inputValid) {
			System.out.print("Ingrese el rut del cliente: ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					rut = Integer.parseInt(input);
					if (rut <= 99999999) {
						inputValid = true;
					} else {
						System.out.println("el rut debe ser menor a 99.999.999: ");
					}
				} catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero válido.");
				}
			} else {
				System.out.println("Ingrese un valor entero válido.");
			}
		}

		
		System.out.print("Ingrese el día: ");
		String dia = scanner.nextLine();
		while (!dia.equalsIgnoreCase("lunes") && !dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miércoles") && !dia.equalsIgnoreCase("jueves")
				&& !dia.equalsIgnoreCase("viernes") && !dia.equalsIgnoreCase("sábado") && !dia.equalsIgnoreCase("domingo") && !dia.equalsIgnoreCase("sabado") && !dia.equalsIgnoreCase("miercoles")) {
			System.out.println("Ingrese un día válido (lunes a domingo).");
			System.out.print("Ingrese el día: ");
			dia = scanner.nextLine();
		}

		System.out.print("Ingrese la hora de la capacitacion (HH:MM): ");
		String hora = scanner.nextLine();
		inputValid = false;
		while (!inputValid) {
			if (!hora.matches("\\d{2}:\\d{2}")) {
				System.out.println("Formato de hora inválido. Debe ser HH:MM.");
			} else {
				int horas = Integer.parseInt(hora.substring(0, 2));
				int minutos = Integer.parseInt(hora.substring(3, 5));

				if (horas < 0 || horas > 23 || minutos > 59 || minutos < 0) {
					System.out.println("hora inválida. Debe ser una hora existente.");
				} else {
					inputValid = true;
				}
			}
			if (!inputValid) {
				System.out.print("Ingrese la hora de la capacitacion (HH:MM): ");
				hora = scanner.nextLine();
			}
		}
		

		System.out.print("Ingrese el lugar(tener entre 10 y 50 caracteres.): ");
		String lugar = scanner.nextLine();
		while (lugar.length() < 10 || lugar.length() > 50) {
			System.out.println("El lugar debe tener entre 10 y 50 caracteres.");
			System.out.print("Ingrese el lugar(tener entre 10 y 50 caracteres.): ");
			lugar = scanner.nextLine();
		}

		System.out.print("Ingrese la duracion(maximo 70 caracteres.): ");
		String duracion = scanner.nextLine();
		while (duracion.length() < 0 || duracion.length() > 70) {
		System.out.println("La duracion debe tener maximo 70 caracteres.");
		System.out.print("Ingrese la duracion(maximo 70 caracteres.): ");
		duracion = scanner.nextLine();
	}

		
		inputValid = false;
		int cantidadAsistentes = 0;
		while (!inputValid) {
			System.out.print("Ingrese la cantidad de asistentes(mayor a 0 y menor a 1000): ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				try {
					cantidadAsistentes = Integer.parseInt(input);
					if (cantidadAsistentes <= 1000 && cantidadAsistentes > 0) {
						inputValid = true;
					} else {
						System.out.println("la cantidad de asistentes debe ser mayor a 0 y menor a 1000");
					}
				} catch (NumberFormatException e) {
					System.out.println("la cantidad de asistentes debe ser mayor a 0 y menor a 1000:  ");
				}
			} else {
				System.out.println("la cantidad de asistentes debe ser mayor a 0 y menor a 1000");
			}
		}
		


		
		// Crear una instancia de Capacitación y agregarla a la lista de capacitaciones
		Capacitacion capacitacion = new Capacitacion(rut, dia, hora, lugar, duracion, cantidadAsistentes);
		capacitaciones.add(capacitacion);

		System.out.println("Capacitación almacenada exitosamente.");
	}

	/**
	 * /Aca comienza Opcion 5
	 * EliminarUsuario
	 */
	
	public void EliminarUsuario() {
//		try (// Leer el RUN del usuario a eliminar desde el teclado
//				Scanner scanner = new Scanner(System.in)) {
		
		boolean inputValid = false;
		int run = 0;
		while (!inputValid) {
			System.out.print("Ingrese el RUN del usuario a eliminar: ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) 
			{
				try { 
				     run = Integer.parseInt(input);
				     inputValid = true;
				     } 
				     catch (NumberFormatException e) { 
				     System.out.println("Ingrese un valor entero válido."); 
				    }
			} else {
				System.out.println("Debe ingresar un RUN");
			}
			}

	// Buscar y eliminar el usuario de la lista de asesorías
	for(

	IAsesoria asesoria:usuarios)
	{
		if (asesoria instanceof Usuario) {
			Usuario usuario = (Usuario) asesoria;
			if (usuario.getRun() == run) {
				usuarios.remove(asesoria);
				System.out.println("Usuario eliminado exitosamente.");
				return;
			}
		}
	}

	System.out.println("No se encontró un usuario con el RUN especificado.");
	}


	
	/**
	 * /Aca comienza Opcion 6
	 * ListarUsuarios
	 */
	
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

	/**
	 * /Aca comienza Opcion 7
	 * ListarUsuariosPorTipo
	 */
	
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

	
	/**
	 * /Aca comienza Opcion 8
	 * ListarCapacitaciones
	 */
	
	
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