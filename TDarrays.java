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
//Nested loop for the 2D array
        for (int j = 0; j < grades[0].length; j++){
            System.out.println(grades[0][j]);
        }

        for (int j = 0; j < grades[1].length; j++){
            System.out.println(grades[1][j]);
        }

        for (int j = 0; j < grades[2].length; j++){
            System.out.println(grades[2][j]);
        }

/**
 * A faster way to initialize the array by putting the arrays bundled in a 2D Array
 */

int [][] temperatures = {
        {98, 90, 93, 92},
        {101, 103, 110, 101},
        {90, 99, 100, 105},
};
//Nested loop for the 2D array
        for (int j = 0; j < temperatures[0].length; j++){
            System.out.println(temperatures[0][j]);
        }
        System.out.println(temperatures[1][3]);

///The correct way to do loops with a 2D Array
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println(grades[i][j]);
            }
        }

        /**
         * Using a nested loop to print the values of the array
         *
         *
         * for (int j = 0; j < grades[0].length; j++){
         *             System.out.println(grades[0][j]);
         *         }
         *
         *         This way is not recommended because wrting a loop for every row can get messy, so
         *         a nested loop is best
         *             for (int j = 0; j < grades[0].length; j++){
         *             System.out.println(grades[0][j]);
         *         }
         *
         *         for (int j = 0; j < grades[1].length; j++){
         *             System.out.println(grades[1][j]);
         *         }
         *
         *         for (int j = 0; j < grades[2].length; j++){
         *             System.out.println(grades[2][j]);
         *         }
         *
         * example will be:
         * for (int i = 0; i < grades.length; i++) {
         * for  (int j = 0; j < grades[i].length; j++){
         * println(grades[i][j]);
         * }
         * }
         *
         */


    }
}
