package TOURN;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class personntest {

    @Test
    public void test1(){
        String EX="EST";
        String RE = Personnage. tourner(5);
        assertEquals(EX, RE, "WE Gonna See");

    }




}
