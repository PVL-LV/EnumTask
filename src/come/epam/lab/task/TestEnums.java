package come.epam.lab.task;

import java.util.Scanner;

public class TestEnums {
    DaysOfWeek day;
    String position;

    public void askUser() {
        System.out.println("Enter number of day:");
    }

    public void testEnum() {
        int userInput;

        askUser();
        userInput = readFromConsole();
        if (userInput == 1) {
            day = DaysOfWeek.MONDAY;
            print(day);
        } else if (userInput == 2) {
            day = DaysOfWeek.TUESDAY;
            print(day);
        } else if (userInput == 3) {
            day = DaysOfWeek.WEDNESDAY;
            print(day);
        } else if (userInput == 4) {
            day = DaysOfWeek.THURSDAY;
            print(day);
        } else if (userInput == 5) {
            day = DaysOfWeek.FRIDAY;
            print(day);
        } else if (userInput == 6) {
            day = DaysOfWeek.SATURDAY;
            print(day);
        }else if (userInput == 7) {
            day = DaysOfWeek.SUNDAY;
            print(day);
        } else {
            System.out.println("Wrong input, no such day of week!");
        }
    }

    private void print(DaysOfWeek day){
        this.day = day;
        position = day.getNumberInWeekRow();
        System.out.println(String.format("%s day of week is %s.", position.toString(), day.toString()));
    }

    public int readFromConsole() {
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Not a number, try again!");
            System.exit(0);
        }
        return number;
    }
}
