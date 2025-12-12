/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phichaiyut
 */
import java.util.*;
public class _13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        
        int ex = 0;
        int good = 0;
        int fair = 0;
        int poor = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for student " + (i + 1) + " : ");
            int score = input.nextInt();
            
            if (score >= 80) {
                ex += 1;
                System.out.println("Excellent");
            } else if (score >= 60 && score <= 79) {
                good += 1;
                System.out.println("Good");
            } else if (score >= 50 && score <= 59) {
                fair += 1;
                System.out.println("Fair");
            } else {
                poor += 1;
                System.out.println("Poor");
            }
            
        }
        
        
        System.out.println("Summary");
        System.out.println("Excellent: " + ex);
        System.out.println("Good: " + good);
        System.out.println("Fair: " + fair);
        System.out.println("Poor: " + poor);
    }
}
