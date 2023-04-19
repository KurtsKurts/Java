// В калькулятор добавьте возможность отменить последнюю операцию.

package HomeWork4;

import java.util.LinkedList;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        LinkedList<Integer> linList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        linList.add(num);
        while (true) {
            System.out.println("Введите действие (+, -, *, / или напишите 'отмена' для возврата к пред операции и 'выход' для выхода): ");
            String sym = sc.next();

            switch (sym) {
                case "+":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(linList.get(linList.size() - 1) + num);
                    linList.add(linList.get(linList.size() - 1) + num);
                    break;
                case "-":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(linList.get(linList.size() - 1) - num);
                    linList.add(linList.get(linList.size() - 1) - num);
                    break;

                case "*":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(linList.get(linList.size() - 1) * num);
                    linList.add(linList.get(linList.size() - 1) * num);
                    break;

                case "/":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(linList.get(linList.size() - 1) / num);
                    linList.add(linList.get(linList.size() - 1) / num);
                    break;

                case "отмена":
                    if (linList.size() > 1) {
                        linList.removeLast();
                        System.out.println(linList.getLast());
                    }
                    else System.out.println("Осталось только первое число - " + linList.getLast());
                    break;

                case "выход":
                    sc.close();
                    return;
            }
        }

    }
}
