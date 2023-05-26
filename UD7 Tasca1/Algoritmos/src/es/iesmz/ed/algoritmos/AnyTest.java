package es.iesmz.ed.algoritmos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnyTest {
    @Test
    public void test1(){
        boolean resultado=Any.comprobarAny(2018);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test2(){
        boolean resultado=Any.comprobarAny(2031);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test3(){
        boolean resultado=Any.comprobarAny(2032);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test4(){
        boolean resultado=Any.comprobarAny(2033);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
}