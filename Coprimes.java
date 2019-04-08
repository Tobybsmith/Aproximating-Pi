import java.util.*;

public class Coprimes
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //Number of times to run the math loop
        int n = sc.nextInt();
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            if(coprimeTest(rd.nextInt(1000), rd.nextInt(1000)))
            {
                total++;
            }
        }
    }
    
    

    public static boolean coprimeTest(int a, int b)
    {
        int[] aDiv = divisorGet(a);
        int[] bDiv = divisorGet(b);
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j > b; j++)
            {
                if(aDiv[i] == bDiv[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] divisorGet(int a)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int divisor = 2;
        for(int i = 0; i < a; i++)
        {
            if(a%divisor == 0)
            {
                arr.add(divisor);
            }
            divisor++;
        }

        return convertIntegers(arr);
    }

    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    
    public static int getLargest(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
