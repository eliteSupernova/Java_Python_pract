public class sort {
    public static void main(String[] args){
    
       int arr[]=new int[] {1,4,7,9,6,0};
       int temp=0;
       
       for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
       }
       System.out.println("\n");
    

       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){ 
        if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
        }
       }
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");

    }
}
