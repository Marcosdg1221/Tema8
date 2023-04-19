package ej2;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
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
