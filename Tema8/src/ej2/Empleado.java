package ej2;

public class Empleado {

	private String nombre;

	/**
	 * 
	 * @param nombre
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Empleado p = new Empleado("Rafa");
		Empleado d = new Directivo("Mario");
		Empleado op = new Operario("Alfonso");
		Empleado of = new Oficial("Luis");
		Empleado t = new Tecnico("Pablo");
		System.out.println(p);
		System.out.println(d);
		System.out.println(op);
		System.out.println(of);
		System.out.println(t);
	}
	
	// Consiste en obtener "Empleado", y luego el nombre, y luego su
	// ocupación (subclase de la superclase "empleado"

	@Override
	public String toString() {
		System.out.println("Empleado ");
		String result = "";
		result += nombre;
		System.out.println(nombre + " -> ");
		result += (Directivo.class);
		return result;
	}

}
