[Perfect Numbers](https://www.geeksforgeeks.org/problems/perfect-numbers3207/1)

```
class Solution 
{
    static boolean isPerfect(int n) 
    {
        if(n <= 1)
        {
            return false;
        }
        
        int sum = 0;
        
        int i = 1;
        while(i * i <= n)
        {
            if(n % i == 0)
            {
                sum = sum + i;
                if(n / i != i && n / i != n)
                {
                    sum = sum + n / i;
                }
            }
            i = i + 1;
        }
        
        return sum == n;
    }
};
```
