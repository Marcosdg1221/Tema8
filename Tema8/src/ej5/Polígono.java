package ej5;

public abstract class Polígono {

	int numeroLados;
	
	public static void main(String[] args) {
		Polígono r = new Rectángulo("rectangulo",2, 4);
		System.out.println(r + "Tiene dos lados, es un rectángulo");
		
		Polígono t = new Triángulo("triangulo",2, 2, 1);
		System.out.println(t + "Tiene tres lados, es un triángulo");
		

	}
	
	public Polígono(String numeroLados) {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public void area() {
		
		
		
	}

	@Override
	public String toString() {
		return "Número de lados ; " + numeroLados;
	}
	
	
	
}