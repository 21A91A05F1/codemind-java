import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.format("%d ",a);
            c=a+b;
            a=b;
            b=c;
        }
        
    }
}