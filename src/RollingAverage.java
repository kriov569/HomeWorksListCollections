import java.util.*;
/*
 Дан непустой массив целых чисел длиной n и число k (0 < k <= n).
 Нужно вывести среднее значение для всех подмассивов длиной k, входящих в исходный массив.

List<Integer> getRollingAverage(ArrayList<Integer> arr, int k) {
//TODO …
}
Пример тест кейса
arr = [1 ,2 ,3, 5], k = 2
Получаем
res = [1.5, 2.5, 4]
 */
public class RollingAverage {

    public static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        List<Double> averages = new ArrayList<>();

        for (int i = 0; i <= arr.size() - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr.get(j);
            }
            double average = (double) sum / k;
            averages.add(average);
        }

        return averages;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);

        int k = 2;

        List<Double> result = getRollingAverage(arr, k);
        System.out.println(result);
    }
}


