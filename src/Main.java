import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
       printIsLeapYear(2022);
        task2();
        recommendApplicationVersion(0,2022);
        task3();
        calculateDeliveryDays(21);

    }
    public static void task1() {
        System.out.println("задача 1");
    }
    public static void printIsLeapYearResult(int year, boolean yerIsLeap) {
        if (yerIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
        }

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void task2(){
        System.out .println("задача 2");
    }
    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
    }
    public static void printSetSystem(int clientDeviceYear, int clientDevice) {
        String vershion = " ";
        if (clientDeviceYear < 2015) {
            vershion = "облегченную";
        }
        String device = " ";
        if (clientDevice == 0) {
            device = "IOS";
        } else if (clientDevice == 1) {
            device = "android";
        }
        System.out.printf("установите %s  версию приложения для %s  по ссылке", vershion, device);
    }
    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }
    public static void task3() {
        System.out.println("Задача 3");
    }
    public static String calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            return "Невозможно расчитать срок доставки";
        }
        return "Потребуется дней: " + deliveryDays;
    }
}