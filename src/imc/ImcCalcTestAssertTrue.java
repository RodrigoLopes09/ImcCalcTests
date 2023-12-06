package imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcCalcTestAssertTrue {

	@Test
    public void interpretarIMC_abaixoDe185_retornaAbaixoDoPeso() {
        //Altere o valor do IMC para qualquer outro fora do 
		//range da String "Abaixo do peso." para causa a falha.
		double imc = 17.5;
        String interpretação = ImcCalc.interpretarIMC(imc);
        assertTrue(interpretação.equals("Abaixo do peso."));
    }
}
