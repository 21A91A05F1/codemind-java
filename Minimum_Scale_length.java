import java.util.Scanner;
class sathwika{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int c=0;
        int min=99999,f=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        for(int i=min;i>=1;i--)
        {
            f=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%i!=0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(i);
                break;
            }
            
        }
    }
}