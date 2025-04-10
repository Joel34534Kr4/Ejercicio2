package Ejercicio2;

//Interfaz operable que define los métodos de operaciones matemáticas genéricas.
public interface operable <E>{
	E suma(E otro);
	E resta(E otro);
	E producto(E otro);
	E division(E otro);
}
