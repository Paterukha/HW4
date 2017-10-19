package Home4;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число - ");
        int x = number.nextInt();
        number.nextLine();
        reading(x);
    }

    public static void reading(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i + ".");
        }
    }


}
