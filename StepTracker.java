public class StepTracker {


    int stepAim = 10000;
    int[][] stepData = new int[12][30];

    public void saveSteps(int month, int day, int stepsPerDay) {  // Сохранить шаги
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

    public void printStepsByDays (int month) { // Печатаем количество шагов по дням
        for (int j=0; j<30; j++) {
            System.out.print("Пройдено шагов:");
            System.out.print(" " + (j+1) + " день: " + stepData[month][j]);
        }
    }

    void printSumSteps (int month) {  // Печатаем сумму шагов за месяц

    }


    void printMax (int month) { // Печатаем максимальное кол-во шагов за месяц

    }


    void printAverage (int month) { // Печатаем среднее кол-во шагов за месяц

    }


    void printDistance (int month) { // Печатаем дистанцию за мес. в км.

    }

    void printCalories (int month) { // Печатаем расход Ккал за мес.

    }

    void printBestSeries (int month) { // Печатаем лучшую серию

    }





    int  changeAim(int stepsToDay) {  // метод изменяет цель на день
        if (stepsToDay >= 0) {
            stepAim = stepAim + stepsToDay;
            System.out.println("Новая цель на день: " + stepAim + " шагов.");
        } else {
            System.out.println("Количество шагов не может быть отрицательным");
            System.out.println("Цель осталась прежней: "+stepAim+" шагов.");
        } return stepAim;
    }
}