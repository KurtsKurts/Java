// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка

package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class third {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("Cписок чисел: " + list);

        Integer[] arrayList = list.toArray(new Integer[0]);
        Arrays.sort(arrayList);

        System.out.println("Минимальное число: " + arrayList[0]);
        System.out.println("Максимальное число: " + arrayList[arrayList.length - 1]);
        int sum = 0;
        for (Integer elem : arrayList) {
            sum += elem;
        }
        double ave = (double) sum/ (double) arrayList.length;
        System.out.print("Среднеарифметическое: " + ave);
    }
}
