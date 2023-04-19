package ej4;

public class Lavadora extends Electrodomestico {

	private int base;
	private String color = "Gris";
	private char consumo = 'f';
	private int peso;
	private int carga;

	/**
	 * @param base
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Lavadora(int base, String color, char consumo, int peso, int carga) {
		super(carga, color, consumo, peso);
		this.base = base;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		this.carga = carga;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void precioFinal() {
		
		}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
