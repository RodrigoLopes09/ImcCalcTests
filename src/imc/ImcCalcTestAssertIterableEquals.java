package imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcCalcTestAssertIterableEquals {

	@Test
	public void interpretationIsCorrect() {
		//Retire qualquer valor de qualquer uma das listas para causar a falha.
	    double[] imcValues = {17.5, 22.5, 27.5, 32.5, 37.5, 42.5};
	    String[] expectedInterpretations = {"Abaixo do peso.", "Peso normal.", "Sobrepeso.", "Obesidade grau I.", "Obesidade grau II.", "Obesidade grau III."};

	    for (int i = 0; i < imcValues.length; i++) {
	        String actualInterpretation = ImcCalc.interpretarIMC(imcValues[i]);
	        assertEquals(expectedInterpretations[i], actualInterpretation);
	    }
	}
}
