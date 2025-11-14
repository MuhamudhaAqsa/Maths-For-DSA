[Find Last Digit Of a^b for Large Numbers](https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1)

```
class Solution 
{
    static int getLastDigit(String a, String b) 
    {
        if(b.equals("0"))
        {
            return 1;
        }
        int base = a.charAt(a.length() - 1) - '0';
        int exp = exp(b);
        int lastDigit = lastDigitOfPow(base, exp);
        return lastDigit;
    }
    
    static int exp(String b)
    {
        int exp = 0;
        for(int i = 0 ; i < b.length() ; i++)
        {
            exp = ((exp * 10) + (b.charAt(i) - '0')) % 4;
        }
        exp = exp == 0 ? 4 : exp;
        return exp;
    }

    static int lastDigitOfPow(int base, int exp)
    {
        int lastDigit = 1;
        for(int i = 0 ; i < exp ; i++)
        {
            lastDigit = (lastDigit * base) % 10;
        }
        return lastDigit;
    }
};
```
