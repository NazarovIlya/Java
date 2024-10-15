// Задан дневник температуры за март:
// {-2, -5, -2, -4, 3, -6, -2, -1, 5, 1, 1, 0, -1, 0, 3, -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11}.
// Найдите, сколько было дней, когда температура оказалась выше 10 градусов,
// и подсчитайте среднюю температуру за месяц.


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final int temperature = 10;

        ArrayList<Integer> temperatureList = new ArrayList<>();
        temperatureList.addAll(Arrays.asList(-2, -5, -2, -4, 3, -6, -2, -1, 5, 1, 1, 0, -1, 0, 3,
                                                -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11));

        System.out.println("Дневник температуры за март:\n" + temperatureList + "\n");

        int res_temp = higherTemperature(temperatureList, temperature);
        int resAverage = averageTemperature(temperatureList);

        System.out.println("Солько было дней, когда температура оказалась выше 10 градусов:\n" + res_temp + "\n");
        System.out.println("Среднюю температуру за месяц:\n" + resAverage +"\n");

    }

    public static int higherTemperature(ArrayList<Integer> list, int temperature){
        int countDays = 0;
        for (int temp : list) {
            if(temperature < temp) ++countDays;
        }
        return countDays;
    }

    public static int averageTemperature(ArrayList<Integer> list){
        int average = 0;
        for(int temp : list){
            average += temp;
        }
        average = average / list.size() - 1;
        return average;
    }
}