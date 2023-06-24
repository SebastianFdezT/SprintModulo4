package sprintM4;

import java.util.regex.Matcher;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */

// Clase Capacitación
class Capacitacion {
	private static int contador = 1;
    private int idCapacitacion;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;
  
    // Constructor que no recibe parámetros
    public Capacitacion() {
        // Inicializar atributos
    }

    // Constructor que recibe todos los atributos de la clase como parámetros
    public Capacitacion(int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
    	setIdCapacitacion();
    	setRutCliente(rutCliente);
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setDuracion(duracion);
        setCantidadAsistentes(cantidadAsistentes);
    }

	// Métodos accesores
    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public int getRutCliente() {
        return rutCliente;
    }
    
    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

	// Métodos mutadores
    public void setIdCapacitacion() {
    	this.idCapacitacion = contador;
		contador++;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public void setDia(String dia) {
		if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles")|| dia.equalsIgnoreCase("jueves")|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")|| dia.equalsIgnoreCase("domingo")) {
			this.dia = dia;
		} else {
			throw new IllegalArgumentException("El dia debe ser entre lunes a domingo");
		}
	}

    public void setHora(String hora) {
		Matcher matcher = Accidente.patronHora.matcher(hora);

		if (!matcher.matches()) {
			throw new IllegalArgumentException("Formato de hora invalido. Debe ser HH:MM.");
		} else {
			String soloHora = hora.substring(0, 2);
			String soloMinutos = hora.substring(3, 5);
			
			if (Integer.parseInt(soloHora) > 23 || Integer.parseInt(soloMinutos) > 59) {
				throw new IllegalArgumentException("Formato de hora invalido. Debe ser una hora existente.");
			}
			this.hora = hora;
		}
		
	}

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }
    
	// Implementación del método mostrarDetalle() de la interfaz IAsesoria
	//@Override
    public void mostrarDetalle() {
        System.out.println("La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos");
    }

 // Método toString()
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

    
}