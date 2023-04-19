package ej1;

class HoraExacta extends Hora{
	int segundo;
	public HoraExacta (int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo=segundo;
	}
	
	public void setSegundo(int valor) {
		if (segundo>-1 & segundo<60) {
		this.segundo=1;
		}
	}
	
	void inc() {
		segundo++;
	}

	
}