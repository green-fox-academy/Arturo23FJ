package coding_hours;

public class CodingHours {
    public static void main(String[] args) {
        int dailyHours = 6;
        int weeks = 17;
        int weekDays = 5;

        int hoursSpentWithCoding = (dailyHours * weekDays) * weeks;
        System.out.println("The hours spent with coding during the semester: " + hoursSpentWithCoding);

        int weeklyWorkHours = 52;
        int totalWorkHours = weeks * weeklyWorkHours;
        double percentage = (hoursSpentWithCoding / (double) totalWorkHours) * 100;
        System.out.println("The average percentage of coding hours in the semester: " + percentage);
    }
}
