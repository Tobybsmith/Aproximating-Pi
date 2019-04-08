import java.util.Scanner;
import java.util.Random;

public class Dice
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double N = sc.nextDouble();
        double coPrimes = 0;
        double pi = 0;
        for(int i = 0; i < N; i++)
        {
            int a = rd.nextInt(10000) + 1;
            int b = rd.nextInt(10000) + 1;
            if(GCD(a, b) == 1)
            {
                coPrimes++;
            }

        }

        double percentPrime = coPrimes/N;
        System.out.println("Percent Co-Prime " + percentPrime + "%");
        
        pi = Math.sqrt(6.0/percentPrime);
        System.out.println(pi);
        if(pi >= 3.1 && pi <= 3.2)
        {
            System.out.println("Success within 1 decimal place");
        }
        else
        {
            System.out.println("Bad Dice Rolls");
        }

    }

    public static int GCD(int a, int b) {
        if (b == 0) 
        {
            return a;
        }
        if (a < b) 
        {
            return GCD(b, a);
        }
        return GCD(b, a % b);
    }
}
