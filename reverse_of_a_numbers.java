import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,i=0,d;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
            i+=1;
        }
        System.out.println(rev);
       
    }
}