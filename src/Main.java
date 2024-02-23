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
public class Main {
    public static void main(String[] args) {
        List<Integer> one = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> two = new ArrayList<>(Arrays.asList(2, 3));
        List<Integer> three = new ArrayList<>(Arrays.asList(3, 5));

        List<List<Integer>> sublist = new ArrayList<>();
        sublist.add(one);
        sublist.add(two);
        sublist.add(three);

       double R = (double) (1 + 2) / 2;
       double R1 = (double) (2 + 3) / 2;
       double R2 = (double) (3 + 5) / 2;

        List<Double> result = new ArrayList<>();
        result.add(R);
        result.add(R1);
        result.add(R2);
        System.out.println(result);
    }
}