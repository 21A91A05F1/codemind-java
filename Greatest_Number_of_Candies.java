import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]+k>=max){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
        
    }
}