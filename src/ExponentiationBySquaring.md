Exponentiation By Squaring

```
Input: base = 2, exp = 21
Output: 2097152
```
```
import java.util.Scanner;

public class ExponentiationBySquaring
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exp = input.nextInt();
        System.out.println(pow(base, exp));
    }

    static int pow(int base, int exp)
    {
        if(exp == 0)
        {
            return 1;
        }
        if(exp % 2 == 1)
        {
            return base * pow(base, exp - 1);
        }
        return pow(base * base, exp / 2);
    }
}
```
