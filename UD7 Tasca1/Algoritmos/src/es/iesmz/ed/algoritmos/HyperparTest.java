package es.iesmz.ed.algoritmos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    public void test1(){
        boolean resultado=Hyperpar.comprobarHyper(2468);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test2(){
        boolean resultado=Hyperpar.comprobarHyper(246884624);
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test3(){
        boolean resultado=Hyperpar.comprobarHyper(2156484);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test4(){
        boolean resultado=Hyperpar.comprobarHyper(13);
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }
}