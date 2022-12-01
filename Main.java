import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput==1) {  // ввести кол-во шагов
                System.out.println("Введите индекс месяца: 0 - янв., 1 - фев. и т.д.");
                int month = scanner.nextInt();
                System.out.println("Введите индекс дня от 0 до 29");
                int day = scanner.nextInt();
                System.out.println("Введите количество пройденных шагов");
                int stepsPerDay = scanner.nextInt();
                StepTracker.saveSteps(month, day, stepsPerDay);
            } else if (userInput==2) {  // стата за месяц
                System.out.println("За какой месяц показать статистику?");
                System.out.println("Введите индекс месяца: 0 - янв., 1 - фев. и т.д.");
                int month = scanner.nextInt();
                StepTracker.printStepsByDays(month);
                StepTracker.printSumAverageKkalDist(month);
                StepTracker.printMax(month);
                StepTracker.printBestSeries(month);
            } else if (userInput==3) {  // изменить цель
                System.out.println("Введите новуюю ежедневную цель");
                int stepsAim = scanner.nextInt();
                StepTracker.changeAim(stepsAim);
            } else {
                System.out.println("Неизвестная команда, попробуйте еще раз");
            }

            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Выберите функцию:");
        System.out.println("1. - Ввести количество пройденных шагов");
        System.out.println("2. - Показать статистику за нужный месяц");
        System.out.println("3. - Изменить цель по количеству шагов");
        System.out.println("0. - Выход");
    }
} 