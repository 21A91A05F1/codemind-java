import java.util.*;
class Sathwika
{
    public static boolean is_prime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int min=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[max])
                max=i;
            if(arr[i]<arr[min])
                min=i;
        }
        int c=0;
        for(int i=Math.min(min,max);i<=Math.max(min,max);i++)
        {
            if(is_prime(arr[i]))
                c++;
        }
        System.out.print(c);
    }
}