package java_basics;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        var input = scanner.nextInt();


        switch(input){
            case 0 : System.out.println(input + " = 0"); break;
            case 5: System.out.println(input + "  == 5"); break;
            default: System.out.println(" wrong value");
        }
        scanner.close();
    }
}
