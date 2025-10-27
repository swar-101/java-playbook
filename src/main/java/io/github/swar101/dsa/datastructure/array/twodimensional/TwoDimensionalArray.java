package io.github.swar101.dsa.datastructure.array.twodimensional;

// TODO: Review this one as soon as you find time.
public class TwoDimensionalArray {

    // row sum
    // col sum
    // transpose
    // rotate 90 clockwise
    // rotate 90 anti-clockwise
    // diagonals
    // anti diagonals

    public int[] calculateRowSum(int[][] arr) {
        int[] rowSumArray = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[0].length; col++) {
                sum += arr[row][col];
                rowSumArray[row] = sum;
            }
        }
        return rowSumArray;
    }

    public int[] calculateColumnSum(int[][] arr) {
        int[] colSumArray = new int[arr[0].length];
        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int[] ints : arr) {
                sum += ints[col];
                colSumArray[col] = sum;
            }
        }
        return colSumArray;
    }

    public int[][] transpose(int[][] arr) {
        int rowSize = arr.length;
        int colSize = arr[0].length;

        if (rowSize == colSize) {
            for (int row = 0; row < rowSize; row++) {
                for (int col = row + 1; col < colSize; col++) {
                    int temp = arr[row][col];
                    arr[row][col] = arr[col][row];
                    arr[col][row] = temp;
                }
            }
            return arr;
        } else {
            int[][] transposed = new int[colSize][rowSize];
            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < colSize; col++) {
                    transposed[col][row] = arr[row][col];
                }
            }
            return transposed;
        }
    }

    public int[][] rotateClockwise(int[][] arr) {
        int[][] transposed = transpose(arr);

        for (int row = 0; row < transposed.length; row++) {
            reverse(transposed[row]);
        }

        return transposed;
    }

    public int[][] rotateAntiClockwise(int[][] arr) {
        int[][] transposed = transpose(arr);
        int left = 0;
        int right = transposed.length - 1;

        while (left < right) {
            int[] temp = transposed[left];
            transposed[left] = transposed[right];
            transposed[right] = temp;
            left++;
            right--;
        }

        return transposed;
    }

    public int[][] getAntiDiagonals(int[][] arr) {

        return null;
    }

    private void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}