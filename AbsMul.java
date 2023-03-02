import java.util.Scanner;

public abstract class AbsMul {
    public abstract void ml(int a,int b);
//     {
//    System.out.println("multiply: "+Integer.valueOf(a*b));
//     }
public void div(int a,int b){
        System.out.println("Divide: "+Integer.valueOf(a/b));
    }


}
class multi extends AbsMul{
   public  void ml(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        int a,b;
        multi obj=new multi();
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a value:");
        a=Integer.parseInt(scan.nextLine());
        System.out.println("enter a value:");
        b=Integer.parseInt(scan.nextLine());
        obj.ml(a, b);
        obj.div(a, b);
       }
}
