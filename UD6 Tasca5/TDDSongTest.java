import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {
    @Test
    public void test1(){
        String resultado=TDDSong.song("");
        String esperado="";
        assertEquals(resultado,esperado);
    }

    @Test
    public void test2(){
        String resultado=TDDSong.song("fly");
        String esperado=TDDSong.fly;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test3(){
        String resultado=TDDSong.song("spider");
        String esperado=TDDSong.spider;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test4(){
        String resultado=TDDSong.song("fly+spider");
        String esperado=TDDSong.fly+TDDSong.spider;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test5(){
        String resultado=TDDSong.song("spider+fly");
        String esperado=TDDSong.spider+TDDSong.fly;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test6(){
        String resultado=TDDSong.song("fly+spider+bird");
        String esperado=TDDSong.fly+TDDSong.spider+TDDSong.bird;
        assertEquals(resultado,esperado);
    }

    @Test
    public void test7(){
        String resultado=TDDSong.song("bird+fly+spider");
        String esperado=TDDSong.bird+TDDSong.fly+TDDSong.spider;
        assertEquals(resultado,esperado);
    }
}