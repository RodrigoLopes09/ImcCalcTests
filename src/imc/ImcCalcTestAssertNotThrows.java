package imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcCalcTestAssertNotThrows {

	@Test
	public void exceptionIsNotThrownForPositiveWeight() {
	    // Lançar um peso negativo para falhar o teste
	    double peso = 70;
	    double altura = 1.80;

	    assertDoesNotThrow(() -> ImcCalc.calcularIMC(peso, altura));
	}


}
/*Essa declaração de assertiva tenta calcular o IMC com um peso positivo.
  Se o código lançar uma exceção, o teste falhará.*/
 