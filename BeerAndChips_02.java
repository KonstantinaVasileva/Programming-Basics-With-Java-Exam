import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beer = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double moneyForBeer = beer * 1.2;
        double moneyForChips = Math.ceil(chips * (.45 * moneyForBeer));
        double spendMoney = moneyForChips + moneyForBeer;

        if (spendMoney<= budget)
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - spendMoney);
        else System.out.printf("%s needs %.2f more leva!", name, spendMoney - budget);
    }
}
