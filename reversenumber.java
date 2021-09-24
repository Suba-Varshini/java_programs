import java.util.Scanner;
public class reversenumber
{
    public static void main(String[] args)
    {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number : ");
        number = inp.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}