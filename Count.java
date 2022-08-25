import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        int ec=0,oc=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ec+=1;
            }
            else{
                oc+=1;
            }
        }
       System.out.print(ec);
       System.out.print(" "+oc);
    }
}