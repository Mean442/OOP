/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class _11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int num = input.nextInt();
        int total = 0;
        
        for (int i = 0; i < num; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            int price = input.nextInt();
            total += price;
        }
        System.out.println("Total = " + total);
        System.out.print("Enter amount paid: ");
        int paid = input.nextInt();
        int change = paid - total;
        System.out.println("change = " + change);
        
    }
}
