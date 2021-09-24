public class perfectnumber
{
    static boolean isPerfect(int num)
    {
        int sum = 1;
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i==0)
            {
                if(i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == num && num != 1)
            return true;
        return false;
    }
    public static void main (String args[])
    {
        System.out.println("Perfect Numbers between 500 to 5000 are: ");
        for (int n = 500; n < 5000; n++)
            if (isPerfect(n))
                System.out.println(n +" is a perfect number");
    }
}