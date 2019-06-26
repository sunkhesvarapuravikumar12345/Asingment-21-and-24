import java.util.Scanner;
    public class Armstrong{
        public static void main(String[] args) {
            System.out.println("Enter a number");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Armstrongno(n);
        }
        private static void Armstrongno(int n) {
            int c=n;
            int i,j = 0;
            while(n>0){
                i=n%10;
                j=j+(i*i*i);
                n=n/10;
            }
            if(c==j)
                System.out.println("entered no is armstrong");
            else
                System.out.println("Not an armstrong number");
        }
    }

