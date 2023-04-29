package ejr3;

public class NoPerecedero extends Producto {

	@Override
	public String toString() {
		return "tipo es: " + tipo;
	}

	int tipo;

	public NoPerecedero(String nombre, double precio, int tipo) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	//Hace lo mismo que producto
	public double precio(int cantidad) {
		return cantidad * precio;
	}

}