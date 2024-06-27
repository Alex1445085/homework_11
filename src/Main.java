import java.time.Year;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask #1.");
        checkLeapYear(2022);

        System.out.println("\nTask #2");
        String os = "ios";
        int osYear = 2023;
        checkClientOsAndYear(os, osYear);

        System.out.println("\nTask #3.");
        int distanceToDelivery = 95;
        int deliveryDays = calculateDeliveryDays(distanceToDelivery);
        if (deliveryDays > 0) {
            System.out.print("Доставка займёт " + deliveryDays);
            if (deliveryDays == 1) {
                System.out.println(" день");
            } else {
                System.out.println(" дня");
            }
        } else {
            System.out.println("Доставки нет.");
        }
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

    public static int calculateDeliveryDays(int distance) {
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        if (distance > 100 || distance < 0) {
            days = 0;
        }
        return days;
    }
}