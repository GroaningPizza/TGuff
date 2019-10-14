/**
 * CS 149 Exercise 6.3 Magic 8-Ball.
 *
 * @author Tyler Guffey 
 * @version 10/13/19
 */
public class NiftySpell {
    /**
     * Write a method named abecedarian that takes
     * a string and returns a boolean 
     * indicating whether the word is abecedarian. 
     * You may assume that the string will not be empty ("").
     * @while starts a loop 
     * @param word is an inputted value from a scanner 
     * @return true if yes, false if no
     */
    public static boolean abecedarian(String word) {
        int i = 0;
        char c = 'a';
        
        while (i < word.length()) {
            if (c > word.charAt(i)) {
                return false; 
            }
            c = word.charAt(i);
            i++;
        }
        return true; 
    }
            
        
            
    
    /**
     * Write a method named palindrome that takes a string and returns 
     * a boolean indicating whether the word is a palindrome. 
     * You may assume that the string will not be empty (""), 
     * and it will not have any spaces.
     * @param word is the input value
     * @return true if yes, false if no
     */

    public static boolean palindrome(String word) {
        String a = ""; 
    
        int n = word.length(); 
        
        for (int i = n - 1; i >= 0; i--) {
            a = a + word.charAt(i); 
        }
        return word.equalsIgnoreCase(a);
    }           
}


