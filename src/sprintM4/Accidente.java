package sprintM4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */
public class Accidente {
	private static int contador = 1;
	private int idAccidente;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	static Pattern patronFecha = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
	static Pattern patronHora = Pattern.compile("\\d{2}:\\d{2}");

	public Accidente() {
	}

	public Accidente(int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
		setIdAccidente();
		setRutCliente(rutCliente);
		setDia(dia);
		setHora(hora);
		setLugar(lugar);
		setOrigen(origen);
		setConsecuencias(consecuencias);
	}

	@Override
	public String toString() {
		return "Accidente [identificadorAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias
				+ "]";
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente() {
		this.idAccidente = contador;
		contador++;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		if (rutCliente <= 99999999) {
			this.rutCliente = rutCliente;
		} else {
			throw new IllegalArgumentException("El RUT debe ser un numero menor a 99.999.999.");
		}
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		Matcher matcher = patronFecha.matcher(dia);

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

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		Matcher matcher = patronHora.matcher(hora);
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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		if (lugar.length() <= 10 || lugar.length() >= 50) {
			throw new IllegalArgumentException("La longitud de la variable no cumple con los requisitos.");
		}
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		if (origen.length() >= 100) {
			throw new IllegalArgumentException("La longitud de la variable no cumple con los requisitos.");
		}
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		if (consecuencias.length() >= 100) {
			throw new IllegalArgumentException("La longitud de la variable no cumple con los requisitos.");
		}
		this.consecuencias = consecuencias;
	}
}