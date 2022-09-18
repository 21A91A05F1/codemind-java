import java.util.Scanner;
class sathwika
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,d=0,k=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2==0){
                c+=1;
            }
            else{
                d+=1;
            }
            k+=1;
            n/=10;
        }
        if(c==k){
            System.out.println("Even");
        }
        else if(d==k){
            System.out.println("Odd");
        }
        else{
            System.out.println("Mixed");
        }
    }
}