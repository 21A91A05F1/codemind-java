import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int p=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            p=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    p=p*arr[j];
                }
            }
            System.out.format("%d ",p);
        }
        
       
    }
}