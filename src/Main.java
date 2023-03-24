public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int moneyToSave = 15_000;
        int overallMoneyToSave = 2_459_000;
        int total = 0;
        int i = 0;

        while (total < overallMoneyToSave) {
            total = total + moneyToSave;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17; // на тысячу человек
        int deathRate = 8; // на тысячу человек

        for (int i = 0; i <= 10; i++) {
            int populationExtencion = (birthRate - deathRate) * population / 1000;
            population = population + populationExtencion;
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int monthlyPercent = 7; // процентов
        int moneyToSave = 12_000_000;
        double total = 15000;
        int month = 0;
        while (moneyToSave > total) {
            month++;
            double total1 = total * monthlyPercent / 100;
            total = total + total1;

            System.out.println("Месяц " + month + " накоплено " + total);
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthlyPercent = 7; // процентов
        int moneyToSave = 12_000_000;
        double total = 15000;
        int month = 0;
        while (moneyToSave > total) {
            month++;
            double total1 = total * monthlyPercent / 100;
            total = total + total1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплено " + total);
            }
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int monthlyPercent = 7; // процентов
        int yearsToSave = 9; // лет
        double total = 15000;
        int month = 0;
        int monthsToSave = yearsToSave * 12;
        while (monthsToSave >= month) {
            month++;
            double total1 = total * monthlyPercent / 100;
            total = total + total1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплено " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 1;
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            if (dayNumber == friday) {
                System.out.println("Сегодня пятница, " + dayNumber + "-ое число. Необходимо отправить отчет.");
                friday = friday + 7;
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        for (int year = 1823; year <= 2123; year++) {
            if (year % 79 == 0) {
                System.out.println(year + " год");
            }
        }


    }
    /*
    комета пролетает каждый 79-й год, начиная с нулевого.
    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
    а также следующий год ее появления (ближайшие 100 лет).

     */
}