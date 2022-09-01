import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        while(max>0)
        {
            if(max%a==0 && max%b==0)
            {
                System.out.println(max);
                break;
            }
            max++;
        }
    }
}