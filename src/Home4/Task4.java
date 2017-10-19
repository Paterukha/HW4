package Home4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Целое число a - ");
        int a = number.nextInt();
        number.nextLine();
        System.out.print("Целое число b - ");
        int b = number.nextInt();
        number.nextLine();
        System.out.println("max среди целых - " + getMax(a, b));


        System.out.print("Дробное число c - ");
        float c = number.nextFloat();
        number.nextLine();
        System.out.print("Дробное число d - ");
        float d = number.nextFloat();
        number.nextLine();
        System.out.println("max среди дробных - " + getMax(c, d));

    }

    public static int getMax(int a, int b) {
        if (a >= b)
            return a;
        else
            return b;
    }

    public static float getMax(float c, float d) {
        if (c >= d)
            return c;
        else
            return d;
    }
}


