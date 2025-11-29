// FIND THE LAST DIGIT OF A NUMBER 

import java.util.*;
public class LastDigitFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER A NUMBER :");
        int number = sc.nextInt();

        int lastdigit = number % 10;
        System.out.println("Last digit is : " +lastdigit);
    }
}