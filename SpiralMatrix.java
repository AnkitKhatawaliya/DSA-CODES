import java.util.Random;

public class SpiralMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 1;
        int[][] array = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                // array[i][j] = random.nextInt(10,20);
                array[i][j] = count++;
            }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }

        printSpiralMatrix(array);
    }

    private static void printSpiralMatrix(int[][] array) {
        int m = array.length;
        int n = array.length;
        int row = 0, col = 0;

        while (row < m && col < n) {
            for (int i = col; i < n; ++i) {
                System.out.print(array[row][i] + "   ");
            }
            row++;

            for (int i = row; i < m; ++i) {
                System.out.print(array[i][n - 1] + "   ");
            }
            n--;

            if (row < m) {
                for (int i = n - 1; i >= col; --i) {
                    System.out.print(array[m - 1][i] + "   ");
                }
                m--;
            }

            if (col < n) {
                for (int i = m - 1; i >= row; --i) {
                    System.out.print(array[i][col] + "   ");
                }
                col++;
            }
            System.out.println();
        }
    }
}
