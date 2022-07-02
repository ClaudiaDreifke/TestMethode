import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGreater100 {

    @Test
    void test1(){
        // given
        int number = 101;
        // when
        boolean actual = Greater100.greater100(number);
        // then
        Assertions.assertEquals(actual, true);
    }
    @Test

    void test2(){
        // given
        int number = 100;
        // when
        boolean actual = Greater100.greater100(number);
        // then
        Assertions.assertEquals(actual, false);
    }
}

