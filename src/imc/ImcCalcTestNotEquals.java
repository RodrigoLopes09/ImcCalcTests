package imc;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ImcCalcTestNotEquals {

    @Test
    public void testInterpretarIMC() {
        double imc = 22.5;
        String interpretacao = ImcCalc.interpretarIMC(imc);

        // Altere a String para "Peso normal." para falhar o teste.
        assertNotEquals(interpretacao,"Acima do Peso." );
    }
}
