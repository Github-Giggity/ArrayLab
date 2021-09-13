package edu.sdccd.cisc191;

/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Arisachi Tanaka
 */

public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet,0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet,0));
        int[] rowSums = allRowSums(spreadsheet);
        for(int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }

    }

    /**
     * @param a 2D array
     * @return the maximum value in the 2d parameter array a
     */
    public static int max(int[][] a) {
        //set and initialize to the first element, the smallest in the array
        int max=a[0][0];
        // nested for loop iterating from row then column one by one element
        for(int i=0; i<a.length; i++)
        {
            // column now
            for(int j=0; j<a[i].length; j++)
            {
                // everytime  check if the current element value is larger than the max
                if(a[i][j]>max)
                {
                    // if so change is to the new one
                    max=a[i][j];
                }
            }
        }
        // get the final product
        return max;
    }

    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
        // now initialize the sum  of the row as zero to start off
        int sum1=0;
        // for loop iterate through each row
        for (int i=0; i<a[x].length; i++)
        {
            // add up all the sum as it goes along
            sum1 +=a[x][i];
        }
        // return it
        return sum1;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        //  now initialize the sum  of the column as zero to start off
        int sum2=0;
        // for loop iterate through each column
        for (int i=0; i<a.length; i++) {
            // is it null, meaning whether there is only one column or not?
            try {
                // if not add it up
                sum2 += a[i][x];
            }
        // if it is through exception
            catch (Exception e) {}
        }
        // return the value
        return sum2;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {
        // make the array as  long as the row number
        int[] sums3=new int[a.length];
        // for loop go through each row
        for(int i=0; i<a.length; i++)
        {
            // resets the sum when new row starts
            int currentsumRow = 0;
            //now will iterate through the column
            for(int j=0; j<a[i].length; j++)
            {
            // as it goes through the column, make sure to add it to original row
                currentsumRow +=a[i][j];
            }
            //add it all up
            sums3[i]=currentsumRow;
        }
        // return the value
        return sums3;
    }
}
