package java_basics;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    var input = scanner.nextInt();
     Boolean state = (input == 0) ? true: false;

        if(input <= 5){
            System.out.println("your number must be more than 5 " + state);
            
        }else {
            System.out.println("your number is more that 5, good job.");
        }
        scanner.close();
    }

}
