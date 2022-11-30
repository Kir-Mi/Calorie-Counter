public class Converter {

    double distance;
    double calories;

    double findDistance(int numberOfSteps) {
        distance=numberOfSteps*0.00075; // переводим шаги в км
        return distance;
    }

    double countCalories(int numberOfSteps) { // Вычисляем Ккал
        calories=numberOfSteps*0.05;
        return calories;
    }


}
