package imc;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class ImcCalcTestassertNull {

   
	@Test
	public void testInterpretIMCNullImc() {
	    // Altere o null para: 25.0 para causar a falha
	    Double imc = null; 

	    String interpretacao = ImcCalc.interpretarIMC(imc);
	    assertNull(interpretacao);
	}
}