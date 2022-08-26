import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int c=0,d,p;
        int s=(n*n);
        while(n!=0)
        {
            d=n%10;
            c+=1;
            n/=10;
        }
        p=(int)Math.pow(10,c);
        if(s%p==temp){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }

        
        
       
    }
}