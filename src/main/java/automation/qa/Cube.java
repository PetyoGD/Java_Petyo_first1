package automation.qa;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        int multp = a*b;
        int multv = a*b*c;
        System.out.println("Perimeter of the rectangle is:" + " = " + multp);
        System.out.println("Volume of the rectangle is:" + " = " + multv);

    }
}
