import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int i,j,flag=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==k){
                flag=1;
                System.out.format("%d ",i);
                break;
            }
        }
        for(i=n-1;i>=0;i--){
            if(arr[i]==k){
                flag=1;
                System.out.println(i);
                break;
            }
        }
        
        if(flag==0){
            System.out.println("-1 -1");
        }
        
            
           
     
    }
}