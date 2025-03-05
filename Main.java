import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("a=" + a);

        boolean divisible_by_five = false;

        if (a % 5 == 0) {
            System.out.print("a=" + a + " ");
            divisible_by_five = true;
        }
        if (b % 5 == 0) {
            System.out.print("b=" + b + " ");
            divisible_by_five = true;
        }
        if (c % 5 == 0) {
            System.out.print("c=" + c + " ");
            divisible_by_five = true;
        }

        if (!divisible_by_five) {
            System.out.println("нет значений, кратных 5");
        } else {
            System.out.println();
        }


        System.out.println("Результат целочисленного деления a на b: " + (a / b));

        System.out.println("Результат деления a на b: " + ((double) a / b));

        System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceil((double) a / b));

        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floor((double) a / b));

        System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double) a / b));

        System.out.println("Остаток от деления b на c: " + (b % c));

        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));

        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));

        scanner.close();
    }


}
