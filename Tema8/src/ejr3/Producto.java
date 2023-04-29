package ejr3;

public class Producto {

	
	//Atributos de la clase padre
	String nombre;
	double precio;

	
	/**
	 * Constructor copn parámetros
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	
	/**
	 * Getters y setters
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	/**
	 * Hará un cálculo del precio y cantidad.
	 * @param cantidad
	 * @return
	 */
	public double calcular (int cantidad) {
		return precio*cantidad;
	}
}
