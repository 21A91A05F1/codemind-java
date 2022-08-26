import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,d;
        while(n>0)
        {
            d=n%10;
            if(max<d){
                max=d;
            }
            n/=10;
        }
        System.out.println(max);
        
    }
}