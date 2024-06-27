public class Main {
    public static void main(String[] args) {

        System.out.println("Task #1.");
        checkLeapYear(2022);
    }

    public static void checkLeapYear(int year) {
        String prefix;
        if (year >= 1584 && year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            prefix = " ";
        } else {
            prefix = " не";
        }
        System.out.printf("%d -%sвисокосный год.", year, prefix);
    }
}