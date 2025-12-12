/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class _13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter GPA: ");
        double GPA = input.nextDouble();
        System.out.print("Enter family income: ");
        int income = input.nextInt();
        
        if (GPA >= 3.5) {
            if (income <= 15000) {
                System.out.println("You are eligible for the scholarship.");
            } else {
                System.out.println("You are not eligible for a scholarship.");
            }
        } else {
            System.out.println("You are not eligible for a scholarship.");
        }
    }
}
