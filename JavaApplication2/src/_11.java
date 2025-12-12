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
        
        System.out.print("Input your money : ");
        int money = input.nextInt();
        input.nextLine();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char bank = input.next().charAt(0);
        double interest;
        interest = 0;
        
        if (bank == 'A') {
            interest = 0.015;
        } else if (bank == 'B') {
            interest = 0.02;
        } else if (bank == 'C') {
            interest = 0.015;
        } else if (bank == 'X') {
            interest = 0.05;
        }
        
        double total;
        total = money + (money * interest);
        System.out.println("Your total money in one year = " + total);
    }
}
