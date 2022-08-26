import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int res,i,s=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            res=(int)Math.sqrt(arr[i]);
            if(res*res==arr[i]){
                s+=arr[i];
            }
        }
        
        System.out.println(s);
    }
}