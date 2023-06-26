package sprintM4;

import java.util.Scanner;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */
public class Principal {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor(); // Crear instancia de la clase Contenedor
        Scanner scanner = new Scanner(System.in);
      
        
        // Menú principal
		
        boolean inputValid = false;
		while (!inputValid) {
			System.out.println("===== Menú Principal =====");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2") || input.equalsIgnoreCase("3") 
						|| input.equalsIgnoreCase("4") || input.equalsIgnoreCase("5") || input.equalsIgnoreCase("6")
						|| input.equalsIgnoreCase("7") || input.equalsIgnoreCase("8")|| input.equalsIgnoreCase("9")) {
					switch (input.charAt(0)) {
	                case '1':
	                    contenedor.AlmacenarCliente();
	                    break;
	                case '2':
	                    contenedor.AlmacenarProfesional();
	                    break;
	                case '3':
	                    contenedor.AlmacenarAdministrativo();
	                    break;
	                case '4':
	                    contenedor.AlmacenarCapacitacion();
	                    break;
	                case '5':
	                    contenedor.EliminarUsuario();
	                    break;
	                case '6':
	                    contenedor.ListarUsuarios();
	                    break;
	                case '7':
	                    contenedor.ListarUsuariosPorTipo();
	                    break;
	                case '8':
	                    contenedor.ListarCapacitaciones();
	                    break;
	                case '9':
	                    System.out.println("Saliendo del programa...");
	                    inputValid = true;
	                    break;     
	                default:
	                    System.out.println("Opción inválida. Intente nuevamente.");
	                    break;
	            }
				} else {
						System.out.println("Debe ser una de las opciones del menú");
					}
			} else {
				System.out.println("Debe ser una de las opciones del menú");
			}
		}
	
		 scanner.close();	
		
    }
}
		
//        while (opcion != 9) {
//        	opcion = 0;
//            System.out.println("===== Menú Principal =====");
//            System.out.println("1. Almacenar Cliente");
//            System.out.println("2. Almacenar Profesional");
//            System.out.println("3. Almacenar Administrativo");
//            System.out.println("4. Almacenar Capacitación");
//            System.out.println("5. Eliminar Usuario");
//            System.out.println("6. Listar Usuarios");
//            System.out.println("7. Listar Usuarios por Tipo");
//            System.out.println("8. Listar Capacitaciones");
//            System.out.println("9. Salir");
//            System.out.print("Ingrese una opcion: ");
//            opcion = scanner.nextInt();
//            scanner.nextLine();          
//            switch (opcion) {
//                case 1:
//                    contenedor.AlmacenarCliente();
//                    break;
//                case 2:
//                    contenedor.AlmacenarProfesional();
//                    break;
//                case 3:
//                    contenedor.AlmacenarAdministrativo();
//                    break;
//                case 4:
//                    contenedor.AlmacenarCapacitacion();
//                    break;
//                case 5:
//                    contenedor.EliminarUsuario();
//                    break;
//                case 6:
//                    contenedor.ListarUsuarios();
//                    break;
//                case 7:
//                    contenedor.ListarUsuariosPorTipo();
//                    break;
//                case 8:
//                    contenedor.ListarCapacitaciones();
//                    break;
//                case 9:
//                    System.out.println("Saliendo del programa...");
//                    break;
//                default:
//                    System.out.println("Opción inválida. Intente nuevamente.");
//                    break;
//            }
//     
//    		scanner.close();	
//    		
//        }
//    }
  
        
