import java.util.Arrays;
import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {

        reverse obj = new reverse();
        obj.palindrome("Manoj");


        // Scanner scan = new Scanner(System.in);
//         System.out.println("enter the string: ");
//         String inputStr=scan.nextLine();
//         String revStr="";
//         int len=inputStr.length();
//         for(int i=len-1;i>=0;i--){
//             revStr=revStr+inputStr.charAt(i);
//         }
//         System.out.println(inputStr);
//         System.out.println(revStr);
        
//         if(inputStr.equals(revStr)){
//             System.out.println("String is a Palindrome: "+inputStr);
//         }else{
//             System.out.println("String is not a palindrome "+inputStr);
        // }
    }
        public void palindrome(String input){
            input="MAdAM";
        StringBuffer rev=new StringBuffer();
        for(int i=input.length()-1;i>=0;i--){
        rev.append(input.charAt(i));
        }
        String revers=rev.toString();
        System.out.println(rev);
        if(input.toLowerCase().equals(revers.toLowerCase())){
        System.out.println("is a palindrome "+input);
        }else{
            System.out.println("is not a palindrome "+input);
        }
        // for(int i=input.length()-1;i>=0;i--){
        //         rev=rev+input.charAt(i);
        // }System.out.println(rev);
        // if(input.toLowerCase().equals(rev.toLowerCase())){
        //     System.out.println("a palindrome: "+input);
        // }else{
        //     System.out.println("not a palindrome: "+input);
        }

    }
//}

    

