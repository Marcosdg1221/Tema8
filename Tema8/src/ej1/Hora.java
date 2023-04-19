package ej1;

public class Hora {
	// public static void main (String[] args) {}

	private int hora;
	private int minuto;

	public static void main(String[] args) {
		Hora HoraExacta = new HoraExacta(2, 0, 10);
		System.out.println(HoraExacta);

	}

	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	void inc() {
		minuto++;
	}

	public boolean setMinutos(int valor) {
		if (minuto < 0 | minuto > 59) {
			return false;
		} else {
			return true;
		}
	}

	public boolean settHora(int valor) {
		if (hora < 0 | hora > 23) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		String result = "";
		result += hora + "\n";
		result += minuto;
		return result;
	}
}