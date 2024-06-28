package digital.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int [] segundoLancamento = {10,20,30,40,50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }
}
