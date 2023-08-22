import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testDelgadezSevera() {
        double imc = 15;
        String expected = "Delgadez Severa";
        String result = Main.calculateCategory(imc);
        assertEquals(expected, result);
    }

    @Test
    public void testDelgadezModerada() {
        double imc = 16.5;
        String expected = "Delgadez Moderada";
        String result = Main.calculateCategory(imc);
        assertEquals(expected, result);
    }

    @Test
    public void testDelgadezLeve() {
        double imc = 18;
        String expected = "Delgadez Leve";
        String result = Main.calculateCategory(imc);
        assertEquals(expected, result);
    }

    // Agrega más pruebas para las otras categorías

    @Test
    public void testObesidadMorbida() {
        double imc = 45;
        String expected = "Obesidad Morbida";
        String result = Main.calculateCategory(imc);
        assertEquals(expected, result);
    }
}