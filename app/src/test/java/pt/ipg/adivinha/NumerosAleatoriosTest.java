package pt.ipg.adivinha;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class NumerosAleatoriosTest {
    @Test
    public void numerosaleatoriosCorretos() {

        for (int i = 0; i < 1000000; i++) {
            int n = NumeroAleatorio.proximoNumero();
            assertTrue(n >= 0 && n <= 10);
        }
    }
}