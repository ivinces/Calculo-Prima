
import static org.junit.Assert.*;

import org.junit.Test;

public class PrimaV5Test {
//pruebas de sistema
	@Test
	public void CalculoPrima() {
		PrimaV5.CalculoPrima(17, 25);
		PrimaV5.CalculoPrima(18, 25);
		PrimaV5.CalculoPrima(19, 25);
		PrimaV5.CalculoPrima(-1, 25);
		PrimaV5.CalculoPrima(22, 0);
		PrimaV5.CalculoPrima(22, 30);
		PrimaV5.CalculoPrima(22, -1);
		PrimaV5.CalculoPrima(22, 31);
		PrimaV5.CalculoPrima(22, 29);
		PrimaV5.CalculoPrima(24, 29);
		PrimaV5.CalculoPrima(25, 27);
		PrimaV5.CalculoPrima(26, 26);
		PrimaV5.CalculoPrima(34, 27);
		PrimaV5.CalculoPrima(35, 25);
		
		PrimaV5.CalculoPrima(36, 24);
		PrimaV5.CalculoPrima(20, 29);
		PrimaV5.CalculoPrima(44, 25);
		PrimaV5.CalculoPrima(45, 23);
		PrimaV5.CalculoPrima(46, 22);
		PrimaV5.CalculoPrima(60, 25);
		PrimaV5.CalculoPrima(64, 29);
		PrimaV5.CalculoPrima(65, 26);
		PrimaV5.CalculoPrima(66, 25);
		PrimaV5.CalculoPrima(70, 26);
		PrimaV5.CalculoPrima(10, 20);
		PrimaV5.CalculoPrima(25, 0);
		PrimaV5.CalculoPrima(30, -1);
		PrimaV5.CalculoPrima(70, 27);
		PrimaV5.CalculoPrima(20, 30);
		PrimaV5.CalculoPrima(25, 30);
		
		PrimaV5.CalculoPrima(89, 30);
		PrimaV5.CalculoPrima(90, 30);
		PrimaV5.CalculoPrima(91, 30);
		
		PrimaV5.isNumeric("Hola");
		PrimaV5.isNumeric("2");
		PrimaV5.FactorEdad(100);
		PrimaV5.CalculoRCS(38, 21);
		PrimaV5.CalculoRCS(50, 27);
	}

}
