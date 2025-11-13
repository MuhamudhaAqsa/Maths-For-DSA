[Print all Divisors of a number](https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188?leftPanelTabValue=PROBLEM)

```
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Solution
{
    public static List< Integer > printDivisors(int n) 
    {
       List<Integer> list = new ArrayList<>();
       int i = 1;
       while(i * i <= n)
       {
          if(n % i == 0)
          {
              list.add(i);
              if(n / i != i)
              {
                  list.add(n / i);
              }
          }
          i = i + 1;
       }
       Collections.sort(list);
       return list;
    }
}
```
