package interfaces1;

public class Socio {

	protected int id;
	protected String nombre;
	protected int edad;
	
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	interface Comparable {
		int[] socioOrden= {0,0};
		int id=1;
		class Orden implements compareTo {
			private int id;
			public void compareTo() {
			if (this.id>=id) {
				socioOrden[0]=this.id;
				socioOrden[1]=id;
			}
			else {
				socioOrden[1]=this.id;
				socioOrden[0]=id;
			}
			}
			
		}
	
		


	}

	public static void Comparable() {
		int[] socioOrden= {0,0};
		class Orden implements compareTo {
			private int id;
			public void compareTo() {
			if (this.id>=id) {
				socioOrden[0]=this.id;
				socioOrden[1]=id;
			}
			else {
				socioOrden[1]=this.id;
				socioOrden[0]=id;
			}
			}
			
		}
		// TODO Auto-generated method stub
		
	}
	
}