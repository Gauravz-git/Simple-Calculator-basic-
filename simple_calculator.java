/* Build a simple calculator which will run on cmd prompt */

import java.util.Scanner;

public class simple_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the First Number: "); //user will enter first number
        long num1 = sc.nextLong();

        System.out.println("Select Operation: +, -, *, /"); // user will select any one operation
        char operation = sc.next().charAt(0);

        System.out.print("Enter the Second Number: "); //user will enter second number
        long num2 = sc.nextLong();

        long result = 0;


        //logic
        switch (operation) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;
            
            case '/':
                result = num1 / num2;
                break;
        
            default:
                break;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
    

}