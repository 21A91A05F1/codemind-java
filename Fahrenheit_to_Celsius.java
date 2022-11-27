import java.util.*;
class Sathwika
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float n=s.nextInt();
        float k=((n-32)*5)/9;
        System.out.format("%.2f",k);
    }
}