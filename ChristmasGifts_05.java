import java.util.Scanner;

public class ChristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int child = 0;
        int adults = 0;

        while (!year.equals("Christmas")){
            int yearsOld = Integer.parseInt(year);
            if (yearsOld > 16)
                adults ++;
            else child ++;
            year = scanner.nextLine();
        }

        System.out.printf("Number of adults: %d \nNumber of kids: %d\nMoney for toys: %d\nMoney for sweaters: %d", adults, child, child * 5, adults * 15);

    }
}
