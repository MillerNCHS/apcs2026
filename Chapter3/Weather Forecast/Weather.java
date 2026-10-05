
/**
 * Write a description of class Weather here.
 *
 * @author Dr. Miller
 * @version 10/2/2026
 */
public class Weather
{
    // Define an enum for fixed weather categories
    public enum WeatherType {
        Sunny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    
    public static void main(String[] args) {
        // Create a counter variable to count the number of rainy days
        int rainyDays = 0;
        
        // Array of all possible enum constants
        WeatherType[] options = WeatherType.values();
        
        // Header Parts:
        // Initializer (int day = 1)
        // Condition (day <= 7)
        // Mutator (day++)
        for (int day = 1; day <= 7; day++) {
            // Pick a random index from 0 to the length of our enum
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            // Day #: Weather
            System.out.println("Day "+day+": "+today);
            
            // Enums are compared using == because they are ints
            if (today == WeatherType.Rainy) {
                rainyDays++;
            }
        }
        
            System.out.println("There are "+rainyDays+" days of rain in the forecast.");
            
            System.out.println("All Supported Weather Types:");
            
            // An enhanced for loop (for-each loop)
            // iterates directly through EVERY element in WeatherType.values()
            for (WeatherType w: WeatherType.values()) {
                System.out.println("Category: "+ w);
            }
            
        
        
        
        
    }
    
    
    
    
    
    
}