import java.util.Arrays;

public class twoSum {
    public static void main(String[] args){
        int[] num={2,5,5,11};
        int target=10;
        // twoSum obj = new twoSum();
        
        System.out.println(Arrays.toString(sumTwo(num,target)));
        //System.out.println("+");
        }
    public static int[] sumTwo(int[] arr,int target){
        int out[] =new int[2];
        int len=arr.length;
        // int [] newarr=new int[arr.length+1];
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<len;i++){
            int a = arr[i];
            for(int j=i+1;j<len;j++){
                int b =arr[j];
            if((a+b)==(target)){
                out[0]=i;
                out[1]=j;
                return out;
                // System.out.println(a+" "+arr[i]);
            }
        }
    }return out;
        //     for(int i=0;i<out.length;i++){
        //         System.out.println(out[i]);
            // return out;
        }
    }

    


