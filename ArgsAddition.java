public class ArgsAddition {
    public static void main(String[] args){
        ArgsAddition obj=new ArgsAddition();
        obj.Add(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

    }
    public void Add(int a,int b){
        System.out.println(a+b);
    }
}
