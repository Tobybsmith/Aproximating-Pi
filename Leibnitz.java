import java.util.Scanner;

public class Leibnitz
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double pi = 0;
        double denominator = 1;
        for(int i = 0; i < N; i++)
        {
            if(i%2 == 0)
            {
                pi = pi - 1.0/denominator;
                denominator = denominator + 2.0;
            }
            else
            {
                pi = pi + 1.0/denominator;
                denominator = denominator + 2.0;
            }
        }
        pi = pi*4;
        System.out.println(Math.abs(pi));
    }
    
}

