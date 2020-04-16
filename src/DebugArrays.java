public class DebugArrays {
    public static void main(String[] args) {

// Loop through that array and sum the numbers 1-10, then print that total to the screen.
        int numList [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + numList[i];
        }
        System.out.println("The total of the numbers is " + total);
    }
}
