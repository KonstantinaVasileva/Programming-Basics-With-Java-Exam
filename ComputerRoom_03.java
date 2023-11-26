import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        int hour = Integer.parseInt(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        double sum = 0;

        //група от четирима или повече човека, цената на човек се намаля с 10%
        //•	За 5 или повече часа прекарани, цената на човек се намаля с 50%

        switch (mount){
            case "march":
            case "april":
            case "may":
                switch (dayTime){
                    case "day":
                        sum = 10.5 * hour * group;
                        break;
                    case "night":
                        sum = 8.4 * hour * group;
                        break;
                }
                break;
            case "june":
            case "july":
            case "august":
                switch (dayTime){
                    case "day":
                        sum = 12.6 * hour * group;
                        break;
                    case "night":
                        sum = 10.2 * hour * group;
                        break;
                }
                break;

        }

        if (group >= 4 )
            sum *= 0.9;
        if (hour >= 5)
            sum *= .5;

        double priceForHourForPerson = sum/group/hour;

        System.out.printf("Price per person for one hour: %.2f\nTotal cost of the visit: %.2f", priceForHourForPerson, sum);

    }
}
