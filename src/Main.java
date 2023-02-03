public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 (){
        System.out.println(" Задача 1 ");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1){
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }
        task2();
    }
    public static void task2 (){
        System.out.println(" Задача 2 ");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear<2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear>=2015){
            System.out.println(" Установите обычную версию приложения для iOS по ссылке ");
        }
        if (clientOS == 1 && clientDeviceYear<2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear>=2015){
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        }
        task3();
    }
    public static void task3 (){
        System.out.println(" Задача 3 ");
        int year = 400;
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println( + year +" год является високосным ");
        } else {
            System.out.println( + year +" год неявляется високосным ");
        }
        task4();
    }
    public static void task4 () {
        System.out.println(" Задача 4 ");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется дней: 1 ");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуется дней: 2 ");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуется дней: 3 ");
        } else {
            System.out.println(" Доставки нет ");
        }
        task5();
    }
    public static void task5 () {
        System.out.println(" Задача 5 ");
        int monthNumber = 5;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(" Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Сезон осень");
                break;
            default:
                System.out.println(" Такого месяца нет");
        }
    }


    }

