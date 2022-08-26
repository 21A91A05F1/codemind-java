import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int p = temp*temp;
        int rev=0,d;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        int q=rev*rev;
        rev=0;
        int t=q;
        while(q>0)
        {
            d=q%10;
            rev=rev*10+d;
            q/=10;
        }
        if(rev==p)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       
    }
}