/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class _12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of digits: ");
        int  number = input.nextInt();
        String code = "";
        for (int i = 0; i < number; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            char digit = input.next().charAt(0);
            code = code + digit;
            
        }
         
        System.out.println("Result = " + code);
    }
}

