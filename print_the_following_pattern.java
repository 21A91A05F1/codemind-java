import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i , j;
        for(i=n;i>=1;i--){
            for(j=i;j>0;j--){
                System.out.format("%c ",i+64);
            }
            System.out.println();
        }
    }
}