import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class CuadernoTest {
    private Cuaderno cuaderno;
    private Hoja hoja1;
    private Hoja hoja2;

    @BeforeEach
    public void setUp() {
        cuaderno = new Cuaderno("Mi Cuaderno");
        hoja1 = new Hoja(3, 150, cuaderno);
        hoja2 = new Hoja(5, 300, cuaderno);
    }

    @Test
    public void agregarHojas() {
        cuaderno.agregarHojas(hoja1);
        assertTrue(cuaderno.getHojas().contains(hoja1));
    }

    @Test
    public void quitarHojas() {
        cuaderno.agregarHojas(hoja1);
        cuaderno.quitarHojas(hoja1);
        assertFalse(cuaderno.getHojas().contains(hoja1));
    }

    @Test
    public void modificarHojas() {
        cuaderno.agregarHojas(hoja1);
        cuaderno.modificarHojas(0, hoja2);
        assertEquals(hoja2, cuaderno.getHojas().get(0));
    }

    @Test
    public void mostrarHojas() {
        cuaderno.agregarHojas(hoja1);
        cuaderno.agregarHojas(hoja2);
        assertDoesNotThrow(() -> cuaderno.mostrarhojas());
    }
}
