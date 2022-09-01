import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        c=a+b;
       while(c<n)
       {
            //System.out.format("%d ",a);
            c=a+b;
            a=b;
            b=c;
            
        }
        if(c==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}