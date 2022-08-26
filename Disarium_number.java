import java.util.*;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int rev=0,res=0,c=0,d,d1;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        n=temp;
        while(rev>0)
        {
            d1=rev%10;
            c+=1;
            res=res+(int)(Math.pow(d1,c));
            rev/=10;
        }
        if(res==temp){
            System.out.println("True");
        }
        else{
             System.out.println("False");
        }
      
    }
}