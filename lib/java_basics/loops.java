package java_basics;

import java.util.Scanner;

public class loops
 {
     public static void main(String[] arg){
         //for loop
         System.out.println(" ################# With For Loop ############### ");
        for (int i =0; i<5;i++ ){
            System.out.println("x now == " + i);
            
        } 
        System.out.println(" ################# With while Loop ############### ");
         // while loop
        int x  = 0;
        while(x <= 5){
            System.out.println("x now == " + x);
            x ++;
        }
        // do while loop
        var scanner = new Scanner(System.in);
        String password;
        System.out.println(" ################# Example on Do while ############### ");
        do{
            System.out.print("Enter your Password: ");

             password  = scanner.nextLine();
             if(password.length() <= 6){
                 System.out.println("Your password must be greater than 6 character.");
             }else {
                 System.out.println("Your password is accepted ^_^");
             }
            
        }while(password.length() <= 6);
        scanner.close();

        
     }
}
    

