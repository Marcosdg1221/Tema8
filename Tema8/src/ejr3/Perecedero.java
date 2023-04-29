package ejr3;

public class Perecedero extends Producto {

	public Perecedero(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dias a caducar=" + diasACaducar;
	}

	int diasACaducar;

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	
	
	//Esto hará que el producto valga más o menos dependiendo de su fecha de caducidad.
	public double calcular(int cantidad) {
		double calculacion = cantidad * precio;
		switch (diasACaducar) {
		case 1:
			calculacion /= 4;
			break;
		case 2:
			calculacion /= 3;
			break;
		case 3:
			calculacion /= 2;
			break;
		}
		return calculacion;
	}

}
