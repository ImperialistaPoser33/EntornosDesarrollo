package es.iesmz.ed.algoritmes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaDescTest {
    @Test
    public void test1(){
        long resultado=SumaDesc.suma(4578);
        long esperado=5242;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test2(){
        long resultado=SumaDesc.suma(5555);
        long esperado=6170;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test3(){
        long resultado=SumaDesc.suma(162348);
        long esperado=227448;
        assertEquals(resultado,esperado);
    }
}