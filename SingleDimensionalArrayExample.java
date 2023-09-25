public class SingleDimensionalArrayExample {
    public static void main(String[] args) {
        // declare an array of integers
        //int[] marks;
        // allocate memory to the array (this array can hold at most 5 integers)
       // marks = new int[5];

        // OR: we can use: int[] marks = new int[5];

        // to initialize the array, use: int[] marks = new int[]{10,20,30,40,50};
        int[] marks = new int[]{10,20,30,40,50};
        // use for loop to iterate through array
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // use for-each loop to iterate through the array
        for(int value : marks) {
            System.out.println(value);
        }
    }
}
