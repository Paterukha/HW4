package Home4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner rect = new Scanner(System.in);
        System.out.print("Ширина - ");
        int width = rect.nextInt();
        rect.nextLine();
        System.out.print("Высота - ");
        int hight = rect.nextInt();
        rect.nextLine();
        if (width == hight)
            drawRectangle(width);
        else
            drawRectangle(width, hight);


    }

    public static void drawRectangle(int width, int hight) {
        for (int j = 1; j <= hight; j++) {
            System.out.println();
            for (int i = 1; i <= width; i++) {
                System.out.print("+");
            }
        }
    }

    public static void drawRectangle(int width) {
        for (int j = 1; j <= width; j++) {
            System.out.println();
            for (int i = 1; i <= width; i++)
                System.out.print("+");
        }

    }
}