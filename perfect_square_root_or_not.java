import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=Math.sqrt(n);
        if(n==(int)a*a)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}