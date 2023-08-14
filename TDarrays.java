import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {

        /**
         * To create a 2D Array you need to create a tutera, write the data you're storing with two brackets
         *
         * Example:
         *  int [] [] integers = new int [3][4];
         *  the first bracket is the number of rows and the second bracket is the number of elements per row
         *
         */

        int [] [] grades = new int [3][4];
        grades[0][0] = 72;
        grades[0][1] = 76;
        grades[0][2] = 78;
        grades[0][3] = 74;

        grades[1][0] = 62;
        grades[1][1] = 66;
        grades[1][2] = 68;
        grades[1][3] = 64;

        grades[2][0] = 92;
        grades[2][1] = 96;
        grades[2][2] = 98;
        grades[2][3] = 94;

        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));
/**
 * A faster way to initialize the array by putting the arrays bundled in a 2D Array
 */

int [][] temperatures = {
        {98, 90, 93, 92},
        {101, 103, 110, 101},
        {90, 99, 100, 105},
};

        System.out.println(temperatures[1][3]);


    }
}
