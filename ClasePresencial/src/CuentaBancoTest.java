import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancoTest {
    @Test

    public void testRetirar(){
        CuentaBanco cuenta = new CuentaBanco(1500,"abc123");
        int resultado = cuenta.retirar(500, "abc123");
        assertEquals("Fallo en la retirada", 1000, resultado);
    }
}
