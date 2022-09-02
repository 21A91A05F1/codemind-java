import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d,s=0,p=1;
        while(a>0)
        {
            d=a%10;
            s+=d;
            p*=d;
            a/=10;
            
        }
        System.out.println(p-s);
    }
}
