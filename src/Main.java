import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        // Задание 1
        isYearLeap(2024);
        // Задание 2
        isVersionCorrect(1, 2022);
    }
    public static void isYearLeap(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void isVersionCorrect(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear == currentYear && clientOS == 1) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear == currentYear && clientOS == 0) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        }
    }
}