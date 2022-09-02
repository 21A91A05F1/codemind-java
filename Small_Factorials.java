import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
          int n=sc.nextInt();
          int f=1;
          for(int i=1;i<=n;i++){
              f*=i;
          }
        System.out.println(f);
            t--;
        }
        
       
    }
}