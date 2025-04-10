package Ejercicio2;

//Clase que implementa la interfaz operable para los double
public class OperacionesMatDouble implements operable<Double>{
	private Double valor; // Atributo para asignar un double
	public OperacionesMatDouble(Double valor) { //constructor
		this.valor = valor;
	}
	
	@Override
	public Double suma(Double otro) {
		// TODO Auto-generated method stub
		return valor + otro;
	}

	@Override
	public Double resta(Double otro) {
		// TODO Auto-generated method stub
		return valor - otro;
	}

	@Override
	public Double producto(Double otro) {
		// TODO Auto-generated method stub
		return valor * otro;
	}

	@Override
	public Double division(Double otro) {
		// TODO Auto-generated method stub
		return (otro != 0) ? valor / otro : Double.NaN; //retorna un NaN si se divide entre cero
	}
	
}