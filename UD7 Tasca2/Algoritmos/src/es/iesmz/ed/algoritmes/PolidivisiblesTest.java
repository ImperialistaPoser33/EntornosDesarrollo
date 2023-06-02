package es.iesmz.ed.algoritmes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolidivisiblesTest {
    @Test
    public void test1(){
        boolean resultado=Polidivisibles.numPoli(381654729);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test2(){
        boolean resultado=Polidivisibles.numPoli(102);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test3(){
        boolean resultado=Polidivisibles.numPoli(9876);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
}