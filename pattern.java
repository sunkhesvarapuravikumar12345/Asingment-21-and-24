import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        Pattern(n);
    }

    private static void Pattern(int n) {
        int i,j;
        for(i=1;i<=n;++i) {
            for(j=1;j<=i;++j) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}