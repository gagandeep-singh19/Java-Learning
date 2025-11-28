// Q-2 = In a program , input a side of square .You have to output the area of the square.
// HINT - Area of Square (side*side)

import java.util.*;
public class AreaofSquare {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;

        System.out.println("area of the square :"+area);
    }
}