package Ejercicio2;

import java.util.Scanner;


public class Prueba {
	public static void main(String[] args) {
		Scanner Scaner = new Scanner(System.in);
		boolean continuar = true; // bandera para controlar la ejecucion del menu
		System.out.println("Ingrese el tipo de datos (Integer o double): ");
		// Solicita un tipo de dato que se desea usar, integer o double, en caso que sea otro, el codigo dara error
		String tipo = Scaner.next();
		
		// Coindicion para manejar los casos de tipo entero o decimal
		if(tipo.equalsIgnoreCase("Integer")) {
			System.out.println("Ingrese un número entero:\n>>>");
			int num1 = Scaner.nextInt(); // se asigna entero
			OperacionesMatInteger operacion = new OperacionesMatInteger(num1);
            // Llama al método ejecutarMenu pasando el objeto operacion para realizar las operaciones
			ejecutarMenu(Scaner, operacion);
		} else if(tipo.equalsIgnoreCase("Double")) {
			System.out.println("Ingrese un número decimal:\n>>>");
			Double num1 = Scaner.nextDouble(); // se asigna decimal
			OperacionesMatDouble operacion = new OperacionesMatDouble(num1);
            // Llama al método ejecutarMenu pasando el objeto operacion para realizar las operaciones
			ejecutarMenu(Scaner, operacion);			
		}else {
			System.err.println("Tipo de dato no válido.");
            // Si el tipo ingresado no es ni Integer ni Double, se muestra un mensaje de error
			//el err se coloca para lanzar excepciones
			
		}
		//se cierra el objeto Scaner al finalizar la ejecucion
		Scaner.close();
	}
    // Método genérico que maneja el menú de operaciones matemáticas

	private static <O extends operable<N>, N extends Number> void ejecutarMenu(Scanner scanner, O operacion) {
		Scanner Scanner = new Scanner(System.in);
		boolean continuar = true; // Bandera para controlar el ciclo del menú
		int opcion, i; 
		while (continuar) {
			// Se muestra el menu de opciones disponibles mientras se imprime el menu de opciones mediante un iterador
			System.out.println("Menú de operaciones clases genéricas:\n");
			String[] opciones = {"Suma", "Resta", "Producto", "División", "Potencia", "Raíz Cuadrada", "Raiz cubica", "Salir"};
			for (i = 0; i < opciones.length; i++) {
			    System.out.println((i + 1) + ". " + opciones[i]);
			}
			//Solicita al usuario seleccionar una opcion
			System.out.println("Seleccione una opción\n>>>");
			opcion = Scanner.nextInt();
			//Si el usuario le da a "Salir" Termina el programa
			if (opcion == 8){
				System.out.println("Saliendo....");
				continuar = false; //Se cambia la bandera para terminar el bucle
				break;
			}
			System.out.println("Ingrese un número (decimal o entero):\n>>>");
			double valor2 = scanner.nextDouble();
			
	        N num = (operacion instanceof OperacionesMatInteger) ? (N) Integer.valueOf((int) valor2) : (N) Double.valueOf(valor2);
            switch (opcion) {
                case 1 -> System.out.println("Resultado: " + operacion.suma(num));
                case 2 -> System.out.println("Resultado: " + operacion.resta(num));
                case 3 -> System.out.println("Resultado: " + operacion.producto(num));
                case 4 -> {
                	try {
                		System.out.println("Resultado: " + operacion.division(num));
                	} catch(ArithmeticException e) {
                		System.err.println(e.getMessage());
                	}
                }
                case 5 -> System.out.println("Resultado: " + Math.pow(num.doubleValue(), 2));
                case 6 -> {
                    if (num.doubleValue() >= 0)
                        System.out.println("Resultado: " + Math.sqrt(num.doubleValue()));
                    else
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
                }
                case 7 -> System.out.println("Resultado: " + Math.cbrt(num.doubleValue()));
                default -> System.out.println("Opción inválida.");
            }
		}
	}
}