public class armstrong {
    public static void main(String[] args){
        int inputTempdigit=153;
        int temp,cubeSum=0,digit=0;
        temp=inputTempdigit;
        while(temp!=0){
            System.out.println("Current Number: "+temp);
            digit = temp%10;
            System.out.println("digit :"+digit);
            cubeSum=cubeSum+digit*digit*digit;
            System.out.println(cubeSum);
            temp/=10;
        }
        if(inputTempdigit==cubeSum){
            System.out.println("is a Armstrong Number "+inputTempdigit);
        }else{
            System.out.println("is not a Armstrong Number "+inputTempdigit);
        }
    }
}
