package Factors;

import java.util.ArrayList;
import java.util.Scanner;

public class Optimal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        factors(n);
    }
    static void factors(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i * i <= n ; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                if(i != n / i)
                {
                    list.add(n / i);
                }
            }
        }

        for(int i = list.size() - 1 ; i >= 0 ; i--)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
