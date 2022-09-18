import java.util.Scanner;
class sathwika
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            double a= Math.sqrt(n);
            if(n==(int)a*a){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
            t--;
        }
    }
}