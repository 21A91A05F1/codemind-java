import java.util.Scanner;
class one
{
    static int gcd(int a, int b)
    {
        if(b!=0){
            return gcd(b,a%b);
        }
        else{
            return a;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=gcd(m,n);
        System.out.println(k);
        
    }
}