package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int days;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println(days);
    }

    private boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4,
        // unless it is also divisible by 100, in which case
        // it is only a leap year if it is also divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
