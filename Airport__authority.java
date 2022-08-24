import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>t){
                s+=2;
            }
            else{
                s+=1;
            }
            
           
        }
       System.out.println(s);
      
    }
}