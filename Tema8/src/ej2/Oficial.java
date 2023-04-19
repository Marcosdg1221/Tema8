package ej2;

public class Oficial extends Operario{


	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String result = "";
		result += getNombre();
		System.out.println(getNombre());
		return result;
	}
}
