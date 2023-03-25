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
            total += moneyToSave;
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
            population += populationExtencion;
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
            total += total * monthlyPercent/100;

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
            total += total * monthlyPercent/100;
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
            total += total * monthlyPercent/100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплено " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;

        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо отправить отчет.");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int cometYear = 79;
        int previousYear = currentYear - 200;
        int futureYear = currentYear + 100;



        for (int i = previousYear; i <= futureYear; i++) {
            if (i % cometYear == 0) {
                System.out.println(i + " год");
            }
        }


    }
}