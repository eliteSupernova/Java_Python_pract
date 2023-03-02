import java.util.Scanner;

public class Tables{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number :");
        int n =Integer.parseInt(scan.nextLine());
        // System.out.println("enter the number :");
        tables(n);

    }
    public static void tables(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}