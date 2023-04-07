import java.util.Scanner;

public class Simple_Calculator {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        // loop to perform multiple calculations with multiple operators based on users choices.
        while(true){ 
        System.out.println("Enter first number");
        float num1 = sc.nextFloat();
        
        System.out.println("Enter second number");
        float num2 = sc.nextFloat();

        System.out.println("Enter the operator -: ( + , - , * , / )");
        char operator = sc.next().charAt(0);

        float result;

        switch (operator){
            case '+':
            result = num1+num2;
            break;

            case '-':
            result = num1-num2;
            break;

            case '*':
            result = num1*num2;
            break;

            case '/':
            result = num1/num2;
            break;

            default :
            System.out.println("Invalid operator 404");
            return; // if the operator is invalid it will exit the loop.
        }
        System.out.println("Final Result : " + result); 
        System.out.println("______________________"); 
        System.out.println(); 
    }
}    
}
