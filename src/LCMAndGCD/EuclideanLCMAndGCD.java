package LCMAndGCD;

import java.util.Scanner;
import java.util.Arrays;

public class EuclideanLCMAndGCD
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int[] ans = new int[2];

        ans[1] = gcd(a, b);

        ans[0] = lcm(a, b);

        System.out.println(Arrays.toString(ans));
    }

    static int gcd(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
}