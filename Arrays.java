public class Arrays {
    public static void main(String[] Args) {

        // In order to declare an Array, we have to put [] square brackets in front of type variables

        int[] nums = {1,2,3,4,5};

        // We can also Initialize the blank array with given length but it will be blank and will not go out of bounds;

        int[] arr = new int[5];

        System.out.println(arr[0]); // Output: 0

        // We can also create objects or String arrays as demonstrated in Objects.java

        // Looping through the Array
        // 1. We can use that for loop with i variable and Array.length property
        
        // 2. For loop without the iteration variable..

        // Demonstrating the second method

        for (int x : nums) {
            System.out.println(x);
        }

        // Output : 1 2 3 4 5


        // Similarly, we can create multidimensional Array
        int[][] a = {{1,2,3},{4,5,6}};

        System.out.println(a[1][2]); // Output 6

        // import java.util.ArrayList which can create a resizable Array!
        
    }
}
