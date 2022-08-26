import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,c1=0,c2=0,temp=n,d,i;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
            
        }
        n=temp;
        i=2;
        while(i<n)
        {
            if(n%i==0)
            {
                c1+=1;
            }
            i+=1;
        }
        i=2;
        while(i<rev)
        {
            if(rev%i==0)
            {
                c2+=1;
            }
            i+=1;
        }
        if(c1==0 && c2==0)
        {
            System.out.println("circular prime");
        
        }
        else if(c1==0){
            System.out.println("prime but not a circular prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}