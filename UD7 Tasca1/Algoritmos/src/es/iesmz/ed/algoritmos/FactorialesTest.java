package es.iesmz.ed.algoritmos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialesTest {
    @Test
    public void DivisionFactoriales(){
        long test1 = Factoriales.divisionFactoriales(5, 3);
        assertEquals(20, test1);

        long test2 = Factoriales.divisionFactoriales(10, 8);
        assertEquals(90, test2);

        long test3 = Factoriales.divisionFactoriales(4, 6);
        assertEquals(0, test3);

        long test4 = Factoriales.divisionFactoriales(0, 2);
        assertEquals(0, test4);
    }
}