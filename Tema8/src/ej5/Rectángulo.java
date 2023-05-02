package ej5;

public class Rectángulo extends Polígono {

	/**
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 */
	public Rectángulo(String numeroLados, double lado1, double lado2) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}


	@Override
	public String toString() {
		return "Rectángulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}


	private double lado1;
	private double lado2;
	
	public double getLado1() {
		return lado1;
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

	
	public Rectángulo(String numeroLados) {
		super(numeroLados);
		// TODO Auto-generated constructor stub
	}
	
	
}
