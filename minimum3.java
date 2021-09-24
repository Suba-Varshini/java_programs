import java.util.Scanner;
public class minimum3 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextFloat();
        System.out.print("Input the Second number: ");
        double y = in.nextFloat();
        System.out.print("Input the third number: ");
        double z = in.nextFloat();
        System.out.print("The smallest value is " + minimum3_function(x, y, z)+"\n" );
    }

    public static float minimum3_function(float x, float y, float z)
    {
        return Math.min(Math.min(x, y), z);
    }
}