import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0){
                System.out.format("%d x %d = %d
",a,i,a*i);
            }
        }
        
    }
}