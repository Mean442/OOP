/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;

public class _14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String _all = "";
        String _constant = "";
        while (true) {
            System.out.print("Enter a character: ");
            char n = input.next().charAt(0);

            if (n == 'z') {
                break;
            }
            if (n >= 97 & n <= 122) {
                _all += n;
                if (n != 'a' & n != 'e' & n != 'i' & n != 'o' & n != 'u') {
                    _constant += n;
                }
            } else {
                System.out.println("""
                                   Only lowercase a-z are allowed."nvalid input. 
                                   """);
            }

        }

        System.out.println("All characters entered: " + _all);
        System.out.println("Consonants only: " + _constant);
    }
}
