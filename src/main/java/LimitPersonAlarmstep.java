public class LimitPersonAlarmstep {

    public static int limitPersonAlarmstep(int numberOfPersons, String Alarmstep) {

        int alarmOn = 1;
        int alarmOff = 0;

        switch (Alarmstep) {
            case "red":
                if (numberOfPersons > 0) {
                    System.out.println("Die Maximale Personenanzahl ist überschritten!");
                    return alarmOn;
                } else
                    return alarmOff;

            case "yellow":
                if (numberOfPersons > 30) {
                    System.out.println("Die Maximale Personenanzahl ist überschritten!");
                    return alarmOn;
                } else
                    return alarmOff;

            case "green":
                if (numberOfPersons > 60) {
                    System.out.println("Die Maximale Personenanzahl ist überschritten!");
                    return alarmOn;
                } else
                    return alarmOff;

            default:
                return alarmOff;
        }
    }
}
