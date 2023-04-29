package ejr3;

public class Main {
	public static void main(String[] args) {
		Perecedero producto = new Perecedero("filete", 5.0);	
		double precio = producto.calcular(5);
		System.out.println(precio);
		
		NoPerecedero product = new NoPerecedero("Manzana", 2.0, 5);	
		double precioOtro = product.calcular(5);
		System.out.println(precioOtro);
		
	}
	
}
