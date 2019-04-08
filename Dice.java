import java.util.Scanner;
import java.util.Random;

public class Dice
{
    public static void main()
    {
        /*
        This method uses the fact that the probability of two random numbers being co-prime is 6/pi^2
        With this in mind this program computes random pairs of numbers and works out pi
        It's different every time but ig you want 3 decimal places of accuracy set N to 1'000'000 at least
        */
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double N = sc.nextDouble();
        double coPrimes = 0;
        double pi = 0;
        for(int i = 0; i < N; i++)
        {
            //Take two random numbers and find out if they are co-prime
            int a = rd.nextInt(10000) + 1;
            int b = rd.nextInt(10000) + 1;
            if(GCD(a, b) == 1)
            {
                coPrimes++;
            }

        }

        double percentPrime = coPrimes/N;
        System.out.println("Percent Co-Prime " + 100*percentPrime + "%");
        //Since the probability of a co-prime pair is 6/pi^2, to find pi we just takle the percent prime
        //and divide six by it. Finally take the square root and its pi(-ish)!
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
