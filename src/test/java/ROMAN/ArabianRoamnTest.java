package ROMAN;
import java.util.ArrayList;
 import java.util.Collections;
import java.util.List;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabianRoamnTest {

    @Test
    public void test1(){
    List <String> EX = Collections.singletonList("I");
    List <String> RE = ArabianRoman.transfer(1);
   // AssertThat(RE).isEqualTo(EX);
    assertEquals(EX, RE, "hope");
    }
    @Test
    public void test2(){
        List <String> EX = Collections.singletonList("II");
        List <String> RE = ArabianRoman.transfer(2);
        // AssertThat(RE).isEqualTo(EX);
        assertEquals(EX, RE, "hope");
    }
    @Test
    public void test3(){
        List <String> EX = Collections.singletonList("III");
        List <String> RE = ArabianRoman.transfer(3);
        // AssertThat(RE).isEqualTo(EX);
        assertEquals(EX, RE, "hope");
    }

    @Test
    public void test4(){
        List <String> EX = new ArrayList<>();
                EX.add("X");
                EX.add("X");
                EX.add("X");
                EX.add("I");
                EX.add("X");

        List <String> RE = ArabianRoman.transfer(39);
        // AssertThat(RE).isEqualTo(EX);
      assertEquals(EX, RE, "There is no problem");
      //  AssertThat(RE).isEqualTo(EX);

    }
}
