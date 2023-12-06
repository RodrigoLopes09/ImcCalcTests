package imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcCalcTestAssertFalse {

	  @Test
	    public void interpretarIMC_abaixoDe185_naoRetornaAcimaDoPeso() {
	        double imc = 17.5;
	        String interpretação = ImcCalc.interpretarIMC(imc);
	        //Altere a String para "Abaixo do peso." para gerar a falha.
	        assertFalse(interpretação.equals("Acima do peso."));
	    }

}
