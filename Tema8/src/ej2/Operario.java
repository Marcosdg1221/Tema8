package ej2;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		String result = super.toString() + " -> Operario"; //Llamas al to string del padre
		result += getNombre();
		System.out.println(getNombre());
		return result;
	}
}
