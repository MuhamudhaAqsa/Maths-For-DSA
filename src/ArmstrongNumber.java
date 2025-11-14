import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(isArmstrongNumber(n));
    }

    static boolean isArmstrongNumber(int n)
    {
        int original = n;
        int count = count(n);
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            int num = pow(rem, count);
            sum = sum + num;
            n = n / 10;
        }
        return original == sum;
    }

    static int count(int n)
    {
        int count = 0;
        while(n > 0)
        {
            count = count + 1;
            n = n / 10;
        }
        return count;
    }

    static int pow(int rem, int count)
    {
        int num = 1;
        while(count > 0)
        {
            num = num * rem;
            count = count - 1;
        }
        return num;
    }
}
