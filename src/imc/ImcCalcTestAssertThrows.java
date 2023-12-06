package imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcCalcTestAssertThrows {

	@Test
	public void exceptionIsThrownForNegativeWeight() {
	    // Lançar uma altura negativa para ver se o throws será lançado
	    double peso = 70;
	    double altura =  -1.80;
	    
	    assertThrows(IllegalArgumentException.class, () -> ImcCalc.calcularIMC(peso, altura));
	}


}
