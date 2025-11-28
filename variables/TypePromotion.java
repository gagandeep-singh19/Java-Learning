// TYPE PROMOTION 
// JAVA AUTOMATICALLY PROMOTES EACH BYTE , SHORT , CHAR OPERAND TO INT WHEN EVALUATING AN EXPRESSION.

import java.util.*;
public class TypePromotion {
public static void main(String[] args){
    char a = 'a';
    char b = 'b';
    System.out.println((int)(a));
    System.out.println((int)(b));
    System.out.println(b-a);

    // IF ONE OPERAND IS LONG FLOAT OR DOUBLE THE WHOLE EXPRESSION IS PROMOTED TO LONG GLOAT OR DOUBLE.

    int A = 10;
    float B = 20.25f;
    long C = 35;
    double D = 70.87;

    double ans = A+B+C+D;
    System.out.println(ans);
}
}



