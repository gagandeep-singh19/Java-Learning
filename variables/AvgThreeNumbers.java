// Q-1 = In a program input 3 numbers A, B, C. You have to output the avg of these 3 numbers.
// HINT - Avg of N numbers is sum of those no. div by n.

import java.util.*;
public class AvgThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C )/3;

        System.out.println("average is :" + average);
    }
}
