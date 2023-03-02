import org.checkerframework.checker.units.qual.Length;

public class second {
    public static void main(String[] args){
            String str1="vasanth";
            second obj = new second();
            System.out.println( obj.len(str1));

        }
        int len(String s){
            int total=0;
            for(int i=0;i<s.length();i++){
                // System.out.println(i);
                total+=1;
            }
            return total;
    }
    
}
