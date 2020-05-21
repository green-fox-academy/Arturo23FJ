package seconds_in_a_day;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsPassed = (currentHours * 3600) + (currentMinutes * 34) + currentSeconds;

        System.out.println(secondsPassed);
        int secondsRemaining = 86400 - secondsPassed;

        System.out.println(secondsRemaining);
    }
}
