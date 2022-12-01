public class Converter {



    static double findDistance(int numberOfSteps) {
        double distance = numberOfSteps*0.00075; // переводим шаги в км
        return distance;
    }

    static double countCalories(int numberOfSteps) { // Вычисляем Ккал
        double calories=numberOfSteps*0.05;
        return calories;
    }


}
