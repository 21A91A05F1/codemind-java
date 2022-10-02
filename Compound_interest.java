import java.util.*;
class sathwika
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double a,b,c;
        a=1+(r/100);
        b=Math.pow(a,t);
        c=(p*b);
        System.out.format("%.2f",c);
       
    }
}