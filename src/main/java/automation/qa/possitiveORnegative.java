package automation.qa;

import java.util.Scanner;

public class possitiveORnegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("Number is possitive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
