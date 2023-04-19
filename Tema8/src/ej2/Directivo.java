package ej2;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String result = super.toString() + " -> Directivo"; //Llamas al to string del padre
		result += getNombre();
		System.out.println(getNombre());
		return result;
	}
}
