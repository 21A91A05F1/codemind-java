import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        //System.out.println(a);
        int b=sc.nextInt();
        //System.out.println(b);
        int s=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                s+=arr[i];
            }
        }
       System.out.println(s);
       
    }
}