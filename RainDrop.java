import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0){
            System.out.print("Pling");
        }
        if(n%5==0){
            System.out.print("Plang");
        }
        if(n%7==0){
            System.out.print("Plong");
        }
         else if(n%3!=0 && n%5!=0 && n%7!=0){
            System.out.print(n);
        }
    }
}