package GCD;

import java.util.Scanner;

public class Euclidean
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int res = gcd(a, b);

        System.out.println(res);
    }

    static int gcd(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b % a, a);
    }
}