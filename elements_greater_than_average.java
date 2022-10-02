import java.util.Scanner;
class Sathwika{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int s=0,c=0;
        float avg;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        s/=n;
        for (int i=0;i<n;i++){
            if(arr[i]>=s){
                c+=1;
            }
        }
        System.out.println(c);
    }
}