import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s1=0,s2=0,i=1;
        while(i<a)
        {
            if(a%i==0){
                s1+=i;
            }
            i+=1;
        }
        i=1;
        while(i<b)
        {
            if(b%i==0){
                s2+=i;
            }
            i+=1;
        }
        if(s1==b && s2==a){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
       
    }
}