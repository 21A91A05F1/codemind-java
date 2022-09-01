import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int s=0,d,p=1;
        while(n!=0)
        {
            d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        if(p==s){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
        

        
        
       
    }
}