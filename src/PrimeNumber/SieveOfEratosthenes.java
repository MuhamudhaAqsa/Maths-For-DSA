package PrimeNumber;

import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] ans = sieve(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sieve(int n)
    {
        boolean[] arr = new boolean[n + 1];

        for(int i = 2 ; i * i <= n ; i++)
        {
            if(arr[i] == false)
            {
                for(int j = i * 2 ; j <= n ; j = j + i)
                {
                    arr[j] = true;
                }
            }
        }

        //Count the prime numbers
        int count = 0;
        for(int i = 2 ; i <= n ; i++)
        {
            if(arr[i] == false)
            {
                count = count + 1;
            }
        }

        //Displaying
        int index = 0;
        int[] ans = new int[count];

        for(int i = 2 ; i <= n ; i++)
        {
            if(arr[i] == false)
            {
                ans[index] = i;
                index = index + 1;
            }
        }

        return ans;
    }
}
