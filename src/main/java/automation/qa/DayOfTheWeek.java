package automation.qa;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int DayOfTheWeek =scanner.nextInt();
        printDayOfTheWeek(DayOfTheWeek);

    }
    public static void printDayOfTheWeek(int DayOfTheWeek){
            switch (DayOfTheWeek){
                case 1:
                    System.out.println("Selected number corresponds to Monday");
                    break;
                case 2:
                    System.out.println("Selected number corresponds to Tuesday");
                    break;
                case 3:
                    System.out.println("Selected number corresponds to Wednesday");
                    break;
                case 4:
                    System.out.println("Selected number corresponds to Thursday");
                    break;
                case 5:
                    System.out.println("Selected number corresponds to Friday");
                    break;
                case 6:
                    System.out.println("Selected number corresponds to Saturday");
                    break;
                case 7:
                    System.out.println("Selected number corresponds to Sunday");
                    break;
                default:
                    System.out.println("Not corresponded to selected number");

            }
        }


    }

