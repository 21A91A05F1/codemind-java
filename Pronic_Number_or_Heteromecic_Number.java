import java.util.Scanner;
class one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=0;i<100000;i++){
           if(i*(i+1)==a){
                c+=1;
           }
        }
        if(c>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
    }
}