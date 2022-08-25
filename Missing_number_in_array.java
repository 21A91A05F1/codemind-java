import java.util.*;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int []arr=new int [n];
            int s=0, res,p;
            for(int i=0;i<n-1;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                s+=arr[i];
            }
            p=((n)*(n+1))/2;
            res=p-s;
            System.out.println(res);
        }
    }
}