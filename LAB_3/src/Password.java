/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String password = input.nextLine();
        
        if (password.equals("PASS2025")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Try again.");
        }
    }
}
