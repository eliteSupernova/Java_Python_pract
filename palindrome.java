public class palindrome {
    public static void main(String[] args){
        palindrome obj=new palindrome();

        obj.pal(123456);

    }public void pal(int a){
        int inputTempdigit=a;
        int temp=inputTempdigit,digit=0;
        while(temp!=0){
            digit=temp%10;
            System.out.println(digit+"");
            temp/=10;


}System.out.println(Integer.toString(digit));
}
}