package sprintM4;

import java.time.LocalDate;
import java.util.regex.Matcher;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */
public class VisitaTerreno {
	private static int contador = 1;
	private int idVisitaTerreno;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	public VisitaTerreno(int rutCliente, String dia, String hora, String lugar,
			String comentarios) {
		setIdVisitaTerreno();
		setRutCliente(rutCliente);
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [idVisitaTerreno=" + idVisitaTerreno + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}

	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setIdVisitaTerreno() {
		this.idVisitaTerreno = contador;
		contador++;
	}

	public void setRutCliente(int rutCliente) {
		if (rutCliente <= 99999999) {
			this.rutCliente = rutCliente;
		} else {
			throw new IllegalArgumentException("El RUT debe ser un numero menor a 99.999.999.");
		}
	}

	public void setDia(String dia) {
		Matcher matcher = Accidente.patronFecha.matcher(dia);

		if (!matcher.matches()) {
			throw new IllegalArgumentException("Formato de fecha invalido. Debe ser DD/MM/AAAA.");
		} else {
			String diaFecha = dia.substring(0, 2);
			String mesFecha = dia.substring(3, 5);
			String añoFecha = dia.substring(6, 10);
			
			if (Integer.parseInt(diaFecha) < 1
					|| Integer.parseInt(diaFecha) > LocalDate
							.of(Integer.parseInt(añoFecha), Integer.parseInt(mesFecha), 1).lengthOfMonth()
					|| Integer.parseInt(mesFecha) < 1 || Integer.parseInt(mesFecha) > 12) {
				throw new IllegalArgumentException("Formato de fecha invalido. Debe ser una fecha existente.");
			}
			this.dia = dia;
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
				throw new IllegalArgumentException("Formato de fecha invalido. Debe ser una hora existente.");
			}
			this.hora = hora;
		}
		
	}

	public void setLugar(String lugar) {
		if (lugar.length() <= 10 || lugar.length() >= 50) {
			throw new IllegalArgumentException("La longitud de la variable no cumple con los requisitos.");
		}
		this.lugar = lugar;
	}

	public void setComentarios(String comentarios) {
		if (comentarios.length() >= 50) {
			throw new IllegalArgumentException("La longitud de la variable no cumple con los requisitos.");
		}
		this.comentarios = comentarios;
	}
}