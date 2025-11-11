[Square Root](https://www.geeksforgeeks.org/problems/square-root/1)

```
class Solution 
{
    int floorSqrt(int n) 
    {
        int start = 0;
        int end = n;
        int ans = 0;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            long square = mid * mid;
            if(square > n)
            {
                end = mid - 1;
            }
            else if(square < n)
            {
                ans = mid;
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return ans;
    }
}
```
