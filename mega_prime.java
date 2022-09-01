import java.util.Scanner;
class one
{
    static boolean is_prime(int n){
        int c=0,i=1;
        while(i<=n)
        {
            if(n%i==0){
                c+=1;
            }
            i+=1;
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,c1=0,c2=0,temp=n,d,i;
        if(is_prime(n)){
            temp=n;
            while(n!=0){
                d=n%10;
                c1+=1;
                if(is_prime(d)){
                    c2+=1;
                }
                n/=10;
            }
            if(c1==c2){
                System.out.println("Mega Prime");
            }
            else{
                System.out.println("Not Mega Prime");
            }
        }
        else{
            
            System.out.println("Not Mega Prime");
        }
        
    }
}