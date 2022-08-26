import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int sum=0,i=1;
        while(i<n)
        {
            if(n%i==0){
                sum+=i;
            }
            i+=1;
        }
        if(sum>n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
      
    }
}