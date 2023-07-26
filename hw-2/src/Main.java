import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
       System.out.println("enter your first number :");
       int num1 = inp.nextInt();
       System.out.println("enter your second number :");
       int num2 = inp.nextInt();

       System.out.println("the sum of the two numbers is :"+(num1+num2));
       System.out.println("the multiply of the two numbers is :"+(num1*num2));
       System.out.println("the divide of the two numbers is :"+(num1/num2));
       System.out.println("the reminder of the two numbers is :"+(num1%num2));


        //Write a Java program to convert a given string into lowercase.
       System.out.println(" enter the text :");
       String text = inp.nextLine();

       System.out.println(text.toLowerCase());


        //Write a Java program that takes a string and a number from the user,then prints the character in the given index.
       System.out.println(" enter the text :");
       String text2 = inp.nextLine();
       System.out.println("enter number :");
       int num3 = inp.nextInt();

       System.out.println(text2.charAt(num3));


        // Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)    }
       System.out.println("enter number :");
       int num4 = inp.nextInt();

       if(num4% 2==0)
       {System.out.println(1);}
       else System.out.println(0);

//Write a program that checks the role of the user
       System.out.println(" enter the role :");
        String text = inp.nextLine();
        if(text.equals("admin")){
            System.out.println("welcome admin");
        } else if (text.equals("superuser")) {
            System.out.println("welcome superuser");
        }
        else System.out.println("welcome normal user :)");

//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
       System.out.println("enter your first number :");
       int num1 = inp.nextInt();
       System.out.println("enter your second number :");
     int num2 = inp.nextInt();
       System.out.println("enter your third number :");
       int num3 = inp.nextInt();

       int sum = num1 +num2;
       if(num3==sum){
           System.out.println("true");
       }
       else System.out.println("false");

        //Take three numbers from the user and print the greatest number.
       System.out.println("enter your first number :");
       int num1 = inp.nextInt();
       System.out.println("enter your second number :");
     int num2 = inp.nextInt();
       System.out.println("enter your third number :");
       int num3 = inp.nextInt();

       if(num1>num2 &&num1>num3){
           System.out.println("number one is the greatest ");
       } else if (num2>num1 &&num2>num3) {
           System.out.println("number two is the greatest");
       }
       else System.out.println("number three is the greatest ");

//        Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

        System.out.println("enter your  number :");
        int num1 = inp.nextInt();

        switch (num1){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("you enter valid number !");
        }
    }
}
