/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salary = input.nextDouble();
        double tax;
        if (salary >= 50000) {
            tax = salary * 0.1;
        }
        else {
            tax = salary * 0.05;
        }
        
        System.out.println(tax);
    }
}
