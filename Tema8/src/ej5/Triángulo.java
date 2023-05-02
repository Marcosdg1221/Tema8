package ej5;

public class Triángulo extends Polígono{
	
	public double getLado1() {
		return lado1;
	}

	@Override
	public String toString() {
		return "Triángulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	private double lado1;
	/**
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triángulo(String numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	private double lado2;
	private double lado3;
	
	public Triángulo(String numeroLados) {
		super(numeroLados);
		// TODO Auto-generated constructor stub
	}
}
