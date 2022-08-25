import java.util.*;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int c=0,d,s=0,t;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            t=arr[i];
            c=0;
            while(t!=0)
            {
                d=t%10;
                c+=1;
                t=t/10;
            }
            if(c%2==0){
                s+=1;
            }
        }
        System.out.println(s);
    }
}