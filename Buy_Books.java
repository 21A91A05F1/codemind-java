import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int []brr=new int[n];
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            brr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           s1+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
           s2+=brr[i];
        }
        if(s1>s2){
            System.out.println("0");
        }
        else{
            System.out.println(s2-s1);
        }
        
            
           
     
    }
}