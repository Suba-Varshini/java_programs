import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        int num1,num2;
        String operation;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        num1=input.nextInt();
        System.out.println("enter number 2 : ");
        num2=input.nextInt();
        Scanner op = new Scanner(System.in);
        System.out.println("enter the operation : ");
        operation=op.next();
        if(operation.equals("+"))
        {
            System.out.println(num1+num2);
        }
        if(operation.equals("-"))
        {
            System.out.println("sum is "+(num1-num2));
        }
        if(operation.equals("*"))
        {
            System.out.println(num1*num2);
        }
        if(operation.equals("/") && num2!=0)
        {
            System.out.println(num1/num2);
        }
    }
}