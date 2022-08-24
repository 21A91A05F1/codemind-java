import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if((n%2==0) &&(n>0 || m%2==0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}