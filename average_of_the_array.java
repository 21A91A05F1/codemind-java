import java.util.Scanner;
class sathwika
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int c=0,s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
                s+=arr[i];
        }
        
        System.out.format("%.2f",(float)s/n);
    }
}