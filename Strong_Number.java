import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,temp,d,sum=0,fact;
        temp=n;
        while(n>0)
        {
            d=n%10;
            fact=1;
            for(i=1;i<=d;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n/=10;
        }
        if(sum==temp){
            System.out.format("The number %d is a strong number",temp);
        }
        else{
            System.out.format("The number %d is not a strong number",temp);
        }
    }
}