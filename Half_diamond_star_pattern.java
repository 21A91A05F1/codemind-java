import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,c=1;
        if(n<3 || n>100){
            System.out.println("The pattern is not possible");
        }
       else{
           for(i=1;i<n*2;i++){
               for(j=1;j<=c;j++){
                   System.out.print("*");
               }
               if(i<n){
                   c++;
               }
               else{
                   c--;
               }
               System.out.println("");
           }
       }
        
    }
}