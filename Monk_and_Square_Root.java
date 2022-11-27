import java.util.*;
class Sathwika
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            int c=0;
            for(int i=0;i<b+1;i++)
            {
                long  s=(long)i*i;
                if((s)%b==a)
                {
                    System.out.println(i);
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(-1);
            }
        }
    }
}