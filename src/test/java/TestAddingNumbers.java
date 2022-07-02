import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAddingNumbers {

    @Test
     void test1(){
        // given

        int number1 = 2;
        int number2 = 3;

        // when
        int actual = AddingNumbers.addingNumbers(number1, number2);

        // then
        Assertions.assertEquals(actual,5);
    }
    @Test
    void test2(){
        // given

        int number1 = 7;
        int number2 = 9;

        // when
        int actual = AddingNumbers.addingNumbers(number1, number2);

        // then
        Assertions.assertEquals(actual,16);
    }
}
