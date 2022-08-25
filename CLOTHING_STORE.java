import java.util.*;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int c=0,f=0,pa=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                c=1;
                for(int j=0;j<n;j++){
                if(arr[i]==arr[j] && i!=j){
                  c++;
                  arr[j]=-1;
                }
            }
            pa+=c/2;
            }
           
            
           
           }
        System.out.println(pa);
        
    }
}