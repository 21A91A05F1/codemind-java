import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,d;
        while(s!=4 && s!=1)
        {
            s=0;
            while(n>0)
            {
                d=n%10;
                s=s+(d*d);
                n/=10;
            }
            n=s;
            
        }
        if(s==1 || s==7){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
       
    }
}