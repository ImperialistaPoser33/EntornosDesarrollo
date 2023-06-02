package es.iesmz.ed.algoritmes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CableadoTest {
    @Test
    public void test1(){
        boolean resultado=Cableado.ordenar("HM");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test2(){
        boolean resultado=Cableado.ordenar("HH");
        boolean esperado=false;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test3(){
        boolean resultado=Cableado.ordenar("MH+HM");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test4(){
        boolean resultado=Cableado.ordenar("HM+HH+MM");
        boolean esperado=true;
        assertEquals(resultado,esperado);
    }
}