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
        int s=0,c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j] && i!=j){
                    c+=1;
                    arr[j]=-1;
                }
            }
            if(arr[i]%2==0){
                s+=arr[i];
            }
        }
       System.out.println(s);
    }
}