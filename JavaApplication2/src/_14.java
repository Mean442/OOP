/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature (°C): ");
        double temp = input.nextDouble();
        System.out.print("Enter humidity (%): ");
        int hu = input.nextInt();

        if (temp > 37.5) {
            System.out.println("Warning: High temperature!");
        } else {
            System.out.println("Temperature normal.");
        }

        if (hu > 80) {
            System.out.println("Humidity is too high.");
        } else {
            System.out.println("Humidity is acceptable.");
        }
    }
}
