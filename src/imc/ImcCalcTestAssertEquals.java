package imc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ImcCalcTestAssertEquals {

    @Test
    public void testInterpretarIMC() {
        // Altere o valor do IMC para fora do range do
    	// peso normal, ou altere a propria String para
    	// qualquer outra para gerar a falha.
        double imc = 22.5;
        String interpretacao = ImcCalc.interpretarIMC(imc);
        assertEquals("Peso normal.", interpretacao);
    }
}
