import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.format("%d ",j);
            }
            System.out.println();
        }
       
    }
}