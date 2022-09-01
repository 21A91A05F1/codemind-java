import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int d,rev=0;
        while(a!=0)
        {
            d=a%10;
            rev=rev*10+d;
            a/=10;
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       
    }
}