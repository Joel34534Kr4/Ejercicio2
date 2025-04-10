package Ejercicio2;
//Clase que implementa la interfaz operable para los enteros
public class OperacionesMatInteger implements operable<Integer>{
	private int valor; // atributo para asignar un entero
	public OperacionesMatInteger(int valor) { //metodo constructor
		this.valor = valor;
	}
	@Override
	public Integer suma(Integer otro) {
		// TODO Auto-generated method stub
		return valor + otro;
	}

	@Override
	public Integer resta(Integer otro) {
		// TODO Auto-generated method stub
		return valor - otro;
	}

	@Override
	public Integer producto(Integer otro) {
		// TODO Auto-generated method stub
		return valor * otro;
	}

	@Override
	public Integer division(Integer otro) {
		// TODO Auto-generated method stub
		if (otro == 0) {
		    throw new ArithmeticException("No se puede dividir entre cero");// lanza una excepcion aritmetica si se divide entre cero
		}
		return valor / otro;
	}
	

}