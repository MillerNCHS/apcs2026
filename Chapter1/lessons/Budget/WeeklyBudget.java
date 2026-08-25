
/**
 * Weekly Budget
 * Dr. Miller
 * Last Updated: 8/25/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class WeeklyBudget
{
    // Calculate weekly lunch spending and remaining money
    public static void main(String[] args) {
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Instantiate the Scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);
        
        // Read a String (Object)
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        // Read doubles (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the price of one school lunch: $");
        lunchPrice = scan.nextDouble();
        
        // Read an integer
        System.out.print("Enter the number of school lunches you ordered this week: ");
        lunchesPerWeek = scan.nextInt();
        
        // Perform calculations (Arithmetic expressions)
        totalCost = lunchPrice * lunchesPerWeek;
        remaining = allowance - totalCost;
        
        // printf allows placeholders for strings using %s
        System.out.printf("%n--- Weekly Budget Summary for %s ---%n", name);
        
        // Numbers are used in between % and s to give a string a certain number of characters
        // Spaces are used to pad the screen to fit the number of characters
        // A - will make the string left-aligned. It is right-aligned by default.
        System.out.printf("%-25s %s%n", "Weekly Allowance:", money.format(allowance));
        System.out.printf("%-25s %s%n", "Total Spent on Lunches:", money.format(totalCost));
        System.out.printf("%-25s %s%n", "Money Remaining:", money.format(remaining));
                
        
        
        
        
        
        
        
        
        
        
   }
}