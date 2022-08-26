import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m%2==0 || n%2==0){
            System.out.println("Player 1");
        }
        else{
             System.out.println("Player 2");
        }
    }
}