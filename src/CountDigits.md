[Count Digits](https://www.geeksforgeeks.org/problems/count-digits5716/1)

```
class Solution 
{
    static int evenlyDivides(int n) 
    {
        int num = n;
        int count = 0;
        while(n > 0)
        {
           int digit = n % 10;
           if(digit != 0 && num % digit == 0)
           {
               count = count + 1;
           }
           n = n / 10;
        }
        return count;
    }
}

```
