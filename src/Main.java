public class Main {
    public static void main(String[] args) {

    //1
        byte clientOS;
        clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println(" ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println(" ");
        }

    //2
        short releaseYear;
        releaseYear = 2013;

        if(clientOS == 0){
            if(releaseYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println(" ");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                System.out.println(" ");
            }

        } else if (releaseYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
                System.out.println(" ");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                System.out.println(" ");
            }

        //3
                //високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.
                short year;
                year = 2012;
                if(year%4 == 0 && year%100 != 0){
                    System.out.println(year + " год является високосным.");
                    System.out.println(" ");
                } else if(year%400 != 0){
                    System.out.println(year + " год НЕ является високосным.");
                    System.out.println(" ");
                    }
                    else{
                        System.out.println(year + " год является високосным.");
                        System.out.println(" ");
                    }


        //4
                short deliveryDistance;
                deliveryDistance = 78;
                int deliveryTime = 0;

                if (deliveryDistance <= 20){
                    deliveryTime = deliveryTime + 1;
                } else if(deliveryDistance > 20 && deliveryDistance <= 60){
                    deliveryTime = deliveryTime + 2;
                } else if (deliveryDistance > 60 && deliveryDistance <= 100){
                    deliveryTime = deliveryTime + 3;
                } else if (deliveryDistance >100) {
                    System.out.println("Доставка не осущетсвляется");
                    System.out.println(" ");
                }
                if(deliveryTime != 0) {
                    System.out.println("Доставка займет " + deliveryTime + " дней");
                    System.out.println(" ");
                }

        //5
            byte monthNumber = 10;
                switch (monthNumber){
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Зима");
                        System.out.println(" ");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        System.out.println(" ");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        System.out.println(" ");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("Нет такого месяца");
                        System.out.println(" ");
                        break;

                }


    }
}