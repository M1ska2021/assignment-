void mainimport java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);

        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Частное: " + division);
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        scanner.close();
    }
}

