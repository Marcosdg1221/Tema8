package ej4;

public class Electrodomestico {
	private int base;
	private String color = "Gris";
	private char consumo = 'f';
	private int peso;
	private int carga;

	public static void main(String[] args) {
		Electrodomestico Lavadora = new Electrodomestico(0, "", ' ', 0);
	}

	public Electrodomestico(int base, String color, char consumo, int peso) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.consumo = consumo;
		this.base = base;
		this.peso = peso;
	}

	public void ComprobarConsumoEnergetico(char consumo) { // Comprueba si letra correcta
		if (consumo == 'a' || consumo == 'b' || consumo == 'c' || consumo == 'd' || consumo == 'e' || consumo == 'f') {
			this.consumo = consumo;
		} else {
			this.consumo = 'f';
			consumo = 'f';
		}
	}

	public void comprobarColor(String color) {
		if (color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
			this.color = color;
		} else {
			this.color = "blanco";
			color = "blanco";
		}
	}

	public void precioFinal() {
		switch (consumo) {

		case 'a':
			base += 100;
			break;
		case 'b':
			base += 80;
			break;
		case 'c':
			base += 60;
			break;
		case 'd':
			base += 50;
			break;
		case 'e':
			base += 10;
			break;
		}
	
		if (peso>-1 && peso<20) {
			base+=10;
		}
		else if (peso>19 && peso<50) {
			base+=50;
		}
		else if (peso>49 && peso<79) {
			base+=50;
		}
		else {
			base+=100;
		}
		

	}
	
	
	public Electrodomestico(int base, int peso) {

	}

	public Electrodomestico() {

	}
}
