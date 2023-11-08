public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println ( "Вы пользуетесь IOS Установите версию приложения для iOS по ссылке:" );
        } else if (clientOS == 1) {
            System.out.println ( "Вы пользуетесь Android Установите версию приложения для Android по ссылке:" );
        }
        //Задание № 2
        int yearOfRelease = 2012;
        if (clientOS == 0 && yearOfRelease < 2015) {
            System.out.println ( "Установите облегченную версию приложения для iOS по ссылке" );
        } else if (clientOS == 0 && yearOfRelease >= 2015) {
            System.out.println ( "Установите версию приложения для iOS по ссылке" );
        }
        if (clientOS == 1 && yearOfRelease < 2015) {
            System.out.println ( "Установите облегченную версию приложения для android по ссылке" );
        } else if (clientOS == 1 && yearOfRelease >= 2015) {
            System.out.println ( "Установите версию приложения для android по ссылке" );
        }
        //Задание №3
        int year = 1828;
        boolean leapYear = (year > 1584 && (year % 400 == 0)) || (year % 4 == 0 && year % 100 != 0);
        if (leapYear)
            System.out.println ( " год " + year + " высокосный" );
        else System.out.println ( " год " + year + " не  высокосный" );
        //задание № 4
        int deliveryDistance = 10;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println ( " Потребуется дней " + days );
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println ( " Потребуется дней " + (days + 1) );
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println ( " Потребуется дней " + (days + 2) );
        } else System.out.println ( " Доставки нет " );
        //задание № 5
        int mounthNumber = 9;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println ( " Зима " );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println ( " Весна " );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println ( " Лето " );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println ( " Осень " );
                break;
            default:
                System.out.println ( " Такого месяца нет" );
        }
    }
}


