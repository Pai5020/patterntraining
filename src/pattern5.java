import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        int copy=rows;
        int m=1,n=0;
        System.out.println("*");
        copy=copy-1;
        while(copy>=0)
        {
            for(int i=0;i<=n;i++)
            {
                for(int k=0;k<=n;k++)
                    System.out.print("*");
                System.out.println();
            }
//            System.out.println();
            if(n==0)
                copy=copy-1;
            else
                copy=copy-n;
            int l=(m*3);
            for(int k=0;k<l;k++)
            {
                System.out.print("*");
            }
            copy=copy-1;
            m++;
            n++;
            System.out.println();
        }
    }
}
