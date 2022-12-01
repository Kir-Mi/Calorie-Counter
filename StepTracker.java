public class StepTracker {


    static int stepAim = 10000;
    static int[][] stepData = new int[12][30];

    static void saveSteps(int month, int day, int stepsPerDay) {  // Сохранить шаги
        if (month<0 || month>11) {
            System.out.println("Неверный индекс месяца");
        } else if (day<0 || day>29) {
            System.out.println("Неверный индекс дня");
        } else if (stepsPerDay<0) {
            System.out.println("Количество шагов не может быть отрицательным");
        } else {
            System.out.println("Шаги сохранены");
            stepData[month][day] = stepData[month][day] + stepsPerDay;
        }
    }

    static void printStepsByDays (int month) { // Печатаем количество шагов по дням
        System.out.print("Пройдено шагов:");
        for (int j=0; j<30; j++) {
            System.out.print(" " + (j+1) + " день: " + stepData[month][j] + ".");
        }
        System.out.println();
    }

    static void printSumAverageKkalDist (int month) {  // Печатаем сумму, среднее за месяц, дистанцию и калории
        int sumSteps = 0;
        for (int j=0; j<30; j++) {
            sumSteps = sumSteps + stepData[month][j];
        }
        System.out.println("Количество шагов за месяц: " + sumSteps);
        System.out.println("Среднее количество шагов за месяц: " + (sumSteps/30));
        System.out.println("Пройдено за месяц: " + Converter.findDistance(sumSteps) + " км.");
        System.out.println("Потрачено за месяц: " + Converter.countCalories(sumSteps) + " Ккал.");
    }

    static void printMax (int month) { // Печатаем максимальное кол-во шагов за месяц
        int maxSteps = 0;
        for (int j=0; j<30; j++) {
            if (maxSteps<stepData[month][j]) {
                maxSteps = stepData[month][j];
            }
        }
        System.out.println("Максимальное число шагов за месяц: " + maxSteps);
    }

    static void printBestSeries (int month) { // Печатаем лучшую серию
        int preBestSeries =0;
        int bestSeries = 0;
        for (int j=0; j<30; j++) {
            if (stepData[month][j]<stepAim) {
                preBestSeries = 0;
            } else {
                preBestSeries = preBestSeries + 1;
                if (bestSeries<preBestSeries) {
                    bestSeries = preBestSeries;
                }
            }
        }
        System.out.println("Лучшая серия выполнения цели: " + bestSeries + " дней");
    }

    static int  changeAim(int stepsToDay) {  // метод изменяет цель на день
        if (stepsToDay >= 0) {
            stepAim = stepsToDay;
            System.out.println("Новая цель на день: " + stepAim + " шагов.");
        } else {
            System.out.println("Количество шагов не может быть отрицательным");
            System.out.println("Цель осталась прежней: " + stepAim + " шагов.");
        } return stepAim;
    }
}