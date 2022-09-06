import java.util.Scanner;
class one{
    static boolean pal(int n) {
        int temp=n;
        int d,rev=0;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(pal(arr[i])){
                c+=1;
            }
        }
        
     System.out.println(c);
    }
}