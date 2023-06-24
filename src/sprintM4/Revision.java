package sprintM4;

public class Revision {
	private static int contador = 1;
	private int idRevision;
	private int idVisitaTerreno;
	private String nombre;
	private String detalle;
	private int estado;

	public Revision() {
	}

	public Revision(int idVisitaTerreno, String nombre, String detalle, int estado) {
		setIdRevision();
		
		//setIdVisitaTerreno(idVisitaTerreno);
		this.idVisitaTerreno = idVisitaTerreno;
		
		setNombre(nombre);
		setDetalle(detalle);
		setEstado(estado);
	}

	public int getIdRevision() {
		return idRevision;
	}

	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setIdRevision() {
		this.idRevision = contador;
		contador++;
	}

	public void setNombre(String nombre) {
		if (nombre.length() >= 10 && nombre.length() <= 50) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("Error: El nombre debe tener entre 10 y 50 caracteres.");
		}
	}

	public void setDetalle(String detalle) {
		if (detalle.length() <= 100) {
			this.detalle = detalle;
		} else {
			throw new IllegalArgumentException("Error: El detalle no puede tener más de 100 caracteres.");
		}
	}

	public void setEstado(int estado) {
		if (estado >= 1 && estado <= 3) {
			this.estado = estado;
		} else {
			throw new IllegalArgumentException(
					"Error: El estado debe ser 1 (sin problemas), 2 (con observaciones) o 3 (no aprueba).");

		}
	}

	@Override
	public String toString() {
		return "Revisión [idRevision=" + idRevision + ", idVisitaTerreno=" + idVisitaTerreno + ", nombre=" + nombre
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}
}