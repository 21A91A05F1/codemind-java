import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        int max=0,c=0,i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==key){
                c+=1;
                System.out.println(i);
                break;
            }
        }
        if(c==0){
            System.out.println("-1");
        }
    }
}