package automation.qa;

import java.util.Scanner;

public class Myfirstjava {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        //System.out.println("Your name is:"+ firstName);
        System.out.println("Please enter your age");
        int userAge = scanner.nextInt();
        //System.out.println("Your age is:" + userAge);
        System.out.println("Your name is:" +firstName);
        System.out.println("Your age is:" +userAge);
        if (userAge>=18)
            System.out.println(firstName+"  can drink");
        if (userAge<18)
            System.out.println(firstName+"  can not drink");

    }

}
