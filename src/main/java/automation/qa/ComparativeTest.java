package automation.qa;

import java.util.Scanner;

public class ComparativeTest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter third number:");
        int num3 = input.nextInt();
        if (num1 >num2 && num1>num3){
            System.out.println("First number is biggest");
        }
        else if(num2>num3 && num2>num1){
            System.out.println("Second number is biggest");
        }
        else {
            System.out.println("Third number is biggest");
        }

    }
}
