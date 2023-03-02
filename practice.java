import java.lang.reflect.Array;
import java.util.Scanner;

import com.google.errorprone.annotations.Var;
public class practice {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        // System.out.print("enter your name:");
        // String name= input.nextLine();
        // System.out.println(name.toUpperCase());
        // char characters[] = name.toCharArray();
        // for(int i=0;i<name.length();i++){
            // System.out.println(characters[i]);
        // System.out.println(square(2,2));
    
        // System.out.println(square(3,3));
        // int[] arr=Even(8);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // int n=6;
        // for(int i=0;i<n;i++){
        //     System.out.println(" "**(n-i-1)+"*"**(i));
        // }


        }
        // public static int square(int a,int b){
        //     int c;
        //     System.out.println(a+" "+"to the power "+b+" is ");
        //     return ((int)(Math.pow(a,b)));
        
        int[] Even(int n){
            int x[]=new int[n+1];
            for(int i=0;i<n;i++){
                if(i%2==0){
                    x[i]=i;
                }
            }
            return x;
        }
    }
    
