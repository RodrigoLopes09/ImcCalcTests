package imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcCalcTestArrayEquals {

	@Test
	public void interpretationIsCorrect() {
	    //Altere o valor do IMC por um número superior a 19
		//para gerar a falha.
		double imc = 20;
	    
	    String expectedInterpretation = "Abaixo do peso.";
	    String actualInterpretation = ImcCalc.interpretarIMC(imc);

	    assertEquals(expectedInterpretation, actualInterpretation);
	}

}