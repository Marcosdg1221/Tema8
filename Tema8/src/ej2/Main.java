package ej2;

public class Main {

	//Getsuperclass name y su subclase; todas las clases tendrán que llamar el nombre del padre.
	
	public static void main(String[] args) {
		Empleado e = new Empleado("Rafa");
		Empleado d = new Directivo("Mario");
		Empleado op = new Operario("Alfonso");
		Empleado of = new Oficial("Luis");
		Empleado t = new Tecnico("Pablo");
		System.out.println(e);
		System.out.println(d);
		System.out.println(op);
		System.out.println(of);
		System.out.println(t);
	}
}