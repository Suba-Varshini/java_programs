import java.util.Scanner;
public class cointoss
{
    public enum choices
    {
        head,tail
    }
    public static boolean flip()
    {
            int rand1 = (int)((Math.random()*10 / 2));
            boolean result = false;
            if (rand1 == choices.valueOf("head").ordinal())
            {
                result = true;
            }
            return result;
        }
    public static void main(String[] args)
    {
        int input = 0;
        while (input != -1){
            System.out.println("Enter the number of times to toss or -1 to quit:");
            Scanner scanner = new Scanner(System.in);
            input=scanner.nextInt();
            System.out.println();

            int count_heads = 0;
            int count_tails = 0;
            for (int i=0; i< input; i++) {
                if(flip())
                    count_heads++;
                else
                    count_tails++;
            }
            if(input > 0)
                System.out.println(count_heads + " Heads " + count_tails + " Tails ");
            System.out.println();
        }
        return;
    }
}