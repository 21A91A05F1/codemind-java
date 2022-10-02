import java.util.Scanner;
class sathwika{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                c+=1;
            }
        }
        if(c==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
     
    }
}