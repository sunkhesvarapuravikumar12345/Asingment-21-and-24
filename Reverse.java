import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println( "printing a reverse of number: "+reverseno(n));
    }

    private static int reverseno(int n) {
        int i,j = 0;
        while(n>0) {
            i=n%10;
            j=j*10+i;
            n/=10;
        }

        return j;
    }

}