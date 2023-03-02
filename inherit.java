import org.checkerframework.checker.units.qual.Length;

public class inherit {
    public static void main(String[] args){
        int num[]={2,7,8,11};
        sum obj = new sum();
        System.out.println(obj.sumTwo(num,9));
    }
    
}
class sum extends inherit{
    public int[] sumTwo(int[] arr,int target){
    int out[] = {};
    for(int i=0;i<arr.length-1;i++){
        if((arr[i]+arr[i+1])==(target)){
            out[i]=arr[i];
            out[i+1]=arr[i+1];
            break;
        }
    }
    return out;
    }
}