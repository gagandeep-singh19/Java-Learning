//BMI CALCULATE

import java.util.*;
public class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER WEIGHT (KG) :");
        double weight = sc.nextDouble();

        System.out.println("ENTER HEIGHT (meters) :");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println(BMI);
    }
}
