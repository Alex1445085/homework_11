import java.time.Year;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask #1.");
        checkLeapYear(2022);

        System.out.println("\nTask #2");
        String os = "ios";
        int osYear = 2023;
        checkClientOsAndYear(os, osYear);

        //System.out.println("\nTask #3.");
    }

    public static void checkLeapYear(int year) {
        String prefix;
        if (year >= 1584 && year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            prefix = " ";
        } else {
            prefix = " не";
        }
        System.out.printf("%d -%sвисокосный год.\n", year, prefix);
    }

    public static void checkClientOsAndYear(String os, int year) {
        int currentYear = Year.now().getValue();
        if (os.equalsIgnoreCase("ios")) {
            os = "iOS";
        } else {
            os = "Android";
        }
        String prefix = "обычную";
        if (year < currentYear) {
            prefix = "облегченную";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке\n", prefix, os);
    }
}