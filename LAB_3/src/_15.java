/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */

import java.util.*;
public class _15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberofdepost = 0;
        int total_amout =  0;
        while (true) {
            System.out.print("Enter deposit amount: ");
            int depost = input.nextInt();
            total_amout += depost;
            numberofdepost += 1;
            
            if (total_amout >= 1000) {
                System.out.println("Target reached!");
                break;
            }
            
        }
        
        System.out.println("Total amount saved = " + total_amout);
        System.out.println("Number of deposits = "+ numberofdepost);
    }
}


