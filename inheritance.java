public class inheritance {
    public static void main(String[] args){
        A obj = new A();
        // System.out.println(obj);
        B objb = new B();
        // System.out.println(objb);
    }
    
}class A extends inheritance{
    A(){System.out.println("A!");}
}
class B extends A{
    B(){System.out.println("B!");}
}
