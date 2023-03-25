/**
1.Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */
import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangle(i));
        System.out.printf("Факториал числа: %d\n", factorial(i));
        iScanner.close();
    }

    public static int triangle(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int factorial(int a) {
        int result = 1;
    for (int i = 1; i <= a; i++) {
       result = result * i;
    }
    return result;
    }
}

