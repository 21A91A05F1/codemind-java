import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []l=new int [n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int c=0;
        if (l[0]>l[1]){
            for(int i=0;i<n-1;i++){
                if(i%2==0 && l[i]>l[i+1]){
                    c+=1;
                }
                if(i%2==1 && l[i]<l[i+1]){
                    c+=1;
                }
            }
            if(c==n-1){
                System.out.println("yes");
            }
            else{
                 System.out.println("no");
            }
        }
        else{
            for(int i=0;i<n-1;i++){
                if(i%2==0 && l[i]<l[i+1]){
                    c+=1;
                }
                if(i%2==1 && l[i]>l[i+1]){
                    c+=1;
                }
            }
            if(c==n-1){
                System.out.println("yes");
            }
            else{
                 System.out.println("no");
            }
            
        }
    }
}