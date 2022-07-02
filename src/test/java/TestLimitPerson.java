import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLimitPerson {
    @Test
    void testLimitPerson31() {
        // given
        int numberOfPersons = 31;

        // when
        String Actual = LimitPerson.limitPerson(numberOfPersons);

        // then
        String Alarm = "Zu viele Personen";
        Assertions.assertEquals(Actual, Alarm);
    }

    @Test
    void testLimitPerson30() {

        // given
        int numberOfPersons = 30;

        // when
        String Actual = LimitPerson.limitPerson(numberOfPersons);

        // then
        String Alarm = "Maximale Personenanzahl nicht überschritten";
        Assertions.assertEquals(Actual, Alarm);

    }
}

