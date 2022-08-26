import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0,d;
        int temp=n;
        if(n<0){
            n=Math.abs(n);
        }
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(temp>0){
            System.out.println(r);
        }
        else{
            System.out.println(-r);
        }
       
    }
}