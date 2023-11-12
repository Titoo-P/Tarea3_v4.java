import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {

    Moneda m = null;
    Moneda100 m100 = new Moneda100();
    Moneda500 m500 = new Moneda500();
    Moneda1000 m1000 = new Moneda1000();
    Moneda1500 m1500 = new Moneda1500();


    @Test
    @DisplayName("no hay null?")
    void nohayNull() {
        assertNotEquals(m, m100);
        assertNotEquals(m, m500);
        assertNotEquals(m, m1000);
        assertNotEquals(m, m1500);
    }

    @Test
    @DisplayName("Valor correcto?")
    void valorcorrecto(){
        assertEquals(100, m100.getValor());
        assertEquals(500, m500.getValor());
        assertEquals(1000, m1000.getValor());
        assertEquals(1500, m1500.getValor());
    }
}