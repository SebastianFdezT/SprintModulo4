package sprintM4;

/**
 * 
 * @author Grupo 6: Sabina Leal, Juan Barrientos, Manuel Chavez, Sebastian
 *         Fernandez
 *
 */

class Administrativo extends Usuario {
	private String area;
	private String experienciaPrevia;

	// Constructor que no recibe parámetros
	public Administrativo() {
		// Inicializar atributos
	}

	// Constructor que recibe todos los atributos de la clase como parámetros
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	// Métodos accesores
	public String getArea() {
		return area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	//Métodos mutadores
	public void setArea(String area) {
		if (area.length() >= 5 && area.length() <= 20) {
			this.area = area;
		} else {
			throw new IllegalArgumentException("El area debe tener entre 5 y 20 caracteres.");
		}
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		if (experienciaPrevia.length() >= 0 && experienciaPrevia.length() <= 100) {
			this.experienciaPrevia = experienciaPrevia;
		} else {
			throw new IllegalArgumentException("La experiencia previa debe tener entre 5 y 20 caracteres.");
		}
	}

	// Implementación del método analizarUsuario() de la interfaz IAsesoria
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: " + area);
		System.out.println("Experiencia previa: " + experienciaPrevia);
	}

	// Método toString()
	@Override
	public String toString() {
		return "tipo de usuario= Administrativo, area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
}