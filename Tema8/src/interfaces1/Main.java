package interfaces1;


public class Main {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	protected int id;
	protected String nombre;
	protected int edad;
	public Main(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Socio socio = new Socio(1,"Juan", 1);
		Socio.Comparable();

	}
	
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
