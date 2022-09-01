import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,d,p=1;
        int temp=(n*n);
        while(temp!=0)
        {
            d=temp%10;
            s+=d;
            temp/=10;
        }
        if(n==s){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
        

        
        
       
    }
}