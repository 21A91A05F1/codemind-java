import java.util.Scanner;
class Sathwika{
    static boolean is_prime(int n){
        int c=0,i=1;
        while(i<=n)
        {
            if(n%i==0){
                c+=1;
            }
            i+=1;
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=0;
        int s1=a+b;
        for(int i=s1+1;;i++){
            c+=1;
            if(is_prime(i)){
                break;
            }
        }
        System.out.println(c);
    }
}