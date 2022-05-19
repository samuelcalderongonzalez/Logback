package nttdatacenters.nttdatacenters;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Main App
 * 
 * @author Samuel Calderón Gonzlaéz
 *
 */
public class App {
	/**
	 * Instancia del logger
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * Método Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("***** INICIO *****");
		int[] array = new int[5];
		ArrayList<Integer> arrayPrimos = new ArrayList<Integer>();

		// Meto 5 números enteros aleatorios en un array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);

			for (int j = 2; j < array[i]; j++) {
				if (array[i] % j == 0) {
					LOG.info("El #" + (i + 1) + " número, " + array[i] + ", no es primo");
					break;
				} else if (j == array[i] - 1) {
					LOG.info("El #" + (i + 1) + " número, " + array[i] + ", es primo");
					// Añado los primos a una colección
					arrayPrimos.add(array[i]);
				}
			}
		}
		//Si el arraylist no está vacío, lo imprimo
		if (!arrayPrimos.isEmpty()) {
			LOG.info("Primos:");
			for (int j = 0; j < arrayPrimos.size(); j++) {
				LOG.info(arrayPrimos.get(j).toString());
			}
		//Si está vacío, lanzo un mensaje
		} else {
			LOG.warn("No existen números primos");
		}

		LOG.info("***** FIN *****");
	}
}
