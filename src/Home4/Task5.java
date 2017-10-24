package Home4;

        import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Число X - ");
        int x = number.nextInt();
        number.nextLine();
        System.out.println(Conclusion(x));
    }

    public static String Conclusion(int x) {
        if (x == 1) {
            return "1";
        }
        return Conclusion(x - 1) + " " + x;
    }
}
