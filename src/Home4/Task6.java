package Home4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
                Scanner rect = new Scanner(System.in);
                System.out.print("Ширина - ");
                int width = rect.nextInt();
                rect.nextLine();
                System.out.print("Высота - ");
                int hight = rect.nextInt();
                rect.nextLine();
                System.out.println(Figure(hight,width));
            }


             public static String Width(int x){
                if (x == 1) {
                        return "x ";
                    }
                return Width(x-1) + "x ";
            }

             public static String Figure(int x, int y){
                if (x == 1) {
                        return Width(y) + "\n";
                    }
                return Figure(x-1,y) + Width(y) + "\n";
            }

}
