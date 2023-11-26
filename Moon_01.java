import java.util.Scanner;

public class Moon_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());

        double h = (384400/v * 2) + 3;
        double allFuel = 2 * 3844 * fuel;

        System.out.printf("%.0f\n%.0f", Math.ceil(h), allFuel);

    }
}
