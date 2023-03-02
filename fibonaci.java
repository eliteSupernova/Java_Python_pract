public class fibonaci {
    public static void main(String[] args){
        fibo(7);

    }
    public static void fibo(int n){
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }

    }
    
}
