import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        checkLeapYear(2000);
        checkDevice(1, 2018);
        int distance;
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println("Потребуется n дней: " + deliveryTime);


    }

    {

    }


    public static void checkDevice(int osType, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        int clientOs = 0;
        if (clientOs <= 0) {

            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientOs >= 0) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }


        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " - is a leap year");
                } else {
                    System.out.println(year + " - is not a leap year");
                }
            } else {
                System.out.println(year + " - is a leap year");
            }
        } else {
            System.out.println(year + " - is not a leap year");
        }
    }
    public static int calculateDeliveryTime(int distance) {
        int deliveryTime = 1;
        if (distance > 20) {
            deliveryTime += (distance - 20) / 40;
        }
        return deliveryTime;

    }

}



