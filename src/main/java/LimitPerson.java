public class LimitPerson {

    public static String limitPerson(int numberOfPersons) {
        if (numberOfPersons > 30)
            return "Zu viele Personen";
        else
            return "Maximale Personenanzahl nicht überschritten";
    }
}
