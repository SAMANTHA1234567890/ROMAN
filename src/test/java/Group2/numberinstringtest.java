package Group2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
// import  static  org.assertj.core.api.Assertions;
public class numberinstringtest {

    @Test
    public void TestVide(){
    //given
    String s="";
    numberinstring c= new numberinstring();
    // when
    int num = c.trans(s);
    //then
    assertEquals(0,num,"hello world ");
// assertThat(num).isEqualsTo(null);
    }


    @Test
    public void Test1shar(){
        //given
        String s="1";
        numberinstring c= new numberinstring();
        int ex = 1 ;
        // when
        int num = c.trans(s);
        //then
        assertEquals(ex,num," 2 hello world ");
// assertThat(num).isEqualsTo(null);
    }

    @Test
    public void Test1numbershar(){
        //given
        String s="3";
        numberinstring c= new numberinstring();
        int ex = 3 ; // number li bit teste
        // when
        int num = c.trans(s);
        //then
        assertEquals(ex,num," 3 hello world ");
// assertThat(num).isEqualsTo(null);
    }

    @Test
    public void Testchars(){
        //given
        String s="1,2,4,5,6,3";
        numberinstring c= new numberinstring();
        int ex = 21 ;
        // when
        int num = c.trans(s);
        //then
        assertEquals(ex,num," 4 hello world ");
// assertThat(num).isEqualsTo(null);
    }



}



