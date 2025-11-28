// Q-3 = ENTER A COST OF THREE ITEMS FROM THE USER (USING FLOAT) PENCIL,PEN AND ERASER .
//  YOU HAVE TO OUTPUT THE TOTAL COST . ADD = ALSO TRYING 18% GST TAX.

import java.util.*;
public class TotalCostWithGST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = (pencil + pen + eraser);
        System.out.println("The total cost of three items :" +total);

        float newtotal = total + (0.18f*total);
        System.out.println("Total Cost After Adding GST :"+newtotal);
    }
}