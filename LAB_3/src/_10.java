/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class _10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int odd = 0;
        int even = 0;
        
        
        while (number != -1){
            number = input.nextInt();
            
            if (number % 2 == 0){
                even += 1;
            } else {
                odd += 1;
            }
        }
        
        System.out.print("odd = " + odd + " and " + "Even number = " + even);
    }
}
