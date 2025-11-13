[Palindrome](https://www.geeksforgeeks.org/problems/palindrome0746/1)

```
class Solution 
{
    public boolean isPalindrome(int n) 
    {
       int num = n;
       int rev = 0;
       while(n > 0)
       {
           int rem = n % 10;
           rev = (rev * 10) + rem;
           n = n / 10;
       }
       if(num == rev)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
```
