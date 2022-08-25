import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []brr=new int[n];
        int []crr=new int[n];
        int p=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           crr[i]=arr[i]+brr[i];
        }
        for(int i=0;i<n;i++){
            System.out.format("%d ",crr[i]);
        }
        
       
        
       
    }
}