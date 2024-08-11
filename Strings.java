public class Strings {

    // Creating a function to avoid using this long ass line again and again......
    public static void Display(String arg) {
        System.out.println(arg);
    }

    public static void main(String[] Args) {
        
        String something = "Something";
        Display(something); // Output Something

        // Printing the length
        System.out.println("Length: "+something.length()); // Output: 9

        // Displays a specific char at the given index
        Display(String.valueOf(something.charAt(0))); // Output: S
        // The reason why I had to use String.valueOf is because the .charAt() function returns char instead of one String.
      
        // Combining 2 Strings (use concat function multiple times to combine it in case of more than 2 strings)
        String str = " is here!";
        Display(something.concat(str)); // Output: Something is here!
        
        // String Slicing
        Display(something.substring(4)); // Output: thing


        // Looping through the String...

        // Inorder to loop through, we can only do it with for loop, iteration variable, charAt() function and String.ValueOf in order to check each character (in String type) in String
        

    };

    

}
