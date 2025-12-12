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
        System.out.print("Please insert your name : ");
        String name = input.nextLine();
        System.out.print("Please insert your age  : ");
        int age = input.nextInt();
        System.out.print("Please insert number of working days  : ");
        int numDay1 = input.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = input.nextInt();
        System.out.print("Please insert your body weight  : ");
        int weight = input.nextInt();
        
        int salary;
        salary = 0;
        if (age >= 21 && age <= 30) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if (age >= 31 && age <= 40) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if (age >= 41 && age <= 50) {
            salary = (numDay1 * 1000) - (numDay2 * 25) ;
        } else if (age >= 51 && age <= 60) {
            salary = (numDay1 * 3000) ;
        }
        
        int salary_bonus = salary;
        if (weight >= 10 && weight <= 60) {
            salary_bonus = salary + 5000;
        } else if (weight >= 61 && weight <= 90) {
            salary_bonus = salary + (5000 - (weight - 60) * 10);
        }
        
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary);
        System.out.println("Your salary and bonus is " + salary_bonus + " Baht");
    }
}
