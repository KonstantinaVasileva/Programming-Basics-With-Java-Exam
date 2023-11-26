import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < location; i++) {
            double goldNeeded = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double allGold = 0;

            for (int j = 0; j < days; j++) {
                double goldForDay = Double.parseDouble(scanner.nextLine());
                allGold += goldForDay;
            }
            double averageGoldPerDay = allGold/days;
            if (averageGoldPerDay >= goldNeeded)
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageGoldPerDay);
            else System.out.printf("You need %.2f gold.\n", goldNeeded - averageGoldPerDay);

        }

    }
}
