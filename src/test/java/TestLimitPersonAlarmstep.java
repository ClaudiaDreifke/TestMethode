import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLimitPersonAlarmstep {

    @Test
    void testLimitPersonAlarmstep_0_red() {

        // given
        int numberOfPersons = 0;
        String Alarmstep = "red";

        // when
        int actual = LimitPersonAlarmstep.limitPersonAlarmstep(numberOfPersons, Alarmstep);

        // then
        Assertions.assertEquals(0, actual);
    }

    @Test
    void testLimitPersonAlarmstep_1_red() {

        // given
        int numberOfPersons = 1;
        String Alarmstep = "red";

        // when
        int actual = LimitPersonAlarmstep.limitPersonAlarmstep(numberOfPersons, Alarmstep);

        // then
        Assertions.assertEquals(1, actual);
    }


    @Test
    void testLimitPersonAlarmstep_30_yellow() {

        // given
        int numberOfPersons = 30;
        String Alarmstep = "yellow";

        // when
        int actual = LimitPersonAlarmstep.limitPersonAlarmstep(numberOfPersons, Alarmstep);

        // then
        Assertions.assertEquals(0, actual);
    }

    @Test
    void testLimitPersonAlarmstep_31_yellow() {

        // given
        int numberOfPersons = 31;
        String Alarmstep = "yellow";

        // when
        int actual = LimitPersonAlarmstep.limitPersonAlarmstep(numberOfPersons, Alarmstep);

        // then
        Assertions.assertEquals(1, actual);
    }

    @Test
    void testLimitPersonAlarmstep_60_green() {

        // given
        int numberOfPersons = 60;
        String Alarmstep = "green";

        // when
        int actual = LimitPersonAlarmstep.limitPersonAlarmstep(numberOfPersons, Alarmstep);

        // then
        Assertions.assertEquals(0, actual);
    }

    @Test
    void testLimitPersonAlarmstep_61_green() {

        // given
        int numberOfPersons = 61;
        String Alarmstep = "green";

        // when
        int actual = LimitPersonAlarmstep.limitPersonAlarmstep(numberOfPersons, Alarmstep);

        // then
        Assertions.assertEquals(1, actual);
    }
}



